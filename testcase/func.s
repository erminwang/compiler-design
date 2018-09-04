#-------------------------------------
# L_1		LABEL	0	0
# L_2		LABEL	0	48
# L_3		LABEL	0	80
# L_4		LABEL	0	112
# L_5		LABEL	0	160
# L_6		LABEL	0	176
# L_7		LABEL	0	192
# "i = %d\n"		STR	0	208
# L_8		LABEL	0	224
# L_9		LABEL	0	272
# L_10		LABEL	0	288
# L_11		LABEL	0	336
# L_12		LABEL	0	352
# L_13		LABEL	0	368
# L_14		LABEL	0	384
# L_15		LABEL	0	416
# L_16		LABEL	0	432
# "p = %d\n"		STR	0	448
# L_17		LABEL	0	464
# L_18		LABEL	0	480
# L_19		LABEL	0	496
# L_20		LABEL	0	544
# L_21		LABEL	0	560
# L_22		LABEL	0	576
# L_23		LABEL	0	592
#-------------------------------------
#-------------------------------------
# main		VOID	0	0
# 608		INT	0	608
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
# i		INT	0	16
# p		INT	0	32
# 1		INT	0	64
# 1		INT	0	96
# 100		INT	0	128
# t_0		BOOLEAN	0	144
#-------------------------------------
#-------------------------------------
# printf		STR	0	240
# 2		INT	0	256
# 9		INT	0	304
# t_1		BOOLEAN	0	320
# t_2		INT	0	400
# 1		INT	0	512
# t_3		INT	0	528
#-------------------------------------
#-------------------------------------
#-------------------------------------
.globl main
.data
str208: .asciz "i = %d\n"
str448: .asciz "p = %d\n"
.text

#main:   
main: push %rbp
mov %rsp, %rbp


#L_1: 608 frame 
L_1: sub $608, %rsp


#L_2: p = 1 = 
L_2: mov $1, %rax
mov %rax, -32(%rbp)


#L_3: i = 1 = 
L_3: mov $1, %rax
mov %rax, -16(%rbp)


#L_4: t_0 = i cmp 100
L_4: mov -16(%rbp), %rax
mov $100, %rbx
cmp %rax, %rbx
mov %rax, -144(%rbp)


#L_5: L_7 = t_0 jg 
L_5: jg L_7


#L_6: L_22 = t_0 jle 
L_6: jle L_22


#L_7: "i = %d\n" rdi 
L_7: mov $str208, %rdi


#L_8: i rsi 
L_8: mov -16(%rbp), %rsi


#L_9:  = printf call 2
L_9: call printf


#L_10: t_1 = i cmp 9
L_10: mov -16(%rbp), %rax
mov $9, %rbx
cmp %rax, %rbx
mov %rax, -320(%rbp)


#L_11: L_13 = t_1 jle 
L_11: jle L_13


#L_12: L_14 = t_1 jg 
L_12: jg L_14


#L_13: L_22 goto 
L_13: jmp L_22


#L_14: t_2 = p * i
L_14: mov -32(%rbp), %rax
mov -16(%rbp), %rbx
mulq %rbx
mov %rax, -400(%rbp)


#L_15: p = t_2 = 
L_15: mov -400(%rbp), %rax
mov %rax, -32(%rbp)


#L_16: "p = %d\n" rdi 
L_16: mov $str448, %rdi


#L_17: p rsi 
L_17: mov -32(%rbp), %rsi


#L_18:  = printf call 2
L_18: call printf


#L_19: t_3 = i + 1
L_19: mov -16(%rbp), %rax
mov $1, %rbx
add %rbx, %rax
mov %rax, -528(%rbp)


#L_20: i = t_3 = 
L_20: mov -528(%rbp), %rax
mov %rax, -16(%rbp)


#L_21: L_4 goto 
L_21: jmp L_4


#L_22: 608 ret 
L_22: add $608, %rsp
pop %rbp
ret

