//Página para quebrar o array

const _ = require('lodash');
const array = [4, 6, 2, 6, 7, 8, 9, 3, 2];


console.log('Imprimindo de 3 em 3');

_.chunk(array, 3).forEach((item)=>{

  console.log('-----');
  item.forEach((i)=>{
    console.log(i + '!');
  })

});
