function alunosAprovados() {
  let alunos = [
    { nome: "João", nota: 8 },
    { nome: "Maria", nota: 6 },
    { nome: "Carlos", nota: 9 },
    { nome: "Ana", nota: 5 },
  ];

  let aprovados = alunos.filter((aluno) => aluno.nota >= 7);

  return aprovados.map((aluno) => aluno.nome);
}

console.log(alunosAprovados());

