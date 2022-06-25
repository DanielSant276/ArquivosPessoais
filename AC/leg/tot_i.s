@ programa para contar quantos numeros impares existem numa lista com 11 numeros.
	
@ define constantes
     
     INTERVALO  .equ 0x0000c  @ tamanho do vetor 12

     .org 0x10
_start:
   
    set r2, 0
                       @ o registrador r2 é usado como contador 
                       @ que deve ser incrementado a cada passada pelo loop

     set r1, lista     @ 0x300 posicao inicial da memoria
                       @ onde se encontram os numeros da lista de forma sequencial

     set r4, 0	        @ r4 usado como contador de numeros impares
	set r3, 1         @ 0x00000001 util para isolar o bit lsb 
	 
loop:  
     ld r0,  [r1]    @ utiliza-se o R0 para guardar o valor lido da lista na memoria    
     tst r0 , r3     @ verifica se do lsb de r0 é igual a 1
                     @ 
     jz num_par      @  a comparacao deu 0, logo o numero é par
	add r4, 1       @ soma 1 ao contador de numeros impares
	 
num_par: 
     add  r2, 1
     add  r1, 4        @ incrementa imediatamente o registrador r1
                       @  assim, r1 ira apontar para nova posicao da lista
                       @  no caso a lista foi feita com espaçamento
                       @  de uma word = 4 bytes
     cmp r2 ,INTERVALO @ 
     jge   fim         @ se a ultima iteração foi feita     
  
     jmp loop          @ senao continua as iterações voltando para loop:
	 
     fim: hlt          @ termina o programa
     
     .org 0x300
lista: .word 5,39,1,2,2,10, 15, 16,10,20,10,1
     
