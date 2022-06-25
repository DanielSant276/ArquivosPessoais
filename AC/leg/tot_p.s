INTERVALO .equ 0x0000c	@ definindo "INTERVALO" com o valor de 12
     
     .org 0x300		@ iniciando a "lista" no endereço de memoria 0x300
lista: .word 810, 39, 1, 2, 2, 10, 810, 16, 10, 77, 10, 1

     .org 0x10		@ iniciando o código no endereço de memoria 0x10
_start:
     set r2, 0		@ botando o valor de 0 em "r2"
     set r1, lista	@ alocou em "r1" o valor de memoria inicial de "lista"
     set r4, 0		@ botando o valor de 0 em "r4"
     set r3, 1		@ botando o valor de 1 em "r3"
	 
loop:  
     ld r0,  [r1]	@ passando o valor que está em dentro do endereço de memória de "r1"
     tst r0 , r3	@ verificar se o bit mais significativo de r0 é igual ao de "r3"
     jnz num_imp	@ pula para "num_imp" caso a comparação seja diferente de 0
     add r4, 1		@ adiciona 1 em "r4" 
     add r5, r0		@ adiciona o valor de "r0" em "r5"

num_imp: 
     add  r2, 1		@ adicionar 1 em "r2"
     add  r1, 4		@ dicionar 4 em "r1"
     cmp r2, INTERVALO  @ compara "r2" com "INTERVALO"
     jge   fim		@ desvia para "fim" caso a última comparação seja maior ou igual
     jmp loop		@ pula para loop
	 
fim: 
     hlt		@ termina o programa




verdadeira 1
falso	   0