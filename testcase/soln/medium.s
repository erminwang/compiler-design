#-------------------------------------
# 10		INT	0	0
# a		INT	10	16
# L_1		LABEL	0	0
# L_2		LABEL	0	32
# L_3		LABEL	0	64
# L_4		LABEL	0	80
# L_5		LABEL	0	128
# L_6		LABEL	0	144
# L_7		LABEL	0	160
# "%d is a positive number\n"		STR	0	176
# L_8		LABEL	0	192
# L_9		LABEL	0	240
# L_10		LABEL	0	256
# L_11		LABEL	0	272
# "%d is a negative number\n"		STR	0	288
# L_12		LABEL	0	304
# L_13		LABEL	0	352
# L_14		LABEL	0	368
# L_15		LABEL	0	384
# L_16		LABEL	0	0
# L_17		LABEL	0	16
# L_18		LABEL	0	96
# L_19		LABEL	0	112
# L_20		LABEL	0	176
# L_21		LABEL	0	192
# L_22		LABEL	0	224
# L_23		LABEL	0	240
# L_24		LABEL	0	256
# L_25		LABEL	0	272
#-------------------------------------
#-------------------------------------
# fun		VOID	0	32
# 400		INT	0	400
# main		VOID	0	416
# 288		INT	0	288
#-------------------------------------
#-------------------------------------
# n		INT	0	16
# m		INT	0	48
#-------------------------------------
#-------------------------------------
# 0		INT	0	96
# t_0		BOOLEAN	0	112
#-------------------------------------
#-------------------------------------
# printf		STR	0	208
# 2		INT	0	224
#-------------------------------------
#-------------------------------------
# printf		STR	0	320
# 2		INT	0	336
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
# 2		INT	0	32
# t_1		INT	0	48
# 8		INT	0	64
# 16		INT	0	80
# 2		INT	0	128
# t_2		INT	0	144
# t_3		INT	0	160
# 10		INT	0	208
#-------------------------------------
.globl main
.data
a: .quad 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
str176: .asciz "%d is a positive number\n"
str288: .asciz "%d is a negative number\n"
.text

#fun:   
fun: push %rbp
mov %rsp, %rbp


#L_1: 400 frame 
L_1: sub $400, %rsp


#L_2:  push %rdi 
L_2: mov %rdi, -16(%rbp)


#L_3:  push %rsi 
L_3: mov %rsi, -48(%rbp)


#L_4: t_0 = n cmp 0
L_4: mov -16(%rbp), %rax
mov $0, %rbx
cmp %rax, %rbx


#L_5: L_7 = t_0 jle 
L_5: jle L_7


#L_6: L_11 = t_0 jg 
L_6: jg L_11


#L_7: "%d is a positive number\n" rdi 
L_7: mov $str176, %rdi


#L_8: m rsi 
L_8: mov -48(%rbp), %rsi


#L_9:  = printf call 2
L_9: call printf


#L_10: L_14 goto 
L_10: jmp L_14


#L_11: "%d is a negative number\n" rdi 
L_11: mov $str288, %rdi


#L_12: n rsi 
L_12: mov -16(%rbp), %rsi


#L_13:  = printf call 2
L_13: call printf


#L_14: 400 ret 
L_14: add $400, %rsp
pop %rbp
ret


#main:   
main: push %rbp
mov %rsp, %rbp


#L_16: 288 frame 
L_16: sub $288, %rsp


#L_17: t_1 = 2 * 8
L_17: mov $2, %rax
mov $8, %rbx
mulq %rbx
mov %rax, -48(%rbp)


#L_18: a = t_1 []= 16
L_18: mov $a, %rax
mov -48(%rbp), %rbx
add %rbx, %rax
mov $16, %rbx
mov %rbx, (%rax)


#L_19: t_2 = 2 * 8
L_19: mov $2, %rax
mov $8, %rbx
mulq %rbx
mov %rax, -144(%rbp)


#L_20: t_3 = a [] t_2
L_20: mov $a, %rax
mov -144(%rbp), %rbx
add %rbx, %rax
mov (%rax), %rbx
mov %rbx, -160(%rbp)


#L_21: t_3 rdi 
L_21: mov -160(%rbp), %rdi


#L_22: 10 rsi 
L_22: mov $10, %rsi


#L_23:  = fun call 2
L_23: call fun


#L_24: 288 ret 
L_24: add $288, %rsp
pop %rbp
ret

