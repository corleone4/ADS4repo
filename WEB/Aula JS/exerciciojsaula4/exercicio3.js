const contaBancaria = {
    titular: "Ana",
    saldo: 1000,

    depositar(deposito) {
        this.saldo += deposito;
        console.log("R$ " + this.saldo + " de saldo depositado");
    },

    sacar(saque) {
        this.saldo -= saque;
        console.log("R$ " + this.saldo + " de saldo sacado.")
    },

    mostrarSaldo(){
        console.log("R$ " + this.saldo);
    }
};
contaBancaria.depositar(500);
contaBancaria.sacar(200);
contaBancaria.mostrarSaldo();

