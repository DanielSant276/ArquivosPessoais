//Exercício 9.3.3_1 Daniel Sant' Anna Andrade - 20200036904
#include <stdio.h>

void ordenar(float *numeroMenor, float *numeroMaior);

int main(void) {
  FILE *arquivop;

  char nome[20];
  float nota1;
  float nota2;
  float nota3;
  float media;
  
  if ((arquivop = fopen("turma3notas.txt", "a+")) == NULL)  {
    perror("");
    exit(2);
  }

  do  {
    fprintf(stderr, "Nome do(a) aluno(a): ");
    fflush(stdin);
    
    if (fscanf(stdin, "%[^\n]", nome) != 1) {
      break;
    }

    fprintf(stderr, "Notas de 3 materias separadas por espaco: ");
    fflush(stdin);
    fscanf(stdin, "%f%f%f", &nota1, &nota2, &nota3);
    
    ordenar(&nota1, &nota2);
    ordenar(&nota1, &nota3);
    ordenar(&nota2, &nota3);

    media = (nota1 + nota2 + nota3) / 3;

    fprintf(arquivop, "%s:%5.2f:%5.2f:%5.2f:%5.2f\n", nome, nota1, nota2, nota3, media);
  } while (1);

  rewind(arquivop);
  
  while (fscanf(arquivop, "%[^:]:%f:%f:%f:%f", nome, &nota1, &nota2, &nota3, &media) == 5) {
    fprintf(stdout, "%-20s %6.2f %6.2f %6.2f %6.2f", nome, nota1, nota2, nota3, media);
  }

  return (0);
}

void ordenar(float *numeroMenor, float *numeroMaior) {
  float temp;

  if (*numeroMenor > *numeroMaior)  {
    temp = *numeroMenor;
    *numeroMenor = *numeroMaior;
    *numeroMaior = temp;
  }
}