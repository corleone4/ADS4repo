package tecelagem;

public class Vendedor extends Funcionario {
    private double vendaTotal;
    @Override
    public void holerite() {
        System.out.println("\nNome: " + nome + "\nRG: " + rg + "\nSalario base: " + salarioBase);
        System.out.printf("Salario liquido: %.2f%n", salarioLiquido());
    }

    @Override
    public void novoMes() {
        System.out.println("\nFechamento de mes");
        System.out.println("Valor total de venda: " + vendaTotal);
        System.out.printf("Valor total de comissao: R$ %.2f%n", (vendaTotal * 0.03));
        vendaTotal = 0;
    }

    @Override
    public double salarioLiquido() {
        return salarioBase + (0.03 * vendaTotal);
    }

    public void registrarVenda(float venda){
        System.out.println("Venda registrada no valor de R$ "+ venda + " com sucesso.");
        vendaTotal += venda;
    }
}
