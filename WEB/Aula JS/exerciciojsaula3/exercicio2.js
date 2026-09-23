function acharMaiorNumero() {
    let numeros = [10, 15, 20, 25, 30];
    let maiorNumero = 0;
    for (let i = 0; i < numeros.length; i++) {
        if (numeros[i] > maiorNumero){
            maiorNumero = numeros[i];
        }
    }
    console.log(maiorNumero);
}

acharMaiorNumero();