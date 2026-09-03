package tecelagem;

public class Tecelagem {

    public static void main(String[] args) {
        Administrador adm = new Administrador();
        Vendedor vnd = new Vendedor();
        Produtor prd = new Produtor();

        adm.nome = "Luan";
        vnd.nome = "Henrique";
        prd.nome = "Ferreira";

        adm.rg = "52.041.004-1";
        vnd.rg = "52.042.005-2";
        prd.rg = "52.043.006-3";
           
        System.out.println("\n --- ADMINISTRADOR ---- \n ");
        
        adm.salarioBase = 2500;
        vnd.salarioBase = 1500;
        prd.salarioBase = 175;

        adm.registrarFalta();
        adm.registrarFalta();
        
        adm.holerite();
        adm.novoMes();
        adm.holerite();
        
        System.out.println("\n --- VENDEDOR ---- \n ");
        
        vnd.registrarVenda(1560);
        vnd.registrarVenda(9150);
        vnd.registrarVenda(94150);

        vnd.holerite();
        vnd.novoMes();
        vnd.holerite();
        
        System.out.println("\n --- PRODUTOR ---- \n ");
            
        prd.registrarHorasDiurnas(6);
        prd.registrarHorasNoturnas(6);
        prd.registrarHorasNoturnas(2);

        prd.holerite();
        prd.novoMes();
        prd.registrarHorasNoturnas(2);
        prd.holerite();
    }

}
