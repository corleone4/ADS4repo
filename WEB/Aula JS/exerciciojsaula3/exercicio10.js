function calcularCompra() {
  let produtos = [
    { nome: "Mouse", preco: 50, quantidade: 2 },
    { nome: "Teclado", preco: 100, quantidade: 1 },
    { nome: "Monitor", preco: 800, quantidade: 1 },
  ];

  let totais = produtos.map((produto) => {
    return produto.preco * produto.quantidade;
  });

  return totais.reduce((total, valor) => {
    return total + valor;
  }, 0);
}

console.log(calcularCompra());
