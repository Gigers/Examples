%-- Um pouco sobre listas

% Listas são formas especiais de representar matrizes
% Neste caso, cada elemento da matriz pode conter outras matrizes
% Veja:

% Primeira matriz
a = 1:3;
% Segunda matriz
b = rand(2,2);
% Terceira matriz
c = 1;
% Quarta matriz (Junção da 'a' com 'c')
d = {a c};

% Definindo uma lista
lister = {a b c d};

disp(lister);

%-- Para consultar os valores da lista utilize:
%-- lister{Numero-da-matriz}(elementos-da-matriz-selecionada)

disp(lister{1}(1,2));