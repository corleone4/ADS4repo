public class Regular extends Cliente {

    private double minimoReaisCompra;
    private double desconto;

    public Regular(String nome, String dataUltimaCompra, String telefone, double minimoReaisCompra) {
        super(nome, dataUltimaCompra, telefone);
        this.minimoReaisCompra = minimoReaisCompra;
    }

    public double getMinimoReaisCompra() {
        return minimoReaisCompra;
    }

    public void setMinimoReaisCompra(double minimoReaisCompra) {
        this.minimoReaisCompra = minimoReaisCompra;
    }

    @Override
    public void registrarCompra(double valor, String data) {
        super.registrarCompra(valor, data);
    }

    @Override
    public void atribuirDesconto(double percentual) throws DescontoInvExc {
        if (percentual < 0 || percentual > 20) {
            throw new DescontoInvExc("Desconto deve estar entre 0% e 20%.");
        }
        this.desconto = percentual;
    }

    public double aplicarDesconto(double valor) {
        return valor - (valor * (desconto / 100));
    }

    @Override
    public void atribuirParcelas(int NumParcelas) throws ParcelamentoInvExc {
        throw new ParcelamentoInvExc("Clientes regulares não têm parcelamento.");
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Mínimo de compra em reais: " + minimoReaisCompra);
        System.out.println("Desconto: " + desconto + "%");
    }
}
