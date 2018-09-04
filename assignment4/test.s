#-------------------------------------
# 100		INT	0	0
# a		INT	100	16
# L_1		LABEL	0	0
# L_2		LABEL	0	32
# L_3		LABEL	0	48
# L_4		LABEL	0	96
# L_5		LABEL	0	112
# L_6		LABEL	0	128
# "%d bigger than 0\n"		STR	0	144
# L_7		LABEL	0	160
# L_8		LABEL	0	208
# L_9		LABEL	0	224
# L_10		LABEL	0	240
# "%d smaller than 0\n"		STR	0	256
# L_11		LABEL	0	272
# L_12		LABEL	0	320
# L_13		LABEL	0	336
# L_14		LABEL	0	352
# L_15		LABEL	0	0
# L_16		LABEL	0	64
# L_17		LABEL	0	96
# L_18		LABEL	0	144
# L_19		LABEL	0	160
# L_20		LABEL	0	176
# "i = %d\n"		STR	0	192
# L_21		LABEL	0	208
# L_22		LABEL	0	256
# L_23		LABEL	0	272
# L_24		LABEL	0	320
# L_25		LABEL	0	336
# L_26		LABEL	0	384
# L_27		LABEL	0	400
# L_28		LABEL	0	416
# L_29		LABEL	0	432
# L_30		LABEL	0	448
# L_31		LABEL	0	464
# L_32		LABEL	0	480
# L_33		LABEL	0	528
# L_34		LABEL	0	544
# "j = %d\n"		STR	0	560
# L_35		LABEL	0	576
# L_36		LABEL	0	608
# L_37		LABEL	0	624
# L_38		LABEL	0	672
# L_39		LABEL	0	688
# L_40		LABEL	0	704
# L_41		LABEL	0	720
# L_42		LABEL	0	736
# L_43		LABEL	0	784
# L_44		LABEL	0	800
# L_45		LABEL	0	816
# L_46		LABEL	0	832
# L_47		LABEL	0	848
# L_48		LABEL	0	928
# L_49		LABEL	0	944
# "a[7] = %d\n"		STR	0	960
# L_50		LABEL	0	1008
# L_51		LABEL	0	1040
# L_52		LABEL	0	1056
# L_53		LABEL	0	1072
# L_54		LABEL	0	1088
# L_55		LABEL	0	1152
# L_56		LABEL	0	1168
# L_57		LABEL	0	1200
# L_58		LABEL	0	1216
# L_59		LABEL	0	1232
# L_60		LABEL	0	1280
# L_61		LABEL	0	1296
# L_62		LABEL	0	1312
# "result %d\n"		STR	0	1328
# L_63		LABEL	0	1344
# L_64		LABEL	0	1360
# L_65		LABEL	0	1376
# L_66		LABEL	0	1456
# L_67		LABEL	0	1504
# L_68		LABEL	0	1520
# L_69		LABEL	0	1536
# "b = %d\n"		STR	0	1552
# L_70		LABEL	0	1568
# L_71		LABEL	0	1584
# L_72		LABEL	0	1600
# L_73		LABEL	0	1664
# L_74		LABEL	0	1680
# L_75		LABEL	0	1696
# L_76		LABEL	0	1712
# "pass %d\n"		STR	0	1728
# L_77		LABEL	0	1760
# L_78		LABEL	0	1776
# L_79		LABEL	0	1792
# L_80		LABEL	0	1808
# L_81		LABEL	0	1824
#-------------------------------------
#-------------------------------------
# test		INT	0	32
# 368		INT	0	368
# main		VOID	0	384
# 1840		INT	0	1840
#-------------------------------------
#-------------------------------------
# p		INT	0	16
#-------------------------------------
#-------------------------------------
# 0		INT	0	64
# t_0		BOOLEAN	0	80
#-------------------------------------
#-------------------------------------
# printf		STR	0	176
# 2		INT	0	192
#-------------------------------------
#-------------------------------------
# printf		STR	0	288
# 2		INT	0	304
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
# i		INT	0	16
# j		INT	0	32
# b		INT	0	48
# 1		INT	0	80
# 100		INT	0	112
# t_1		BOOLEAN	0	128
# 2		INT	0	496
# t_4		INT	0	512
# printf		STR	0	592
# 2		INT	0	640
# t_5		INT	0	656
# 2		INT	0	752
# t_6		INT	0	768
# 7		INT	0	864
# t_7		INT	0	880
# 8		INT	0	896
# 999		INT	0	912
# 7		INT	0	976
# t_8		INT	0	992
# t_9		INT	0	1024
# 7		INT	0	1104
# t_10		INT	0	1120
# t_11		INT	0	1136
# t_12		INT	0	1184
# 999		INT	0	1248
# t_13		BOOLEAN	0	1264
# 2		INT	0	1392
# 7		INT	0	1408
# t_14		INT	0	1424
# t_15		INT	0	1440
# 1		INT	0	1472
# t_16		INT	0	1488
# t_17		INT	0	1616
# 3		INT	0	1632
# t_18		BOOLEAN	0	1648
#-------------------------------------
#-------------------------------------
# printf		STR	0	224
# 2		INT	0	240
# 1		INT	0	288
# t_2		INT	0	304
# 50		INT	0	352
# t_3		BOOLEAN	0	368
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
# t_19		INT	0	1744
#-------------------------------------
.globl main
.data
a: .quad 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
str144: .asciz "%d bigger than 0\n"
str256: .asciz "%d smaller than 0\n"
str192: .asciz "i = %d\n"
str560: .asciz "j = %d\n"
str960: .asciz "a[7] = %d\n"
str1328: .asciz "result %d\n"
str1552: .asciz "b = %d\n"
str1728: .asciz "pass %d\n"
.text

#test:   
test: push %rbp
mov %rsp, %rbp


#L_1: 368 frame 
L_1: sub $368, %rsp


#L_2:  push %rdi 
L_2: mov %rdi, -16(%rbp)


#L_3: t_0 = p cmp 0
L_3: mov -16(%rbp), %rax
mov $0, %rbx
cmp %rax, %rbx
mov %rax, -80(%rbp)


#L_4: L_6 = t_0 jl 
L_4: jl L_6


#L_5: L_10 = t_0 jge 
L_5: jge L_10


#L_6: "%d bigger than 0\n" rdi 
L_6: mov $str144, %rdi


#L_7: p rsi 
L_7: mov -16(%rbp), %rsi


#L_8:  = printf call 2
L_8: call printf


#L_9: L_13 goto 
L_9: jmp L_13


#L_10: "%d smaller than 0\n" rdi 
L_10: mov $str256, %rdi


#L_11: p rsi 
L_11: mov -16(%rbp), %rsi


#L_12:  = printf call 2
L_12: call printf


#L_13: 368 = p ret 
L_13: mov -16(%rbp), %rax
add $368, %rsp
pop %rbp
ret


#main:   
main: push %rbp
mov %rsp, %rbp


#L_15: 1840 frame 
L_15: sub $1840, %rsp


#L_16: i = 1 = 
L_16: mov $1, %rax
mov %rax, -16(%rbp)


#L_17: t_1 = i cmp 100
L_17: mov -16(%rbp), %rax
mov $100, %rbx
cmp %rax, %rbx
mov %rax, -128(%rbp)


#L_18: L_20 = t_1 jg 
L_18: jg L_20


#L_19: L_32 = t_1 jle 
L_19: jle L_32


#L_20: "i = %d\n" rdi 
L_20: mov $str192, %rdi


#L_21: i rsi 
L_21: mov -16(%rbp), %rsi


#L_22:  = printf call 2
L_22: call printf


#L_23: t_2 = i + 1
L_23: mov -16(%rbp), %rax
mov $1, %rbx
add %rbx, %rax
mov %rax, -304(%rbp)


#L_24: i = t_2 = 
L_24: mov -304(%rbp), %rax
mov %rax, -16(%rbp)


#L_25: t_3 = i cmp 50
L_25: mov -16(%rbp), %rax
mov $50, %rbx
cmp %rax, %rbx
mov %rax, -368(%rbp)


#L_26: L_28 = t_3 jge 
L_26: jge L_28


#L_27: L_30 = t_3 jl 
L_27: jl L_30


#L_28: L_31 goto 
L_28: jmp L_31


#L_29: L_17 goto 
L_29: jmp L_17


#L_30: L_32 goto 
L_30: jmp L_32


#L_31: L_17 goto 
L_31: jmp L_17


#L_32: t_4 = i * 2
L_32: mov -16(%rbp), %rax
mov $2, %rbx
mulq %rbx
mov %rax, -512(%rbp)


#L_33: j = t_4 = 
L_33: mov -512(%rbp), %rax
mov %rax, -32(%rbp)


#L_34: "j = %d\n" rdi 
L_34: mov $str560, %rdi


#L_35: j rsi 
L_35: mov -32(%rbp), %rsi


#L_36:  = printf call 2
L_36: call printf


#L_37: t_5 = i / 2
L_37: mov $0, %rdx
mov -16(%rbp), %rax
mov $2, %rbx
idiv %rbx
mov %rax, -656(%rbp)


#L_38: j = t_5 = 
L_38: mov -656(%rbp), %rax
mov %rax, -32(%rbp)


#L_39: "j = %d\n" rdi 
L_39: mov $str560, %rdi


#L_40: j rsi 
L_40: mov -32(%rbp), %rsi


#L_41:  = printf call 2
L_41: call printf


#L_42: t_6 = i - 2
L_42: mov -16(%rbp), %rax
mov $2, %rbx
sub %rbx, %rax
mov %rax, -768(%rbp)


#L_43: j = t_6 = 
L_43: mov -768(%rbp), %rax
mov %rax, -32(%rbp)


#L_44: "j = %d\n" rdi 
L_44: mov $str560, %rdi


#L_45: j rsi 
L_45: mov -32(%rbp), %rsi


#L_46:  = printf call 2
L_46: call printf


#L_47: t_7 = 7 * 8
L_47: mov $7, %rax
mov $8, %rbx
mulq %rbx
mov %rax, -880(%rbp)


#L_48: a = t_7 []= 999
L_48: mov $a, %rax
mov -880(%rbp), %rbx
add %rbx, %rax
mov $999, %rbx
mov %rbx, (%rax)


#L_49: "a[7] = %d\n" rdi 
L_49: mov $str960, %rdi


#L_50: t_8 = 7 * 8
L_50: mov $7, %rax
mov $8, %rbx
mulq %rbx
mov %rax, -992(%rbp)


#L_51: t_9 = a [] t_8
L_51: mov $a, %rax
mov -992(%rbp), %rbx
add %rbx, %rax
mov (%rax), %rbx
mov %rbx, -1024(%rbp)


#L_52: t_9 rsi 
L_52: mov -1024(%rbp), %rsi


#L_53:  = printf call 2
L_53: call printf


#L_54: t_10 = 7 * 8
L_54: mov $7, %rax
mov $8, %rbx
mulq %rbx
mov %rax, -1120(%rbp)


#L_55: t_11 = a [] t_10
L_55: mov $a, %rax
mov -1120(%rbp), %rbx
add %rbx, %rax
mov (%rax), %rbx
mov %rbx, -1136(%rbp)


#L_56: t_11 rdi 
L_56: mov -1136(%rbp), %rdi


#L_57: t_12 = test callexp 1
L_57: call test
mov %rax, -1184(%rbp)


#L_58: b = t_12 = 
L_58: mov -1184(%rbp), %rax
mov %rax, -48(%rbp)


#L_59: t_13 = b cmp 999
L_59: mov -48(%rbp), %rax
mov $999, %rbx
cmp %rax, %rbx
mov %rax, -1264(%rbp)


#L_60: L_62 = t_13 je 
L_60: je L_62


#L_61: L_65 = t_13 jne 
L_61: jne L_65


#L_62: "result %d\n" rdi 
L_62: mov $str1328, %rdi


#L_63: b rsi 
L_63: mov -48(%rbp), %rsi


#L_64:  = printf call 2
L_64: call printf


#L_65: t_14 = 2 * 7
L_65: mov $2, %rax
mov $7, %rbx
mulq %rbx
mov %rax, -1424(%rbp)


#L_66: t_15 = j + t_14
L_66: mov -32(%rbp), %rax
mov -1424(%rbp), %rbx
add %rbx, %rax
mov %rax, -1440(%rbp)


#L_67: t_16 = t_15 - 1
L_67: mov -1440(%rbp), %rax
mov $1, %rbx
sub %rbx, %rax
mov %rax, -1488(%rbp)


#L_68: b = t_16 = 
L_68: mov -1488(%rbp), %rax
mov %rax, -48(%rbp)


#L_69: "b = %d\n" rdi 
L_69: mov $str1552, %rdi


#L_70: b rsi 
L_70: mov -48(%rbp), %rsi


#L_71:  = printf call 2
L_71: call printf


#L_72: t_17 = i + j
L_72: mov -16(%rbp), %rax
mov -32(%rbp), %rbx
add %rbx, %rax
mov %rax, -1616(%rbp)


#L_73: t_18 = t_17 cmp 3
L_73: mov -1616(%rbp), %rax
mov $3, %rbx
cmp %rax, %rbx
mov %rax, -1648(%rbp)


#L_74: L_76 = t_18 jl 
L_74: jl L_76


#L_75: L_80 = t_18 jge 
L_75: jge L_80


#L_76: "pass %d\n" rdi 
L_76: mov $str1728, %rdi


#L_77: t_19 = i + j
L_77: mov -16(%rbp), %rax
mov -32(%rbp), %rbx
add %rbx, %rax
mov %rax, -1744(%rbp)


#L_78: t_19 rsi 
L_78: mov -1744(%rbp), %rsi


#L_79:  = printf call 2
L_79: call printf


#L_80: 1840 ret 
L_80: add $1840, %rsp
pop %rbp
ret

