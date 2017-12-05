//Módulo criado para iniciar os arquivos
//do babel antes de iniciar o server http

require("babel-core").transform("code", options);
require('./server');
