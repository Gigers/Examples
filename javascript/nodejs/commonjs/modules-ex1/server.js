const operations = require('./operations');
const funcoes = require('./funcoes');
const funcoes2 = require('./funcoes2');

const http = require('http');
const server = http.createServer((req, res) =>{

  const url = req.url;
  const resultado = funcoes(1);

  //console.log(operations.var1);
  //console.log(operations.var2);

  const add = funcoes2.adicao(5, 7);
  const sub = funcoes2.subtracao(7, 3);

  console.log('\nVerificando se o valor é par');
  console.log(resultado.msg, resultado.value);

  console.log('\nAdição');
  console.log(add);
  console.log('Subtração');
  console.log(sub);

});

server.listen(3000,function(){
  console.log('Server is online!');
});
