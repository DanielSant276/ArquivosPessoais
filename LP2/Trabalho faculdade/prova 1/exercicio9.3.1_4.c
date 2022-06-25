//Exercício 9.3.1_4 Daniel Sant' Anna Andrade - 20200036904
/*#include <stdio.h>

int main(void) {
  FILE *arquivop;

  char nome[20];
  float nota1;
  float nota2;
  float nota3;
  float media;
  float temp;
  
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
    
    if (nota1 > nota2)  {
      temp = nota1;
      nota1 = nota2;
      nota2 = temp;
    }
  
    if (nota1 > nota3)  {
      temp = nota1;
      nota1 = nota3;
      nota3 = temp;
    }
  
    if (nota2 > nota3)  {
      temp = nota2;
      nota2 = nota3;
      nota3 = temp;
    }

    media = (nota1 + nota2 + nota3) / 3;

    fprintf(arquivop, "%s:%5.2f:%5.2f:%5.2f:%5.2f\n", nome, nota1, nota2, nota3, media);
  } while (1);

  rewind(arquivop);
  
  while (fscanf(arquivop, "%[^:]:%f:%f:%f:%f", nome, &nota1, &nota2, &nota3, &media) == 5) {
    fprintf(stdout, "%-20s %6.2f %6.2f %6.2f %6.2f", nome, nota1, nota2, nota3, media);
  }

  return (0);
}*/

#include <stdio.h>

int main(void){
    FILE *arquivop;
    char nome[20];
    float nota1;
    float nota2;
    float nota3;
    float maior_nota;

    if ((arquivop = fopen("turma3notas.txt", "a+")) == NULL) {
        perror("");
        exit(2);
    }
    do {
        fprintf(stderr, "Nome do(a) aluno(a): ");
        fflush(stdin);

        if (fscanf(stdin, "%[^\n]", nome) != 1)
            break;
        fprintf(stderr, "Notas de 3 materias separadas por espaco: ");
        fflush(stdin);
        fscanf(stdin, "%f%f%f", &nota1, &nota2, &nota3);

    if(nota1 > nota2)
        if(nota1 > nota3)
            maior_nota = nota1;
        else
            maior_nota = nota3;

    else
        if(nota2 > nota3)
            maior_nota = nota2;
        else
            maior_nota = nota3;
        printf("\n\n");


        fprintf(arquivop, "%s:%5.2f:%5.2f:%5.2f:%5.2f\n", nome, nota1, nota2, nota3, maior_nota);
    } while (1);

    rewind(arquivop);

    while (fscanf(arquivop, "%[^:]:%f:%f:%f:%f", nome, &nota1, &nota2, &nota3, &maior_nota) == 5)
        fprintf(stdout, "%-20s %6.2f %6.2f %6.2f %6.2f", nome, nota1, nota2, nota3, maior_nota);

return(0);
}