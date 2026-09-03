package tecelagem;

public class Produtor extends Funcionario {

    private int horasDiurnas, horasNoturnas;

    @Override
    public void holerite() {
        System.out.println("\nNome: " + nome + "\nRG: " + rg + "\nSalario base: " + salarioBase);
        System.out.printf("Salario liquido: %.2f%n", salarioLiquido());
    }

    @Override
    public void novoMes() {
        System.out.println("\nFechamento de mes");
        System.out.println("Horas diurnas: " + horasDiurnas);
        System.out.println("Horas diurnas: " + horasNoturnas);
        horasDiurnas = 0;
        horasNoturnas = 0;
    }

    @Override
    public double salarioLiquido() {
        //         150              4             150+30%               4
        return (salarioBase * horasDiurnas) + (salarioBase * 1.30 * horasNoturnas);
    }

    public void registrarHorasDiurnas(int hrs) {
        horasDiurnas += hrs;
        System.out.println(hrs + " Horas diurnas registradas com sucesso.");
        System.out.println("Total: " + horasDiurnas);
    }

    public void registrarHorasNoturnas(int hrs) {
        horasNoturnas += hrs;
        System.out.println(hrs + " Horas noturnas registradas com sucesso.");
        System.out.println("Total: " + horasNoturnas);
    }
}
