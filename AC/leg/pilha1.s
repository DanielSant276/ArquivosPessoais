final_memoria .equ 0x80000	@ inicia a pilha em 80000

     .org 0x10
     set sp, final_memoria	@ define a pilha com 0x80000 de memoria
     set r0, num_a		@ define r0 com o valor de "num_a"
     push r0			@ coloca o valor de r0 na pilha

     set r0, num_b		@ define r0 com o valor de "num_b"
     push r0			@ coloca o valor de r0 na pilha

     call troca			@ chama a função troca
     add sp, 8			@ adiciona 8 na pilha
     add r0,r1			@ soma "r0" com "r1"
     hlt			@ termina o programa     

     .org 0x40			@ inicia a função troca na posição 40
troca:
     ld r1, [sp + 8]		@ carrega em "r1" o valor de "sp+8" no caso, o segundo valor
				@ da pilha

     ld r0, [sp + 4]		@ carrega em "r0" o valor de "sp+4" no caso, o primeiro
				@ valor da pilha

     ld r3, [r0]		@ carrega em "r3" o valor de "r0"
     ld r4, [r1]		@ carrega em "r4" o valor de "r1"
     st [r0], r4		@ guarda o valor de "r4" no lugar do valor de "r0"
     st [r1], r3		@ guarda o valor de "r1" no lugar do valor de "r3"

     ret			@ retorna da função

.org 0x60
num_a: .word 17			@ inicia num_a valendo 17 na posição 60
num_b: .word 32			@ inicia num_b valendo 32 na posição 64