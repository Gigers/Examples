#include <stdio.h>
#include <limits.h>
#include <stdint.h>
#include <stdlib.h>

/*
 *  = atribuição
 *  + - unarios
 *  + - binarios (Adição e subtração)
 *  * / (Multiplicação e divisão) - binarios
 *  % (resto da divisão)
 *  ++ (incremento)
 *  -- (decremento)
*/

//Operadores lógicos -> Operador é um sinal que faz uma operação com numeros ou outros simbolos

int main(void){

  int a;
  //Como já citado nas divisões pode acontecer que as divisões saiam apenas com inteiro
  //então vou utilizar o float (ponto flutuante) para fazer com que os valores decimais apareçam
  //float a;

  //Operador de atribuição: =
  
  //Operador aritmetico unário: + (Serve para dizer que um número é positivo
  //a = +10;
  //Operador aritmetico binario: + (Serve para realizar a adição)
  //a = 10 / 3;
  //A diferenciação vem com a quantidade de argumentos

  //para pegar o resto da divisão, utilizo: %

  a = 10 % 3;

  //Operador unário negativo: -

  //Operador de divisão
  //a = 10 / 3.0f; //Um dos números tem que ser float, para que a operação retorne float, não basta apenas o tipo ser float

  //Para copiar linha no vim utilizr yyp
  //printf("%d\n", a * 9);
  //printf("%f\n", a * 9);
  printf("%d\n", a);
  //printf("%f\n", a);

  
  //a = a + 1; esta operação pode ser feita com a += 1
  //a += 1; ou ainda a++
  //a++; //Perceba que esses três operadores são equivalentes

  //Essas operações não se limitam a adição, ela também pode ser utilizada com - / * (subtração, divisão e multiplicação), veja:
  
  //a--;
  //a *= 8;
  //a /= 2;

  printf("%d\n", a);


  return 0;
}
