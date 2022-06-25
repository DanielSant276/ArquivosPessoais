@ programa para trocar letras maiuscula por minuscula de uma frase
@ colocando a resposta numa outra posicao de memoria
@ 
     letra_A .equ 0x41
	 letra_Z .equ 0x57
     NUM_LETRAS  .equ 0x00016  @ tamanho da frase

     .org 0x10
_start:
     set r2,NUM_LETRAS @ controla o loop de varredura da frase
					  
     set r1, FRASE     @ 0x300 posicao inicial da frase
                        
     set r3, resposta  @ 0x320 posicao inicial da frase COM LETRAS trocadas
	 
                       
loop:
     ldb r0, [r1]      @ utiliza-se o R0 para guardar uma letra da frase
                       @ resgistrador r4 é usado como rascunho
     set r4, letra_A   @ carrega em r4  a letra 'A' = 0x41
     cmp r0 ,r4        @ as letras maiúsculas estão entre 
                       @ 'A' = 0x41 e 'Z' =0x57
     jl nao_troca      @ 
     set r4 , letra_Z   @ carrega em r4 a letra 'Z' =0x57
	 cmp r0, r4
	 jg nao_troca
	 add r0, 0x20      @  'A' = 0x41 , 'a' = 0x61, difrença de 0x20 entra miúsculo e maiúsculo
	                   @ assim transforma letra maiúscula em minuscula basta somar 0x20 
	
nao_troca: 
     stb [r3],r0       @ guarda a letra  na resposta
     add  r1, 1        @ aponta para posicao seguinte da frase
     add  r3, 1        @ aponta para posicao seguinte da resposta
                       
     sub  r2, 1        @ r2 é decrementado, controla o numero de passadas
     jz   fim          @ se a ultima operação chegou a zero => 
	                   @ acabou o loop e vai para o fim
  
     jmp loop           @ senao continua as iterações voltando para loop:
     fim: hlt           @ termna op programa
     
	 
     .org 0x300
FRASE: .byte 'HojE esta Chuvoso E FRIO'
     .org 0x320
resposta: .skip NUM_LETRAS
