public class Eventual extends Cliente {

    private double valorUltimaCompra;

    public Eventual(String nome, String dataUltimaCompra, String telefone, double valorUltimaCompra) {
        super(nome, dataUltimaCompra, telefone);
        this.valorUltimaCompra = valorUltimaCompra;
    }

    public double getValorUltimaCompra() {
        return valorUltimaCompra;
    }

    public void setValorUltimaCompra(double valorUltimaCompra) {
        this.valorUltimaCompra = valorUltimaCompra;
    }

    @Override
    public void registrarCompra(double valor, String data) {
        super.registrarCompra(valor, data);
    }

    @Override
    public void atribuirDesconto(double Porcent) throws DescontoInvExc {
        throw new DescontoInvExc("Clientes eventuais não têm desconto.");
    }

    @Override
    public void atribuirParcelas(int NumParcelas) throws ParcelamentoInvExc {
        throw new ParcelamentoInvExc("Clientes eventuais não podem parcelar.");
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Valor da última compra: " + this.getValorUltimaCompra());
    }
}
