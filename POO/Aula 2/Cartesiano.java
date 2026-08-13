package cartesiano;

public class Cartesiano {

    /* 
    Mantenha os atributos protegidos e implemente getters e setters para acesso aos atributos.
    Implemente três construtores para a classe: o construtor padrão, um parametrizado e um Copy constructor. O construtor padrão inicia o ponto na origem (0,0).
    Implemente também os seguintes métodos públicos:
    void setXY(double newX, double newY): Atribui novos valores para as coordenadas X e Y.
    void assign(Ponto pt): Copia o valor dos atributos de pt para os atributos do objeto.
    double deltaX(double vX): Retorna o delta X para o valor informado (vX - X).
    double deltaY(double vY): Retorna o delta Y para o valor informado (vY - Y).
    double distance(double posX, double posY): Calcula e retorna a distância do ponto até a posição informada pelos parâmetros. Use os métodos deltaX e deltaY para calcular a distância.
    void desloc(double dX, double dY): Desloca o ponto adicionando os valores informados às coordenadas do ponto.
    void escale(double factor): Faz o escalonamento do ponto multiplicando as coordenadas pelo fator de escalonamento informado no parâmetro.
    
     */
    public static void main(String[] args) {
        Ponto p1 = new Ponto(10, 20);
        Ponto p2 = new Ponto();
        Ponto p3 = new Ponto(p1);

        p1.print();
        p2.print();
        p3.print();

        p2.desloc(5,1);
        p2.print();
        p2.escale(2);
        p2.print();
    }

}
