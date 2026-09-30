const aluno = {
    nome: "Carlos",
    idade: 21,
    curso: "Análise e Desenvolvimento de Sistemas",
    semestre: 4,
    matricula: "2026001"
}

console.log(aluno.nome);
console.log(aluno["curso"])

aluno.semestre = 5;
aluno.matricula = "2512001";

console.log(aluno)