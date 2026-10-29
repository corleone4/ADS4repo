/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loja;

/**
 *
 * @author 0040482512001
 */
public class Loja {

    public static void main(String[] args) {
       Roupa rp1 = new Roupa(12, "Camiseta Neo qtd 5", 300, 5);
       Roupa rp2 = new Roupa(11, "Camiseta 15 qtd 8", 170, 8);
       Roupa rp3 = new Roupa(14, "Camiseta 1 qtd 12", 200, 12);
       Roupa rp4 = new Roupa(13, "Camiseta 2 qtd 2", 150, 2);
       ListaObjetos lista = new ListaObjetos();
       lista.add(rp1);
       lista.add(rp2);
       lista.add(rp3);
       lista.add(rp4);
       
       lista.incUnits(1, 10);
       lista.decUnits(2, 1);
       
       lista.listAll();
    }
    
}
