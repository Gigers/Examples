%Até agora como já visto os vetores adicionados são vetores linha
%Porém muitas vezes é necessário criar vetores coluna. Então será demonstrado a forma
%de realizar a criação deste tipo de vetor

%Antes de definir os vetores coluna, primeiro será definido alguns linhas para que
%a diferença entre eles seja entendida

%Definindo vetor linha
x = (1:1:3);
disp(x);

%Definindo vetor coluna
a = [1; 2; 3];
disp(a);

%Também é possivel transformar um vetor linha em vetor coluna, veja:
clear a x;
x = 1:3; %Criação do vetor-linha
b = x'; %Transformando o vetor-linha em vetor-coluna
