#-------------------------------------
# L_1		LABEL	0	0
# L_2		LABEL	0	48
# L_3		LABEL	0	80
# L_4		LABEL	0	112
# L_5		LABEL	0	160
# L_6		LABEL	0	176
# "i = %d\n"		STR	0	192
# L_7		LABEL	0	208
# L_8		LABEL	0	256
# L_9		LABEL	0	272
# L_10		LABEL	0	320
# L_11		LABEL	0	336
# L_12		LABEL	0	352
# L_13		LABEL	0	368
# L_14		LABEL	0	400
# L_15		LABEL	0	416
# "p = %d\n"		STR	0	432
# L_16		LABEL	0	448
# L_17		LABEL	0	464
# L_18		LABEL	0	480
# L_19		LABEL	0	496
# L_20		LABEL	0	512
# L_21		LABEL	0	528
#-------------------------------------
#-------------------------------------
# main		VOID	0	0
# 544		INT	0	544
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
# i		INT	0	16
# p		INT	0	32
# 1		INT	0	64
# 1		INT	0	96
# 100		INT	0	128
# t_0		INT	0	144
#-------------------------------------
#-------------------------------------
# printf		STR	0	224
# 2		INT	0	240
# 9		INT	0	288
# t_1		BOOLEAN	0	304
# t_2		INT	0	384
#-------------------------------------
#-------------------------------------
#-------------------------------------
.globl main
.data
str192: .asciz "i = %d\n"
str432: .asciz "p = %d\n"
.text

#main:   
main: push %rbp
mov %rsp, %rbp


#L_1: 544 frame 
L_1: sub $544, %rsp


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


#L_5: L_20 = t_0 jle 
L_5: jle L_20


#L_6: "i = %d\n" rdi 
L_6: mov $str192, %rdi


#L_7: i rsi 
L_7: mov -16(%rbp), %rsi


#L_8:  = printf call 2
L_8: call printf


#L_9: t_1 = i cmp 9
L_9: mov -16(%rbp), %rax
mov $9, %rbx
cmp %rax, %rbx


#L_10: L_12 = t_1 jle 
L_10: jle L_12


#L_11: L_13 = t_1 jg 
L_11: jg L_13


#L_12: L_20 goto 
L_12: jmp L_20


#L_13: t_2 = p * i
L_13: mov -32(%rbp), %rax
mov -16(%rbp), %rbx
mulq %rbx
mov %rax, -384(%rbp)


#L_14: p = t_2 = 
L_14: mov -384(%rbp), %rax
mov %rax, -32(%rbp)


#L_15: "p = %d\n" rdi 
L_15: mov $str432, %rdi


#L_16: p rsi 
L_16: mov -32(%rbp), %rsi


#L_17:  = printf call 2
L_17: call printf


#L_18: i = i + 1
L_18: mov -16(%rbp), %rax
mov $1, %rbx
add %rbx, %rax
mov %rax, -16(%rbp)


#L_19: L_4 goto 
L_19: jmp L_4


#L_20: 544 ret 
L_20: add $544, %rsp
pop %rbp
ret

