@ programa para contar numeros até 70
     
  TAMANHOMAX         .equ 0x00046

  .org 0x300
lista: .word 5,39,1,2,2,10, 15, 16,10,20,10,1
  .org 0x340
soma:  .word 0
  .org 0x344
num_lidos: .word 0

  .org 0x10
_start:
  set r1, lista
  set r2, soma
  set r3, num_lidos
  
loop:
  ld r0, [r1]
  add r4, r0
  add r5, 1

  cmp r4, TAMANHOMAX
  jg end

next_value:
  stb [r2], r4
  stb [r3], r5
  add r1, 4
  jmp loop

end:
  hlt
     
