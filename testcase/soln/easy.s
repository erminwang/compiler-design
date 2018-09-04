#-------------------------------------
# L_1		LABEL	0	0
# L_2		LABEL	0	48
# L_3		LABEL	0	80
# L_4		LABEL	0	128
# L_5		LABEL	0	144
# "%d\n"		STR	0	160
# L_6		LABEL	0	176
# L_7		LABEL	0	208
# L_8		LABEL	0	224
# L_9		LABEL	0	240
#-------------------------------------
#-------------------------------------
# main		VOID	0	0
# 256		INT	0	256
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
# i		INT	0	16
# j		INT	0	32
# 2		INT	0	64
# 2		INT	0	96
# t_0		INT	0	112
# printf		STR	0	192
#-------------------------------------
.globl main
.data
str160: .asciz "%d\n"
.text

#main:   
main: push %rbp
mov %rsp, %rbp


#L_1: 256 frame 
L_1: sub $256, %rsp


#L_2: i = 2 = 
L_2: mov $2, %rax
mov %rax, -16(%rbp)


#L_3: t_0 = 2 * i
L_3: mov $2, %rax
mov -16(%rbp), %rbx
mulq %rbx
mov %rax, -112(%rbp)


#L_4: j = t_0 = 
L_4: mov -112(%rbp), %rax
mov %rax, -32(%rbp)


#L_5: "%d\n" rdi 
L_5: mov $str160, %rdi


#L_6: j rsi 
L_6: mov -32(%rbp), %rsi


#L_7:  = printf call 2
L_7: call printf


#L_8: 256 ret 
L_8: add $256, %rsp
pop %rbp
ret

