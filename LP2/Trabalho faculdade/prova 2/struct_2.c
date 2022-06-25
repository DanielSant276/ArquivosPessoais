//Exercício 4) Daniel Sant' Anna Andrade, Guilherme Henrique Ferraz Thomé, Ana Clara Costa Gonçalves
#include <stdio.h>
#include <Math.h>

struct ponto {
  float abscissa;
  float ordenada;
};

float distancia_pontos(struct ponto, struct ponto);

int main() {
  struct ponto p1;
  struct ponto p2;
  float reta;

  printf("Ingressando as coordenadas de dois pontos:\n");
  printf("\tDo primeiro ponto (x1, y1) : ");
  scanf("%f %f", &p1.abscissa, &p1.ordenada);
  fflush(stdin);
  printf("\tDo segundo ponto (x2, y2) : ");
  scanf("%f %f", &p2.abscissa, &p2.ordenada);

  reta = distancia_pontos(p1, p2);

  printf("O segmento de reta e: %.2f\n", reta);

  return 0;
}

float distancia_pontos(struct ponto a, struct ponto b) {
  float abscissa, ordenada;
  abscissa = pow((a.abscissa - b.abscissa), 2);
  ordenada = pow((a.ordenada - b.ordenada), 2);

  return sqrt(abscissa + ordenada);
}