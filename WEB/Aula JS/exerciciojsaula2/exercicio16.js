// 16. Closure com contador

function criarContador() {
  let contador = 0;
  return function () {
    contador++;
    console.log(contador);
  };
}

const incrementar = criarContador();
incrementar(); // 1
incrementar(); // 2