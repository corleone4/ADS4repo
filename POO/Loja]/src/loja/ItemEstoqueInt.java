package loja;

public interface ItemEstoqueInt {
	void incUnits(int qtd);
	boolean decUnits(int qtd);
	int getUnits();
	float getPrice();
	void print();
}

