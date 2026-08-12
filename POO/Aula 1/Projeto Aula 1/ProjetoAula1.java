package projetoaula1;

public class ProjetoAula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(); // Construtor
        Pessoa p2 = new Pessoa();
        
        p1.setNome("Leon");
        p1.setIdade(30);
        p1.print();
    
        p2.setNome("Hunnigan");
        p2.setIdade(30);
        p2.print();
    }
    
}