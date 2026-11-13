package POO.Autopecas;

public class ListaPecas implements ListaControl {

    private Peca[] pecas;
    private int quantidade;

    public ListaPecas(int capacidade) {
        this.pecas = new Peca[capacidade];
        this.quantidade = 0;
    }

    public int adicionarPeca(Peca pc) {
        if (quantidade < pecas.length) {
            int indice = quantidade;
            pecas[indice] = pc;
            quantidade++;
            return indice;
        } else {
            System.out.println("Lista cheia!");
            return -1;
        }
    }

    public boolean retirarUnidades(int index, int qtd) {
        if (index >= 0 && index < quantidade) {
            if (qtd > 0 && qtd <= pecas[index].getEstoque()) {
                pecas[index].setEstoque(
                        pecas[index].getEstoque() - qtd);
                return true;
            }
        }

        return false;
    }

    public boolean acrescentarUnidades(int index, int qtd) {
        if (index >= 0 && index < quantidade) {
            pecas[index].setEstoque(
                    pecas[index].getEstoque() + qtd);
            return true;
        }

        return false;
    }

    public boolean imprimirPeca(int index) {
        if (index >= 0 && index < quantidade) {
            System.out.println(
                    "Peça: " + pecas[index].getCodigo() +
                            "\nDescrição: " + pecas[index].getDescricao() +
                            "\nPeso: " + pecas[index].getPeso() +
                            "\nEstoque: " + pecas[index].getEstoque());
            return true;
        } else {
            return false;
        }

    }

    public void relatorioGeral() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(
                    "Peça índice " + i + ", código: " + pecas[i].getCodigo() +
                            "\nDescricao:" + pecas[i].getDescricao() +
                            "\nEstoque: " + pecas[i].getEstoque() +
                            "\nPeso: " + pecas[i].getPeso());
        }
    }

    public void relatorioReposicao(int qtdMin) {

        for (int i = 0; i < quantidade; i++) {
            if (pecas[i].getEstoque() <= qtdMin) {
                System.out.println(
                        "Peça índice " + i + ", código: " + pecas[i].getCodigo() +
                                "\nDescricao:" + pecas[i].getDescricao() +
                                "\nEstoque: " + pecas[i].getEstoque() +
                                "\nPeso: " + pecas[i].getPeso());
            }
        }
    }
}