#include <stdio.h>
#include <limits.h>
#include <stdint.h>
#include <stdlib.h>

/*
 * &
 * |
 * ^ xor
 * ~
 * >>
 * <<
*/


/*
 * operadores bit a bit - &
 *
 * 10
 * 11
 * 10
 *
*/



int main(void){

  //int a = 0b10000000000000000000000000000000; 
  //int b = 0b01111111111111111111111111111111; 
  
  int a = 8;

  //0 falso
  // qualquer coisa diferente de 0 eh verdadeiro
  
  printf("O resultado é %d\n", a >> 2);

  return 0;
}
