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
        Ponto pt = new Ponto(2,2);
        Ponto ptPadrao = new Ponto();
        
        System.out.println("------------------ PT ATRIBUIDO -----------------------");
        
        System.out.println("Delta X calculado: " + pt.deltaX(10));
        System.out.println("Delta X calculado: " + pt.deltaY(5));
        System.out.println("\n");
        System.out.println("Distancia calculada: " + pt.distance(10, 5));
        pt.desloc(10, 3);
        pt.escale(1.54);
        System.out.println("\n");
        
        
        System.out.println("------------------ PT PADRAO -----------------------");;;
         
        System.out.println("X Construtor padrao: " + ptPadrao.getX());
        System.out.println("Y Construtor padrao: " + ptPadrao.getY());
        ptPadrao.setXY(5,5);
        System.out.println("\n");
        System.out.println("Delta X calculado: " + ptPadrao.deltaX(5));
        System.out.println("Delta X calculado: " + ptPadrao.deltaY(19));
        System.out.println("\n");
        System.out.println("Distancia calculada: " + ptPadrao.distance(5, 3));
        ptPadrao.desloc(10, 3);
        ptPadrao.escale(1.50); 
    }

}
