#include <stdio.h>

void main(){
  int x,y;

  //0 é falso, tudo além de 0 é verdade
  
  if(0)
    printf("Falso\n");
  /*
   *
   * Este if não será executado pois o booleano retornado em seu teste é falso
   * 
   */

  if(!0)
    printf("Nao falso == Verdade\n");
  /*
   *
   * Este if será pois o exclamação ! significa não, não falso é igual a verdade
   *
   */

  if(1)
    printf("Verdade\n");
  /*
   *
   * Como explicado tudo que for diferente de 0 é True/Verdade
   *
   */

  if(!1)
    printf("Nao verdade = False\n");

  printf("Digite dois valores\nx: ");
  scanf("%d",&x);
  printf("y: ");
  scanf("%d",&y);

  if(x>y){//O valor de x for maior que o valor de y?
    printf("x = %d eh maior que y = %d\n",x,y);
  }

  //se a primeira condição for falsa o próximo teste é executado e o algoritmo verifica
  else if(y>x){//y é maior que x?
    printf("y = %d eh maior que x = %d\n",y,x);
  }
  //se os testes anteriores forem falsos automaticamente a alternativa que falta é
  else{//Os valores são iguais
    printf("Os valores sao iguais\n");
  }

  //x é igual a y?
  if(x==y)
    printf("%d == %d\n",x,y);
  //x é diferente de y?
  if(x!=y){
    printf("x eh diferente de y\n");
    if (x>=y || x>0){//se x for maior que 0 OU maior que y OU igual a y
      if(x>=y && x>0){//x é maior OU igual a y E maior que 0?
        printf("x eh positivo e maior que y\n");
      }
    }
    
    if (x<=y || x<0){//se x for menor que 0 OU menor que y OU igual a y
      if(x<=y && x<0){//x é maior OU igual a y E maior que 0?
        printf("x eh negativo e menor que y\n");
      }
    }
  }
}
