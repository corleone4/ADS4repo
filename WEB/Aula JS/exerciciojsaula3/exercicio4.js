function arrayInvertido() {
    let numeros = [10, 15, 20, 25, 30, 25, 10, 40];
    let novoArray = [];

    novoArray = [...new Set(numeros)];

    console.log(novoArray);
}

arrayInvertido();
