public interface ClienteInt {
    void registrarCompra(double Valor, String Data);

    void atribuirDesconto(double Porcent) throws DescontoInvExc;

    void atribuirParcelas(int NumParcelas) throws ParcelamentoInvExc;

    void imprimirDados();

    
}