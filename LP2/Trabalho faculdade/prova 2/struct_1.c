//Exercício 3) Daniel Sant' Anna Andrade, Guilherme Henrique Ferraz Thomé, Ana Clara Costa Gonçalves
#include <stdio.h>

struct ponto {
  float abscissa;
  float ordenada;
};

struct ponto medio(struct ponto, struct ponto);

int main() {
  struct ponto p1;
  struct ponto p2;
  struct ponto pm;

  printf("Ingressando as coordenadas de dois pontos:\n");
  printf("\tDo primeiro ponto (x1, y1) : ");
  scanf("%f %f", &p1.abscissa, &p1.ordenada);
  fflush(stdin);
  printf("\tDo segundo ponto (x2, y2) : ");
  scanf("%f %f", &p2.abscissa, &p2.ordenada);

  pm = medio(p1, p2);

  printf("As coordenadas do ponto medio sao :(%.2f, %.2f).\n", pm.abscissa, pm.ordenada);

  return 0;
}

struct ponto medio(struct ponto a, struct ponto b) {
  a.abscissa = (a.abscissa + b.abscissa) / 2;
  a.ordenada = (a.ordenada + b.ordenada) / 2;
  return a;
}