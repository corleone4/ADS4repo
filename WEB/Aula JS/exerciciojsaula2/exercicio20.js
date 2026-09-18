// 20. Composição de funções
function compor(f, g) {
  return function(x) {
    return g(f(x));
  };
}
const somaUm = (x) => x + 1;
const dobro = (x) => x * 2;
const composta = compor(somaUm, dobro);
console.log(composta(5)); // (5+1)*2 = 12