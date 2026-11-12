public abstract class Cliente implements ClienteInt{
    private String nome;
    private String dataUltimaCompra;
    private String telefone;

    public Cliente(String nome, String dataUltimaCompra, String telefone) {
        this.nome = nome;
        this.dataUltimaCompra = dataUltimaCompra;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataUltimaCompra() {
        return dataUltimaCompra;
    }

    public void setDataUltimaCompra(String dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void registrarCompra(double valor, String data){
        this.dataUltimaCompra = data;
    };

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data da última compra: " + dataUltimaCompra);
        System.out.println("Telefone: " + telefone);
    }
}

