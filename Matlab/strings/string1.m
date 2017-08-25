%Script para conhecer melhor as strings

%Declaração de strings (Utiliza-se de aspas simples)
s = 'O universo é legal';
sp = 'NEAESP';

%Pegando partes especificas da string
%Vale lembrar que o indice do matlab começa no valor 1

%Apenas o primeiro valor
disp('Primeiro caractere da variavel "s"');
disp(s(1));

disp('Primeiro caractere da variavel "sp"');
disp(sp(1));

disp(' ');

%Multiplos valores
%length é uma função que retorna a quantidade de caracteres

disp('Do primeiro ao quinto caractere da variavel "s"');
disp(s(1:5)); %Do primeiro ao quinto caractere

disp('Do terceiro ao ultimo caracatere da variavel "sp" ');
disp(sp(3:length(sp))); %Do primeiro ao ultimo item
