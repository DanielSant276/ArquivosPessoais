//Exercício 8.1_1 Daniel Sant' Anna Andrade - 20200036904
#include <stdio.h>

int main() {
  float temperatura;

  printf("Qual a temperatura na sua cidade hoje? ");
  scanf("%f", &temperatura);
  
  if (temperatura < 22) {
    printf("E melhor voce se agasalhar!");
  }
  else if (temperatura >= 30) {
    printf("Nao esqueca de se hidratar!");
  }
  //colocando mais um else if com a informação de temperatura == 24 ele informará a mensagem "E a temperatura ambiente ideal!" caso seja informado exatamente esse valor
  else if (temperatura == 24) {
    printf("E a temperatura ambiente ideal!");
  }
  else {
    printf("Dia agradavel! :)");
  }

  printf("\n\n");
  
  return 0;
}