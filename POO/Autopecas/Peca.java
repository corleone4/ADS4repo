package POO.Autopecas;

public class Peca { 
 private int codigo, estoque; 
 private double peso; 
 private String descricao; 

 public Peca(int codigo, int estoque, double peso, String descricao){ 
 this.codigo = codigo; 
 this.estoque = estoque; 
 this.peso = peso; 
 this.descricao = descricao; 
 } 

 public int getCodigo(){ 
 return codigo; 
 } 

 public void setCodigo(int codigo){ 
 this.codigo = codigo; 
 } 

 public int getEstoque(){ 
 return estoque; 
 } 

 public void setEstoque(int estoque){ 
 this.estoque = estoque; 
 } 

 public double getPeso(){ 
 return peso; 
 } 

 public void setPeso(double peso){ 
 this.peso = peso; 
 } 

 public String getDescricao(){ 
 return descricao; 
 } 

 public void setDescricao(String descricao){ 
 this.descricao = descricao; 
 } 
}