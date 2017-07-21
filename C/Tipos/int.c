#include <stdio.h>
#include <limits.h> //coloco para definir o INT_MAX
#include <stdint.h> //header que dentre suas funções permite definir tamanho da variavel (redefinição de tipo)
                    //de acordo com a arquitetura

#include <stdlib.h>


int main(void){
  
  //Declarando uma variavel
  //tipo nome
  //int i = INT_MAX; //INT_MAX -> tamanho maximo que o tipo int suporta
  //unsigned i = UINT_MAX; //UINT_MAX -> tamanho maximo do tipo int sem sinal
  //uint32_t i = ULONG_MAX; //garantindo que a variavel terá 32 bits

  //uint16_t t = USHRT_MAX;

  //short nome_da_variavel == short int nome_da_variavel 
  //short i;

  //trabalha da mesma forma que o short, porém com o tamanho maior
  //long i = LONG_MAX;

  //size_t i = 0;

  register int i =  0; //register == vai tentar colocar a variavel em um registrador

  //signed == com sinal, positivo e negativo
  //unsigned == sem sinal, apenas positivo
  
  //Verificando o tamanho da variavel,
  //com operador sizeof
  

  //Retorna o tamanho em bytes
  printf("%zu\n", sizeof i);

  //Para retornar em bits, pego o valor retornado em bits e multiplico por 8
  
  printf("%zu\n", sizeof i * 8);

  printf("O valor de i: %d\n", i);


  return 0;
}
