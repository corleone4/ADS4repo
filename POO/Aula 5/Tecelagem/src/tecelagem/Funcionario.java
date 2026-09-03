package tecelagem;

public abstract class Funcionario {

    protected String nome, rg;
    protected double salarioBase;
    
    public abstract double salarioLiquido();

    public abstract void holerite();

    public abstract void novoMes();

}
