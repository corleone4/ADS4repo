// 19. Currying – multiplicar

function multiplicar(a) {
  return function(b) {
    return a * b;
  };
}

console.log(multiplicar(3)(4)); // 12