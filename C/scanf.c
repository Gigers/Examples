#include <stdio.h>

void main(){
	int x,d,m,a;
	float y;
	double z;
	printf("Digite os valores: \n\n");
	printf("Valor inteiro: ");
	scanf("%d",&x);
	/*
		& = endereço de alguma variável, neste caso o endereço de memória da variável x
	*/
	printf("X = %d\n",x);
	printf("Valor com ponto flutuante, float: ");
	scanf("%f",&y);
	printf("Y = %f\n",y);
	printf("Valor com dupla precisao: ");
	scanf("%lf",&z);
	printf("Z = %lf\n",z);
	printf("Data dd/mm/aaaa: ");
	scanf("%d/%d/%d",&d,&m,&a);
	printf("%d/%d/%d\n",d,m,a);
	printf("Dois valores inteiros separados por espaco: ");
	scanf("%d %i",&m,&a);
	printf("M\t%d\nA\t%i\n",m,a);
	printf("Valores inteiros separados por traco ' - ': ");
	scanf("%d-%i",&m,&a);
	printf("M = %d\nA = %i\n",m,a);
}
