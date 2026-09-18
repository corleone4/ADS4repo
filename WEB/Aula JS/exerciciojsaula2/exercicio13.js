// 13. Escopo de variáveis

let variavelGlobal = "Sou global";

function exemploEscopo() {
  let variavelLocal = "Sou local";
  console.log(variavelGlobal);
  console.log(variavelLocal); 
}

exemploEscopo();
console.log(variavelGlobal);
// console.log(variavelLocal); vai dar erro aq