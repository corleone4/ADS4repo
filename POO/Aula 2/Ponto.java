package cartesiano;

public class Ponto {

    private double x, y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double valX, double valY) {
        this.x = valX;
        this.y = valY;
    }

    public Ponto (Ponto pt){
        x = pt.x;
        y = pt.y;
    }

    public void setXY(double valX, double valY) {
        
        x = valX;
        y = valY;
        System.out.println("X: " + x + "Y: " + y);
        
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void assign (Ponto pt){
        x = pt.x;
        y = pt.y;
    }

    public double deltaX(double vX) {
        return vX - x;
    }

    public double deltaY(double vY) {
        return vY - y;
    }

    public double distance(double posX, double posY) {
        double disX = deltaX(posX); 
        double disY = deltaY(posY); 

        return Math.sqrt((Math.pow(disX, 2)) + (Math.pow(disY, 2)));
    }

    public void desloc(double dX, double dY) {
        x += dX;
        y += dY;
    }

    public void escale(double factor) {
        x *= factor;
        y *= factor;
    }

    public void print(){
        System.out.println("{" + x + ", " + y  + "}");
    }
}
