import cartesiano.Ponto;

public class Circulo extends Ponto {

    protected double raio;

    public Circulo(){
        super();
        raio = 1;
    }

    public Circulo(double x, double y, double raio){
        super(x, y);
        this.raio = raio;
    }

    public Circulo(Circulo cl){
        super(cl.x, cl.y);
        raio = cl.raio;
    }

    public void assign(Circulo cl){
        super.assign(cl);
        raio = cl.raio;
    }
    
    @Override
    public void escale(double factor){
        super.escale(factor);
        raio *= factor;
    }

    @Override
    public String toString(){
        return super.toString()+ ":" + raio;
    }

    public boolean isValid(){
        return raio > 0;
    }

    public double perimeter(){
        return 2 * Math.PI * raio; 
    }

    public double area(){
        return Math.PI * (raio*raio);
    }
}
