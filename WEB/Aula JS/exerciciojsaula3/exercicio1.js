function somaNumeros() {
    let numeros = [10, 15, 220, 25, 30];
    let soma = 0;
    for (let i = 0; i < numeros.length; i++) {
        soma += numeros[i];
    }
    console.log(soma);
}

somaNumeros();