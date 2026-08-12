package projetoescola;

public class ProjetoEscola {

    public static void main(String[] args) {
        
        Aluno al1 = new Aluno();
        al1.setRa("0040402000009");
        al1.setN1(10);
        al1.setN2(8);
        al1.print();
        
        al1.media();
    }
    
}