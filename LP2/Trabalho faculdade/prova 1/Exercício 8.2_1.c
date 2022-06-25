//Exercício 8.2_1 Daniel Sant' Anna Andrade - 20200036904
/*#include <stdio.h>

int main (void) {
  int i = 2;
  int soma;
  int numero;
  int numeroInformado;
  double verificar;

  printf("Escolha um numero: ");
  scanf("%d", &numero);

  numeroInformado = numero;
  verificar = numero % 2;

  if (verificar == 0) {
    soma = numero;

    while (numero > i) {
      numero -= 2;
      soma += numero;
    }
  }
  else if (verificar == 1) {
    numero--;
    soma = numero;

    while (numero > i) {
      numero -= 2;
      soma += numero;
    }
  }

  printf("O somatorio de todos os numero positivos menores ou iguais a %d e: %d", numeroInformado, soma);

  return 0;
}*/

#include <stdio.h>

int main (void) {
  int numero;
  int soma;

  printf("Insira um numero: ");
  scanf("%d", &numero);

  soma = 0;
  
  if (numero % 2 == 0) {
    while (numero > 0) {
      soma = soma + numero;
      numero = numero - 2;
    }
  }
  else {
    numero = numero - 1;

    while (numero > 0) {
      soma = soma + numero;
      numero = numero - 2;
    }
  }

  printf("O valor da soma e: %d", soma);

  return 0;
}

