//Exercício 9.3.1_1 Daniel Sant' Anna Andrade - 20200036904
#include <stdio.h>

int main(void) {
  FILE *entrada_p;
  FILE *saida_p;

  double item;
  int estado_da_entrada;
  int contador = 0;

  entrada_p = fopen("entrada.txt", "r");
  saida_p = fopen("saida.txt", "w");
  estado_da_entrada = fscanf(entrada_p, "%lf", &item);

  while (estado_da_entrada == 1) {
    printf("Salvando no arquivo de saida o item arredondado... \n");
    fprintf(saida_p, "%.1f\n", item);
    estado_da_entrada = fscanf(entrada_p, "%lf", &item);

    contador = contador + 1;
  }
  
  printf("Foram arredondados %d numeros. Fechando os arquivos...\n\n", contador);
  fclose(entrada_p);
  fclose(saida_p);
  
  return 0;
}