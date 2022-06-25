//Exercício 5) Daniel Sant' Anna Andrade, Guilherme Henrique Ferraz Thomé, Ana Clara Costa Gonçalves
#include <stdio.h>

double fibonacci(double anterior, double atual, int contador, int posicao);

int main() {
  double anterior = 1;
  double atual = 1;
  int contador = 0;
  int posicao;

  printf("Insira ate qual valor da sequencia fibonacci voce deseja: ");
  scanf("%d", &posicao);
  printf("%.0f %.0f ", anterior, atual);

  fibonacci(anterior, atual, contador, posicao);
  return 0;
}

double fibonacci(double anterior, double atual, int contador, int posicao) {
  double temporaria;
  if (posicao > contador + 2) {
    temporaria = anterior + atual;
    anterior = atual;
    atual = temporaria;

    contador++;
    printf("%.0f ", atual);

    fibonacci(anterior, atual, contador, posicao);
  }
}