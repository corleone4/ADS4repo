const carro1 = new Carro("Toyota", "Corolla", 2025, 0);
const carro2 = new Carro("Chevrolet", "Tracker", 2026, 120);
const carro3 = new Carro("BMW", "320i", 2026, 160);
carro1.acelerar(50);
carro1.acelerar(30);
carro1.frear(20);
carro1.mostrarDados();

function Carro(marca, modelo, ano, velocidade) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.velocidade = velocidade;

    this.acelerar = function (valor) {
        this.velocidade += valor;
    };

    this.frear = function (valor) {
        this.velocidade -= valor;

        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    };

    this.mostrarDados = function () {
        console.log(
            "Marca: " + this.marca +
            " | Modelo: " + this.modelo +
            " | Ano: " + this.ano +
            " | Velocidade: " + this.velocidade + " km/h"
        );
    };
}

const carros = [carro1, carro2, carro3];

carros.forEach(carro => {
    carro.mostrarDados();
});