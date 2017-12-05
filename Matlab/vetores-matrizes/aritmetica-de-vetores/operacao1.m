%Realizando algumas operações com matrizes

function operacao1(choose)

  %Declarando uma matriz
  g = [1 2 3 4; 5 6 7 8];

  %Declarando um vetor
  y = [1 2 3 4];


  if choose == 1
    %Multiplicando a matriz;
    h = 2 * g;

    h = num2str(h);

    %Função para adição de linhas no console
    msgbox(h); %Exibindo os valores

  end
  %Limpando o valor de h

  if choose == 2

    h = g - 1;

    h = num2str(h);

    msgbox(h);

  end

  %Multiplicacao e subtracao
  if choose == 3

    %Realizando Multiplicacao e subtração dos elementos
    h = 2 * g - 1;


    h = num2str(h);
    msgbox(h);


    %Divisão

    clear h;

    h = g / 2;

    h = num2str(h);
    msgbox(h);

  end

  %Adição entre matriz de valores diferentes

  if choose == 4

    clear h y;

    g = [1 2 3 4; 5 6 7 8];
    h = [1 1 1 1; 2 2 2 2];
    u = g + h;


    g = num2str(g);
    h = num2str(h);
    u = num2str(u);

    msgbox(g);
    msgbox(h);

    msgbox(u);

  end

  %Multuplicação entre matrizes de valores diferentes
  if choose == 5

      clear all;
      g = [4 4 4 4; 5 5 5 5];
      h = [3 3 3 3; 7 7 7 7];

      u = g .* h; % (.*) Este simbolo representa a multiplicação escalar pontuada
                  % O ponto antes do asterisco, significa que a multiplicação deve ser feita elemento a elemento
                  % A multiplicação sem o ponto significa multiplicação matricial

      g = num2str(g);
      h = num2str(h);
      u = num2str(u);

      msgbox(u);
  end
  if choose == 6

    clear all;
    g = [9 9 9 9; 81 81 81 81];
    h = [3 3 3 3; 3 3 3 3];
    u = g / h;
    % O (./) tem a mesma função que o .* no outro exercício

    g = num2str(g);
    h = num2str(h);
    u = num2str(u);

    msgbox(u);

  end
end
