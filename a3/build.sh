java -jar /home/erminwang/antlr-4.5.3-complete.jar Cmpt379Compiler.g4 \
&& javac Cmpt379Compiler*.java \
&& java org.antlr.v4.gui.TestRig Cmpt379Compiler prog eval_test_cases/ques/continue.txt