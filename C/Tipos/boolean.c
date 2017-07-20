#include <stdio.h>
#include <stdbool.h> //biblioteca necessária

int main(void){

  bool b; //Implementação mais recente

  /*
   * Antes era utilizado o char para fazer os testes lógicos
   * char c;
   * c = 0; -> false
   * c = 1; -> true
   */

  b = true;
  b = false;

  //verificando tamanho de b
  printf("O tamanho de b (bool) eh: %lu\n", sizeof b);


  b = true;
  printf("O valor de b é %i\n", b);

  b = false;
  printf("O valor de b é %i\n", b);

  return 0;
}
