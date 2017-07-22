#include <stdio.h>
#include <limits.h>
#include <stdint.h>
#include <stdlib.h>

/*
 * Conjunção (E, AND) - &&
 * 0 0 - 0
 * 0 1 - 0
 * 1 0 - 0
 * 1 1 - 1
 *
 * Disjução (OU, OR) - ||
 * 0 0 - 0
 * 0 1 - 1
 * 1 0 - 1
 * 1 1 - 1
 *
*/



int main(void){

  int a = 10;
  int b = 10;

  //if(a != b)
  //if(a == b)
  //printf("%d\n", a == b && b > 3); // Fazendo uma pergunta dentro do printf, essa irá retornar 0 ou 1
  printf("%d\n", !(a == b));

  return 0;
}
