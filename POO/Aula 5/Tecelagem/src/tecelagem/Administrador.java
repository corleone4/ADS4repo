package tecelagem;

public class Administrador extends Funcionario {

    private int faltas;

    @Override
    public void holerite() {
        System.out.println("Nome: " + nome + "\nRG: " + rg + "\nSalario base: " + salarioBase);
        System.out.printf("Salario liquido: %.2f%n", salarioLiquido());
    }

    @Override
    public void novoMes() {
        System.out.println("\nFechamento de mes");
        System.out.printf("Descontado: %.2f%n \n", salarioBase * ((float) faltas / 30));
        faltas = 0;
    }

    @Override
    public double salarioLiquido() {
        float desconto = 30 - faltas;

        if (faltas == 0) {
            return salarioBase;
        } else {

            return salarioBase * (desconto / 30);
        }
    }

    public void registrarFalta() {
        faltas++;
        System.out.println("Falta registrada. Suas faltas no momento sao: " + faltas + " de um total de 30 dias");
    }
}
