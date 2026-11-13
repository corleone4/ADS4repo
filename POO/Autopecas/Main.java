package POO.Autopecas;

public class Main 
{ 
 public static void main(String[] args) { 
 Peca pc = new Peca(10, 5, 1.50, "Parafuso Pesado"); 
 Peca pc2 = new Peca(15, 5, 0.20, "Parafuso Leve"); 

 ListaPecas lista = new ListaPecas(10); 
 lista.adicionarPeca(pc); 
 lista.adicionarPeca(pc2); 

 lista.acrescentarUnidades(0, 5); 
 lista.retirarUnidades(1, 5); 

 lista.relatorioGeral(); 
 lista.relatorioReposicao(3); 
 System.out.println(""); 
 } 
}
