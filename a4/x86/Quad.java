package x86;

	public class Quad {

		Symbol label;
		String op;
		Symbol src1;
		Symbol src2;
		Symbol dst;


		public Quad (SymStack s, int l, Symbol d, Symbol s1, Symbol s2, String o) {
			label = s.Add(l);
			dst = d;
			src1 = s1;
			src2 = s2;
			op = o;
		}

		public Quad (Symbol l) {
			label = l;
			dst = null;
			src1 = null;
			src2 = null;
			op = "";
		}

		public void BackPatch (Symbol l) {
			dst = l;
		}

		public void BackPatchSrc2 (Symbol l) {
			src2 = l;
		}

		public Symbol GetLabel () {
			return label;
		}

		public void Print () {
			System.out.print(label.GetName() + ": ");
			if (dst != null) System.out.print(dst.GetName());
			if (src1 != null) System.out.print(" = " + src1.GetName());
			System.out.print(" " + op + " ");
			if (src2 != null) System.out.print(src2.GetName());
			System.out.println("");
		}

		public void AsmPrint () {

			System.out.print(label.GetName() + ": ");    // Print label such as #main:


			if (op.equals("")) { //label for function
				/**
				 * First we push the old base pointer onto the stack to save it for later.
				 * Then we copy the value of the stack pointer to the base pointer.
				 * After this, %rbp points to the base of main‘s stack frame.
				 */
				System.out.println("push %rbp");
				System.out.println("mov %rsp, %rbp");
			} else if (op.equals("frame")) {
				/**
				 * reserve space for parameters
				 */
				System.out.println("sub " + dst.AsmPrint() + ", %rsp");
			} else if (op.equals("ret")) { //return
				if (src1 != null) System.out.println("mov -" + src1.GetOffset() + "(%rbp), %rax");
				System.out.println("add $" + dst.GetName() + ", %rsp");
				System.out.println("pop %rbp");
				System.out.println("ret");
			} else if (op.equals("=")) { //assignment
				ReadSrc1(src1);
				WriteDst(dst);
			} else if (op.equals("+")) { //addition
				ReadSrc1(src1);
				ReadSrc2(src2);
				Compute("add");
				WriteDst(dst);
			} else if (op.equals("-")){
				ReadSrc1(src1);
				ReadSrc2(src2);
				Compute("sub");
				WriteDst(dst);
			} else if (op.equals("*")){
				ReadSrc1(src1);
				ReadSrc2(src2);
				Compute("mulq");
				WriteDst(dst);
			} else if (op.equals("/")){
				System.out.println("mov $0, %rdx");
				ReadSrc1(src1);
				ReadSrc2(src2);
				Compute("idiv");
				WriteDst(dst);
			} else if(op.equals("call")|| op.equals("callexp")){
				System.out.println("call "+src1.GetName());
				if (op.equals("callexp")){
					System.out.println("mov %rax, " + dst.AsmPrint());
				}
			} else if (op.equals("rdi")||op.equals("rsi")||op.equals("rdx")||op.equals("rcx")||op.equals("r8")||op.equals("r9")){
				System.out.println("mov "+ dst.AsmPrint() + ", %"+op);
			} else if (op.length() >= 5 && op.substring(0,5).equals("push ")){
				int numParams = 0;
				String registerType = op.substring(6,op.length());
				switch (registerType) {
					case "rdi":
						numParams = 1;
						break;
					case "rsi":
						numParams = 2;
						break;
					case "rdx":
						numParams = 3;
						break;
					case "rcx":
						numParams = 4;
						break;
					case "r8":
						numParams = 5;
						break;
					case "r9":
						numParams = 6;
						break;
					default:
						numParams = 0;
				}
				System.out.println("mov %" + registerType + ", -"+ numParams*16+"(%rbp)");
			} else if (op.equals("cmp")){
				ReadSrc1(src1);
				ReadSrc2(src2);
				Compute("cmp");
				WriteDst(dst);
			} else if (op.equals("jl") || op.equals("jge") || op.equals("jg") || op.equals("jle") || op.equals("je") || op.equals("jne")){
				System.out.println(op + " "+dst.GetName());
			} else if (op.equals("goto")){
				System.out.println("jmp"+" "+dst.GetName());
			} else if (op.equals("[]")){
				ReadSrc1(src1);
				ReadSrc2(src2);
				Compute("add");
				System.out.println("mov (%rax), %rbx");
				System.out.println("mov %rbx, "+dst.AsmPrint());
			} else if (op.equals("[]=")){
				ReadSrc1(dst);
				ReadSrc2(src1);
				Compute("add");
				System.out.println("mov "+ src2.AsmPrint()+", %rbx");
				System.out.println("mov %rbx, (%rax)");
			} else if (dst!=null) {
				System.out.println("mov "+dst.AsmPrint()+", %"+op);
			}
		}

		void Compute (String opcode) {
			if (opcode.equals("cmp")){
				System.out.println(opcode + " %rax, %rbx");
			}
			else if (opcode.equals("mulq")||opcode.equals("idiv")){
				System.out.println(opcode + " %rbx");
			}
			else{
				System.out.println(opcode + " %rbx, %rax");
			}
		}

		void ReadSrc1 (Symbol src) {
			System.out.println("mov " + src.AsmPrint() + ", %rax");
		}

		void ReadSrc2 (Symbol src) {
			System.out.println("mov " + src.AsmPrint() + ", %rbx");
		}

		void WriteDst (Symbol dst) {
			System.out.println("mov %rax, " + dst.AsmPrint());
		}



	}
