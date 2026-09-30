function calcularMedia(array) {

    numeros = [10, 8, 6];

    let soma = numeros.reduce((total, numero) => {
        return total + numero;
    }, 0);

    console.log(soma / numeros.length);
}

calcularMedia();