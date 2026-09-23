function arrayInvertido() {
    let numeros = [10, 15, 20, 25, 30];
    let numerosInvertidos = [];
    let index = numeros.length;

    for (let i = 0; i < numeros.length; i++) {
        
        numerosInvertidos[i] = index;
        index--;

    }
    console.log(numerosInvertidos);
}

arrayInvertido();