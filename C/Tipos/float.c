#include <stdio.h>
#include <limits.h>
#include <stdint.h>
#include <stdlib.h>

//Números de ponto flutuante, que definem casas decimais que serão exibidas

int main(void){

  //float f = 3e2; //3e2 == 3 * 10 ^ 2
  float f = 1; //precisão simples

  double d = 1; //precisão dupla

  long double d2 = 1; //precisão quadrupla => float * 4

  printf("O tamanho de f (float) é %zu bytes / %zu bits\n", sizeof f, sizeof f * 8);
  printf("O tamanho de d (double) é %zu bytes / %zu bits\n", sizeof d, sizeof d * 8);
  
  printf("Valor de f: %.2f\n", f);  //.xf, o valor de x define a quantidade de casas que serão exibidas
  printf("Valor de d: %.2f\n", d); 
  

  return 0;
}
