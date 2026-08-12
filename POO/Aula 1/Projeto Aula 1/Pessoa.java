package projetoaula1;

public class Pessoa {

    private String nome;
    private int idade;

    //Setters: métodos para modificar valores dos atributos 
    public void setNome(String valNome) {
        if (!valNome.isEmpty()) {
            nome = valNome;
        }
    }

    public void setIdade(int valIdade) {
        if (valIdade > 0) {
            idade = valIdade;
        }
    }
    
//Getters: métodos para recuperar os valores dos atributos

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
// Impressão
    
    public void print(){
        System.out.println("Nome:" + nome + "\n idade: " + idade);
    }

}