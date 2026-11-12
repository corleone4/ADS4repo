public class Main {
    public static void main(String[] args) {
        Regular reg = new Regular("Luan", "12", "10", 5);
        Sazonal saz = new Sazonal("Luan que vem as vezes", "23", "10", 5, 250);
        Eventual evt = new Eventual("Luan que nunca vem", "23", "10", 269);

        reg.registrarCompra(1500, "12");
        saz.registrarCompra(1200, "12");
        evt.registrarCompra(6000, "12");

        try {
            reg.atribuirDesconto(15);
        } catch (DescontoInvExc e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            saz.atribuirParcelas(5);
        } catch (ParcelamentoInvExc e) {
            System.out.println("Erro: " + e.getMessage());
        }

        reg.aplicarDesconto(1500);
        saz.calcularParcela(1200);

        reg.imprimirDados();
        System.out.println("-=-=-=-=-=-=-");    
        saz.imprimirDados();
        System.out.println("-=-=-=-=-=-=-");  
        evt.imprimirDados();
    }
}