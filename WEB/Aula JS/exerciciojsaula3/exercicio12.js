function totalEntradas() {
  let transacoes = [
    { tipo: "entrada", valor: 1000 },
    { tipo: "saida", valor: 300 },
    { tipo: "entrada", valor: 500 },
    { tipo: "saida", valor: 200 },
    { tipo: "entrada", valor: 250 },
  ];

  let entradas = transacoes.filter((transacao) => transacao.tipo === "entrada");

  let valores = entradas.map((transacao) => transacao.valor);

  return valores.reduce((total, valor) => total + valor, 0);
}

console.log(totalEntradas());

