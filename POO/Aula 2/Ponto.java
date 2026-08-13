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

    public void setXY(double valX, double valY) {
        if (valX >= 0 && valY >= 0) {
            x = valX;
            y = valY;
            System.out.println("X: " + x + "Y: " + y);
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double deltaX(double vX) {
        return vX - x;
    }

    public double deltaY(double vY) {
        return vY - y;
    }

    public double distance(double posX, double posY) {
        double disX = deltaX(posX); //10
        double disY = deltaY(posY); // 8

        System.out.println("DisX elevado a 2: " + (Math.pow(disX, 2)));
        System.out.println("DisY elevado a 2: " + (Math.pow(disY, 2)));

        return Math.sqrt((Math.pow(disX, 2)) + (Math.pow(disY, 2)));
    }

    public void desloc(double dX, double dY) {
        System.out.println("-----------DESLOC---------------");
        System.out.println("Coordenada X anterior: " + x);
        System.out.println("Coordenada Y anterior: " + y);
        x += dX;
        y += dY;
        System.out.println("Coordenada X: " + x);
        System.out.println("Coordenada Y: " + y);
        System.out.println("\n");
    }

    public void escale(double factor) {
        System.out.println("-------------ESCALE------------");
        System.out.println("Coordenada X anterior: " + x);
        System.out.println("Coordenada Y anterior: " + y);
        x *= factor;
        y *= factor;
        System.out.println("Coordenada X: " + x);
        System.out.println("Coordenada Y: " + y);
        System.out.println("\n");
    }
}
