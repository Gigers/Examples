//Server http feito em node


//Importa os módulos e cria o sistema com o request e o response
const http = require('http');
const server = http.createServer((req, res) =>{

  //Informações do acesso ao servidor

  const headers = req.headers;
  const method = req.method;
  const url = req.url;

  /*
  console.log("Headers");
  console.log(headers);
  console.log("Method: " + method);
  console.log("URL: " + url);
  */

  if(url == '/teste'){
    res.setHeader('Content-type', 'text/html');
    res.end('<h1>Olar mundos</h1>');
  }

  //Devolvendo Json
  if(url == '/json'){
    res.setHeader('Content-type', 'application/json');
    const data = {
      id: 1,
      name: 'User'
    };
    res.end(JSON.stringify(data));
  }

});

//Configura a porta a qual o http server irá responder
server.listen(3000, function(){
  console.log('O servidor está online!');
});
