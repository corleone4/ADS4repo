package projetoescola;

public class Aluno {
    private String ra;
    private double n1, n2;
    
    public void setRa(String valRa){
        if (!valRa.isEmpty()){
            ra = valRa;
        }
    }
    
    public void setN1(double valN1){
        n1 = valN1;
    }
    
    public void setN2(double valN2){
        n2 = valN2;
    }
    
    public String getRa(){
        return ra;
    }
    
    public double getN1(){
        return n1;
    }
    
    public double getN2(){
        return n2;
    }
    
    public void print(){
        System.out.println("RA: " + ra + "\n N1: " + n1 + "\n N2: " + n2);
    }
    
    public void media(){
        double media = Math.ceil((n1 + n2) / 2);
        System.out.println("Sua média é: " + media); 
    }
}