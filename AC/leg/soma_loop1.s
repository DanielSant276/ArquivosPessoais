TAMANHOMAX .equ 0x00064	@ inicia o "TAMANHOMAX" com o valor de 100 ("0x64")

  .org 0x10		@ inicia o código em "0x10"
_start:
  set r1, list		@ inicia "r1" com a posição de "list", ou seja "0x200"
  set r2, sum		@ inicia "r2" com a posição de "sum", ou seja "0x190"
  set r3, 0   		@ inicia "r3" com o valor de 0

loop:
  ld r0, [r1]		@ carrega em "r0" o valor da posição de "r1"
  add r3, r0		@ adiciona "r0" em "r3"
  cmp r3, TAMANHOMAX	@ compara "r3" com "TAMANHOMAX"
  jg end		@ caso "r3" seja maior que "TAMANHOMAX" pula para "end"

next_value:
  
  add r1, 4		@ adiciona 4 em "r1" para acessar o próximo item da "list"
  jmp loop		@ pula para "loop" e reinicia a soma e comparação

end:
  stb [r2], r3		@ envia o valor de "r3" para o endereço de "r2" que é a "sum"
			@ iniciado em "0x190"

  hlt			@ termina o programa

  .org 0x190
sum:  .word 0
  .org 0x200
list: .word 5, 39, 1, 2, 2, 10, 15, 16, 10, 20, 10, 1, 20, 25, 10, 5, 39, 1, 2, 2, 10, 15, 16, 10, 20