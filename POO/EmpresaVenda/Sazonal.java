public class Sazonal extends Cliente {

    private int mesCompra;
    private double minimoReaisCompra;
    private int parcelas = 1;

    public Sazonal(String nome, String dataUltimaCompra, String telefone,
                   int mesCompra, double minimoReaisCompra) {
        super(nome, dataUltimaCompra, telefone);
        this.mesCompra = mesCompra;
        this.minimoReaisCompra = minimoReaisCompra;
    }

    public int getMesCompra() {
        return mesCompra;
    }

    public void setMesCompra(int mesCompra) {
        this.mesCompra = mesCompra;
    }

    public double getMinimoReaisCompra() {
        return minimoReaisCompra;
    }

    public void setMinimoReaisCompra(double minimoReaisCompra) {
        this.minimoReaisCompra = minimoReaisCompra;
    }

    @Override
    public void registrarCompra(double valor, String data){
        super.registrarCompra(valor, data);
    }
    
    public int getParcelas() {
        return parcelas;
    }

    @Override
    public void atribuirDesconto(double porcent) throws DescontoInvExc {
        throw new DescontoInvExc("Clientes sazonais não têm desconto.");
    }

    @Override
    public void atribuirParcelas(int parcelas) throws ParcelamentoInvExc {
        if (parcelas < 1 || parcelas > 6) {
            throw new ParcelamentoInvExc("Parcelas deve estar entre 1 e 6.");
        }
        this.parcelas = parcelas;
    }

    public double calcularParcela(double valor) {
        return valor / parcelas;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Mês habitual de compra: " + getMesCompra());
        System.out.println("Valor mínimo: R$ " + getMinimoReaisCompra());
        System.out.println("Parcelas: " + getParcelas());
    }
}