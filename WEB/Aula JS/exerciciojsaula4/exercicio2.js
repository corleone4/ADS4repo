const produtos = [
    { nome: "Teclado", preco: 120 },
    { nome: "Mouse", preco: 80 },
    { nome: "Monitor", preco: 900 },
    { nome: "Notebook", preco: 3500 }
];

produtos.forEach(element => {
    console.log(element.nome + " R$" + element.preco);
    if (element.preco > 500) console.log("Produto de alto valor")
    element["emEstoque"] = true;
});

console.log(produtos)