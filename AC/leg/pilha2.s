final_memoria .equ 0x80000	@ inicia a pilha com 0x80000 de espaço na memoria
tamanho_vetor .equ 13		@ inicia o "tamanho vetor" valendo 13

     .org 0x100			@ inicia em 0x100 a lista de números
lista: .word 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12

     .org 0x10			@ inicia em 0x10 o código
     set sp, final_memoria	@ seta a pilha com o valor de 0x80000
     set r0, lista		@ seta "r0" com o valor inicial de 0x100
     push r0			@ envia "r0" para o topo da pilha

     set r1, tamanho_vetor	@ seta "r1" com o tamanho de 13
     push r1			@ envia "r1" para o topo da pilha

     call xxxx			@ chama a função "xxxx"
     add sp, 8			@ adiciona 8 na pilha

     hlt			@ termina o programa

     .org 0x40			@ inicia "xxxx" em 0x40
xxxx:
     ld r1, [sp + 4]		@ carrega em "r1" o valor de "sp+4"
     ld r0, [sp + 8]		@ carrega em "r0" o valor de "sp+8"
     set r2, 1			@ adiciona 1 em "r2"

loop:
     ld r3, [r0]		@ carrega em "r3" o valor de "r0"
     add r3, 5			@ adiciona 1 em "r3"
     st [r0], r3		@ guarda no valor do endereço de "r0" o valor de "r3"
     add r0, 4			@ adicona 4 em "r0"
     add r2, 1			@ adiciona 1 em "r2"
     cmp r2, r1			@ compara "r2" com "r1"
     jg fim			@ desvia para "fim" se a última "r2" for maior que "r1"
     jmp loop			@ pula para "loop"

fim:
     ret			@ retorna a função