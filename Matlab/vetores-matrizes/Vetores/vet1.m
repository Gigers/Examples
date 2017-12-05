%Todos os vetores aqui adicionados são vetores linha

% Calculo da função y = sen(x) em 0 <= x <= pi.

%Limpando os valores de todas as variaveis alocadas

clear all;

%1° - Cria-se um vetor com todos os valores que deverão ser calculados em y
x = [0 0.1*pi 0.2*pi 0.3*pi 0.4*pi 0.5*pi 0.6*pi 0.7*pi 0.8*pi 0.9*pi pi];

%Abaixo o 'y' receberá todos os valores presentes em x
%e irá calcular o seno
y = sin(x);

%Caso fosse necessário algum elemento específico que está presente em x
%basta especificar sua posição dentro do vetor (Assim como é feito nas Strings ou utilizando end)

%OBS: As posições no matlab começam a ser calculadas em 1

%Por exemplo

%Mostra o primeiro elemento
disp(x(1));

%Do segundo até o ultimo
disp(x(2: end));
