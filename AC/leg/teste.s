INTERVALO .equ 0x0000b
	.org 0x100		@ inicia o código no endereço 100

	set r2, INTERVALO	@ passa o valor de INTERVALO(b) para r2
	set r1, lista		@ passa o endereço do primeiro valor da
				@ lista para r1

	ld r3, [r1]		@ carrega o valor de r1 para r3
loop:
	ld r0, [r1]		@ carrega o valor de r1 em r0
	cmp r0, r3		@ compara o valor de r0 com r3
	jl xxxx			@ pula para "xxxx" caso r0 menor que r3
continua:
	add r1, 4		@ adiciona 4 em r1
	sub r2, 1		@ subtrai 1 de r2
	jz fim			@ verifica se a última operação resultou
				@ em um 0, se sim pula para "fim"

	jmp loop		@ pula para "loop"
fim:
	st mn, r3		@ armazena o valor de r3 no endereço de mn
	hlt			@ termina o programa
xxxx:
	mov r3, r0		@ move o valor de r0 para r3
	jmp continua		@ pula para "continua"

lista:	.word 10, 11, 12, 8, 5, 87, 15, 70, 33, 98, 57, 4, 2, 2, 1
	.org 0x200
mn:	.word 0