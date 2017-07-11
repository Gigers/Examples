#include <stdio.h>

void main(){
	int x,y,cont=0;
	x=10;
	while(x--){
		printf("X = %d\n",x);
	}
	printf("\n");
	while(x<10){
		printf("X = %d\n",x);
		x++;
	}
	printf("\n");
	while(x){
		printf("X = %d\n",x);
		x--;
	}
	printf("\n");
	x=0;
	y=1;
	do{
		cont++;
		printf("Repeticoes %d\n",cont);
		printf("A repeticao continuara ate x=0 ser maior que y=1\n");
		printf("X: ");
		scanf("%d",&x);
		printf("Y: ");
		scanf("%d",&y);
	}while(x<y);
	printf("\n");
	x=0;
	y=1;
	cont=0;
	while(x<y||y==1){
		cont++;
		printf("Repeticoes %d\n",cont);
		printf("A repeticao durara enquanto x=0 for menor que y=1 OU enquanto y=1 for 1\n");
		printf("X: ");
		scanf("%d",&x);
		printf("Y: ");
		scanf("%d",&y);
	}
	printf("\n");
	x=0;
	y=1;
	cont=0;
	while(x<y&&y==1){
		cont++;
		printf("Repeticoes %d\n",cont);
		printf("A repeticao durara enquanto x=0 for menor que y=1 E enquanto y=1 for 1\n");
		printf("X: ");
		scanf("%d",&x);
		printf("Y: ");
		scanf("%d",&y);
	}
}
