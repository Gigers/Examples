#include <stdio.h>

int main(void){
  
  //Declarando uma variavel
  //tipo nome
  signed char c; 

  //signed == com sinal, positivo e negativo
  //unsigned == sem sinal, apenas positivo
  
  //Verificando o tamanho da variavel,
  //com operador sizeof
  //lu = unsigned long
  //Retorna o tamanho em bytes
  printf("%lu\n", sizeof c);

  //Para retornar em bits, pego o valor retornado em bits e multiplico por 8
  
  printf("%lu\n", sizeof c * 8);

  c = 127;
  printf("O valor de c: %i\n", c);  

  //c = 10;
  //c = 0xa;
  //c = '\n';

  //printf("Valor de c: %i\n", c);
  
  return 0;
}
