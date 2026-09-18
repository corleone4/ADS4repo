// 21. Arrow function com múltiplas linhas
const infoNumero = (numero) => {
  return {
    numero: numero,
    quadrado: numero ** 2,
    cubo: numero ** 3
  };
};

console.log(infoNumero(3)); // { numero: 3, quadrado: 9, cubo: 27 }