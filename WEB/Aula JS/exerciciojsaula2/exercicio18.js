// 18. Função de ordem superior - aplicar

function aplicar(funcao, valor) {
  return funcao(valor);
}

console.log(aplicar((x) => x * 2, 5)); // 10