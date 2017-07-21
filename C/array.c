#include <stdio.h>
#include <limits.h>
#include <stdint.h>
#include <stdlib.h>

//Os arrays são variaveis que armazenam vários valores
//Os arrays apontam para endereços fixos na memória
//Os endereços de cada elemento do array fica ao valor do tipo de distância um do outro, 
//por exemplo:
//int c[0] -> Endereço: abcdefgh00
//int c[1] -> Endereço: abcdefgh04
//
//veja que o valor andou 4 espaços na memória, isso porque o int tem 4 bytes de tamanho

int main(void){

  //int c[3]; //array de 3 posições
  unsigned char c[3];

  //verificando tamanho do array criado
  //lembrando que o sizeof retorna a quantidade de bytes no elemento analisado
  //então, enquanto c for do tipo char será retornado 3, isso porque um char tem tamanho de 8 bits ou 1 byte
  //caso o c fosse int, o valor retornado seria 12, já que o tamanho de um int é 4, e 4 * 3 é 12
  printf("O tamanho de c é: %zu\n", sizeof c);
  printf("O número de elementos em c é: %zu\n", sizeof c / sizeof(int)); //ou sizeof c / sizeof c[0]


  c[0] = 'A';

  printf("%c\n", c[0]);

  c[1] = '8';

  printf("%c\n", c[1]);

  c[2] = 0x65;

  printf("%c\n", c[2]);

  printf("O endereço do array c em memória: %p\n", c);
  printf("O endereço do array &c em memória: %p\n", &c);
  printf("O endereço do primeiro array c em memória: %p\n", &c[0]);
  printf("O endereço do segundo array c em memória: %p\n", &c[1]);

  printf("O valor de c[0] = %i\n", c[0]);
  printf("O valor de c[1] = %i\n", c[1]);
  printf("O valor de c[2] = %i\n", c[2]);
  

  return 0;
}
