function ordenarPor(propriedade) {
  let pessoas = [
    { nome: "Carlos", idade: 25 },
    { nome: "Ana", idade: 18 },
    { nome: "João", idade: 30 },
  ];
  return pessoas.sort((a, b) => {
    if (a[propriedade] > b[propriedade]) {
      return 1;
    }

    if (a[propriedade] < b[propriedade]) {
      return -1;
    }

    return 0;
  });
}

console.log(ordenarPor("idade"));
