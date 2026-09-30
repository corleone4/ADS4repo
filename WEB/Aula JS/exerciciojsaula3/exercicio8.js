function maioresDeIdade() {
  let pessoas = [
    { nome: "João", idade: 20 },
    { nome: "Ana", idade: 16 },
    { nome: "Carlos", idade: 25 },
    { nome: "Maria", idade: 17 },
  ];

  console.log(pessoas.filter((pessoa) => pessoa.idade > 18));
}

maioresDeIdade();
