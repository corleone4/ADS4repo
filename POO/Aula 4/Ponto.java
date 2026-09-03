package cartesiano;
public class Ponto 
{
    protected double x, y;
    
    // Construtor padrão
    public Ponto()
    {
        x= 0;
        y= 0;
    }
    
    // construtor parametrizado
    public Ponto(double x, double y)
    {
        this.x= x;
        this.y= y;
    }
    
    // Construtor de cópia
    public Ponto(Ponto pt)
    {
        x= pt.x;
        y= pt.y;
    }
    
    // setters
    public void setX(double x) 
    {
        this.x = x;
    }

    public void setY(double y) 
    {
        this.y = y;
    }
    
    // getters
    public double getX() 
    {
        return x;
    }

    public double getY() 
    {
        return y;
    }
    
    // Outros
    public void setXY(double newX, double newY)
    {
        this.x= newX;
        this.y= newY;
    }
    
    public void assign(Ponto pt)
    {
        setXY(pt.x, pt.y);
    }
    
    public double deltaX(double vX)
    {
        return vX-x;
    }
    
    public double deltaY(double vY)
    {
        return vY-y;
    }
    
    public double distance(double posX, double posY)
    {
        double dx= deltaX(posX);
        double dy= deltaY(posY);
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public void desloc(double dX, double dY)
    {
        x+= dX;
        y+= dY;
    }
    
    public void escale(double factor)
    {
        x*= factor;
        y*= factor;        
    }
    
    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public void print()
    {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ponto other = (Ponto) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        return Double.doubleToLongBits(this.y) == Double.doubleToLongBits(other.y);
    }
   
    
    
}
