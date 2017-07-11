#include <stdio.h>
//std = standard / io = input output / h = header

void main (){
	
	int x=1,i=0,*px=&x;
	float y=1;
	double z = 1;
	char letra='a';
	char palavra[6]={'l','e','t','r','a','\0'};

	printf("\n\tMascaras:\n\n");
	/* 
	 * '\n' = new line
	 * '\t' = tabulacao
	 */
	printf("Inteiro = %d ou %i\n",x,x);
	printf("Float = %f\n",y);
	printf("Exponencial = %e ou %E\n",y,y);
	printf("Virgula apos casa decimal %.0f\n",y);
	printf("Long Double ou Dupla precisao = %lf\nLong int %ld\n",z,x);
	printf("Hexadecimal = %x ou %X\n",y,y);
	printf("Octal = %o\n",y);
	printf("Ponteiro = %p\n",px);
	printf("Char = %c\n",letra);
	printf("String = %s\n",palavra);
	printf("Imprimindo string com for: ");
	for(i;i<5;i++){
		printf("%c",palavra[i]);
	}printf("\n");
}
