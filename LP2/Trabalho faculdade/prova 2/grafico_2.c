//Exercício 2a) Daniel Sant' Anna Andrade, Guilherme Henrique Ferraz Thomé, Ana Clara Costa Gonçalves
#include <stdio.h>
#define MAX_VAL 65 /* valor máximo da função */

int plano_cartesiano(int t);

int main(void) {
  char grafico[MAX_VAL + 2];
  int i, j, funval;

  /* Posiciona de 5 em 5, até 65, os valores de x */
  for (i = 0; i <= MAX_VAL; i += 5) {
    printf("%5d", i);
  }
  printf("\n");

  /* Posiciona as barras para indicar os valores de x */
  for (i = 0; i <= MAX_VAL; i += 5) {
    printf("    |");
  }
  printf("\n");

  /* Inicializa a array de x, colocando um valor em branco em cada espaço */
  for (i = 0; i <= MAX_VAL + 1; ++i) {
    grafico[i] = ' ';
  }

  /* Computa o grafico plano_cartesiano(t) para cada valor de t indo de 0 até 10 */
  for (j = 0; j <= 10; ++j) {
    funval = plano_cartesiano(j);
    grafico[funval] = '*';
    grafico[funval + 1] = '\0';
    printf("t=%2d%s\n", j, grafico);
    grafico[funval] = ' ';
    grafico[funval + 1] = ' ';
  }
  
  return (0);
}

int plano_cartesiano(int t) {
  return ((5 * t) + 5);
}
