INTERVALO .equ 0x0000c	@ define "INTERVALO" com um valor de "0xc"

    .org 0x10		@ inicia o código na posição de memória 0x10
_start:
    set r2, 0		@ inicia "r2" com o valor de 0
    set r1, lista	@ inicia "r1" com a posição de memória da "lista" (0x200)
    set r3, 1		@ inicia "r3" com o valor de 1

loop:
    ld r0, [r1]		@ carrega em "r0" o valor da posição de memória de "r1"
    tst r0 , r3		@ testa "r0" com "r3" vendo se o bit mais significativo dos dois
			@ são iguais ou não

    jz xxxx		@ desvia para "xxxx" se a comparação de teste for 0, ou seja, "r0"
			@ seja um númeor par

    add r0, 1		@ adiciona 1 em "r0"
    st [r1],r0		@ seta o valor de "r0" no valor da posição de memória de "r1"

xxxx:
    add r2, 1		@ adiciona 1 em "r2"
    add r1, 4		@ adiciona 4 em "r1" para acessar o próximo valor da lista
    cmp r2 ,INTERVALO	@ compara "r2" com "INTERVALO"
    jge yyyy		@ pula para "yyyy" caso a "r2" seja maior ou igual a "INTERVALO"
    jmp loop		@ pula para loop

yyyy:
    hlt			@ termina o programa

    .org 0x200		@ inicia a lista na posição de "0x200"
lista: .word 39, 1, 2, 2, 10, 81, 16, 10, 332, 1, 19, 0, 1