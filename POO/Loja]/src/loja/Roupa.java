/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

public class Roupa implements ItemEstoqueInt {

    private int tamanho;
    private String descricao;
    private double preco;
    private int quantidade;

    public Roupa(int tamanho, String descricao, double preco, int quantidade) {
        this.tamanho = tamanho;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getUnits() {
        return getQuantidade();
    }

    public void incUnits(int qtd) {
        this.quantidade += qtd;
    }

    public boolean decUnits(int qtd) {
        if (qtd > this.quantidade) {
            return false;
        }
        this.quantidade -= qtd;
        return true;
    }

    public float getPrice() {
        return (float) getPreco();
    }

    public void print() {
        System.out.println("Descrição: " + getDescricao() + "\n Tamanho: " + getTamanho() + "\n Preco: " + getPrice() + "\n Quantidade: " + getQuantidade());
    }

}
