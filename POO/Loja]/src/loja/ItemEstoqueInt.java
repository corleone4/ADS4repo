/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package loja;

/**
 *
 * @author 0040482512001
 */
public interface ItemEstoqueInt {
	void incUnits(int qtd);
	boolean decUnits(int qtd);
	int getUnits();
	float getPrice();
	void print();
}

