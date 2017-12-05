%Veja que todos os vetores aqui adicionados são vetores linha

%No script vet1.m todos os termos de 'x' foram escritos a mão
%Porém não é necessário que isso seja feito, existem formas mais simples de fazer
%Veja:

clear all; %Limpando todas as variaveis alocadas

%Do zero até pi, incrementando a cada loop 0.1
x = (0:0.1:1) * pi;

%Exibindo 'x'
disp('Valores:'); disp(x);

clear x;
addLine;

%Vetor que começa com zero, vai até pi com 11 elementos (Utilizando linspace)
%Linspace(primeiro_valor,ultimo_valor, numero_de_valores);

primeiro_valor = 0;
ultimo_valor = pi;
numero_de_valores = 11;

%Gerando os valores utilizando linspace e variaveis
x = linspace(primeiro_valor, ultimo_valor, numero_de_valores);

%Exibindo valor
disp('Linspace: '); disp(x);


clear x;
clear numero_de_valores;
addLine;

%Gerando uma escala logaritmica que começa em 10° e vai até o valor 10^2 com 11 elementos
%Utiliza-se a função logspace
%logspace(primeiro_expoente, ultimo_expoente, numero_de_valores)

primeiro_expoente = 0;
ultimo_expoente = 2;
numero_de_valores = 11;

x = logspace(primeiro_expoente, ultimo_expoente, numero_de_valores);

disp('Logspace: '); disp(x);

clear all;
addLine;
