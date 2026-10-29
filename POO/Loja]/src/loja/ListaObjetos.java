/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

public class ListaObjetos {

    private ItemEstoqueInt[] lista = new ItemEstoqueInt[10];

    public int add(ItemEstoqueInt item) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = item;
                System.out.println("Item adicionado com sucesso na posição " + i);
                return i;
            }
        }
        System.out.println("Lista cheia.");
        return -1;
    }

    public boolean incUnits(int index, int qtd) {
        if (index < 0 || index >= lista.length || lista[index] == null) {
            return false;
        }

        lista[index].incUnits(qtd);
        return true;

    }

    public boolean decUnits(int index, int qtd) {
        if (index < 0 || index >= lista.length || lista[index] == null) {
            return false;
        }

        return lista[index].decUnits(qtd);

    }

    public void listAll() {
        float valorTotal = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                lista[i].print();
                valorTotal += lista[i].getPrice() * lista[i].getUnits();
            }
        }
        System.out.println("Valor total de estoque");
    }

}
