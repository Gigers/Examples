//Importando módulos no padrão ES6

import {mod1, mod2} from './modulos';

mod1();
mod2();

const http = require('http');
const server = http.createServer((req, res)=>{

  const url = req.url;

});

server.listen(3000, function(){
  console.log('Server is online');
});
