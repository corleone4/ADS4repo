// 12. Função saudacao com parâmetro padrão

function saudacao(nome = "Visitante") {
  return `Olá, ${nome}!`;
}

console.log(saudacao("João"));
console.log(saudacao());