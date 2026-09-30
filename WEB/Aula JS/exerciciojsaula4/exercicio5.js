

class Funcionario {
    constructor(nome, cargo, salario, departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    mostrarDados() {
        console.log(
            "Nome: " + this.nome +
            " | Cargo: " + this.cargo +
            " | Salário: R$" + this.salario +
            " | Departamento: " + this.departamento
        );
    }
}

const funcionarios = [
    new Funcionario("Carlos", "Desenvolvedor", 4500, "TI"),
    new Funcionario("Ana", "Analista", 5000, "RH"),
    new Funcionario("João", "Gerente", 7000, "Financeiro")
]; 

const funcionario = funcionarios[1];
const funcionarioAtualizado = { ...funcionario, salario: 5500 }

const novoFuncionario = new Funcionario("Maria", "Designer", 5000, "TI");

const novaLista = [...funcionarios, novoFuncionario];

console.log("Nova lista de funcionarios");

novaLista.forEach(funcionario => funcionario.mostrarDados)



console.log("\nFuncionário atualizado:");
console.log(funcionarioAtualizado);

const { nome, cargo, ...outrasInformacoes } = funcionarioAtualizado;

console.log("\nNome:", nome);
console.log("Cargo:", cargo);
console.log("Outras informações:", outrasInformacoes);

console.log("\nTodos os funcionários:");

novaLista.forEach(funcionario => {
    funcionario.mostrarDados();
});