function separador() {
  console.log("\n ------------------------- \n");
}

function exercicio1() {
  console.log("Exercício 1");
  let frase = "Banana amassada";
  let total = frase.match(/a/gi).length;

  console.log("Total de letras A: " + total);
}

function exercicio2() {
  console.log("Exercício 2");
  let frase = "Frase";
  console.log(frase.split("").reverse().join(""));
}

function exercicio3() {
  console.log("Exercício 3");
  let frase = "Annaa";
  inversao = frase.split("").reverse().join("");
  if (frase.toLowerCase() === inversao.toLowerCase()) {
    console.log("Palíndromo");
  } else {
    console.log("Não é palíndromo.");
  }
}

function exercicio4() {
  console.log("Exercício 4");

  let frase = "Essa frase tem vogais";
  let total = frase.match(/[aeiou]/gi).length;

  console.log("Total de letras vogais: " + total);
}

function exercicio5() {
  console.log("Exercício 5");

  let frase = "Essa frase tinha espaços";
  let alteracao = frase.replace(/ /gi, "_");
  console.log(alteracao);
}

function exercicio6() {
  console.log("Exercício 6");

  let frase = "Essa frase tem palavras";
  let total = frase.trim().split(/\s+/).length;
  console.log("Essa frase tem " + total + " palavras");
}

function exercicio7() {
  console.log("Exercício 7");

  let palavra = "Luan";
  let maior = palavra[0];

  for (letra of palavra) {
    if (letra > maior) {
      maior = letra;
    }
  }
  console.log("Maior letra é: " + maior);
}

function exercicio8() {
  console.log("Exercício 8");

  let frase = "Essa frase tem 50 palavras de 2 letras";
  let total = frase.match(/[1234567890]/gi).length;

  console.log("Total de digitos na string: " + total);
}

function exercicio9() {
  console.log("Exercício 9");

  let frase = "Frase";
  let repetida = frase.repeat(3);

  console.log(repetida);
}

function exercicio10() {
  console.log("Exercício 10");

  let resultado = "";

  for (let i = 1; i <= 10; i++) {
    resultado += i;

    if (i < 10) {
      resultado += ", ";
    }
  }

  console.log(resultado);
}

exercicio1();
separador();
exercicio2();
separador();
exercicio3();
separador();
exercicio4();
separador();
exercicio5();
separador();
exercicio6();
separador();
exercicio7();
separador();
exercicio8();
separador();
exercicio9();
separador();
exercicio10();
