// 14. Função anônima - fatorial

const fatorial = function(n) {
  if (n <= 1) return 1;
  return n * fatorial(n - 1);
};

console.log(fatorial(5)); // 120