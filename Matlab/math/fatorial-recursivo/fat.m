% Calculo da função fatorial utilizando recursão

function resultado = fat(n)

  %round() -> arredonda para o inteiro ou decimal mais proximo
  if n < 0 || round(n) ~= n
    error('O argumento deve ser um inteiro >= 0');
  elseif (n == 0)
    resultado = 1;
  else
    resultado = n * fat(n - 1);

  end

end
