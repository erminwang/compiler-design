#-------------------------------------
# L_1		LABEL	0	0
# L_2		LABEL	0	16
# "hello world\n"		STR	0	32
# L_3		LABEL	0	80
# L_4		LABEL	0	96
# L_5		LABEL	0	112
#-------------------------------------
#-------------------------------------
# main		VOID	0	0
# 128		INT	0	128
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
# printf		STR	0	48
# 1		INT	0	64
#-------------------------------------
.globl main
.data
str32: .asciz "hello world\n"
.text

#main:   
main: push %rbp
mov %rsp, %rbp


#L_1: 128 frame 
L_1: sub $128, %rsp


#L_2: "hello world\n" rdi 
L_2: mov $str32, %rdi


#L_3:  = printf call 1
L_3: call printf


#L_4: 128 ret 
L_4: add $128, %rsp
pop %rbp
ret

