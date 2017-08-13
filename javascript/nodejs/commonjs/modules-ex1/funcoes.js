/*
Exportando todo o módulo utilizand uma função
Este arquivo exporta apenas um método
O uso da notação module.exports é mais comumente
encontrado,  pois  ela  permite  encapsular  objetos
JavaScript e funções enquanto em um único ponto de entrada.
*/

module.exports = function(x){

  //Verifica se o argumento é par ou impar
  if((x % 2) == 0){
    var par = "Sim";
  } else {
    var par = "Não";
  }

  //Retorno do module.exports
  return {
    msg: 'O valor é par ?',
    value: par
  };

};
