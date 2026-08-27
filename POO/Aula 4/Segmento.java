package cartesiano;
public class Segmento 
{
    private Ponto p1, p2;
    
    // Construtor padrão
    public Segmento()
    {
        p1= new Ponto();
        p2= new Ponto(0, 1);
    }
    
    public Segmento(double x1, double y1, double x2, double y2)
    {
        p1= new Ponto(x1, y1);
        p2= new Ponto(x2, y2);
    }
    
    public Segmento(Segmento sg)
    {
        p1= new Ponto(sg.p1);
        p2= new Ponto(sg.p2);
    }
    
    public void assign(Segmento sg)
    {
        p1.assign(sg.p1);
        p2.assign(sg.p2);
    }
    
    public void desloc(double dX, double dY)
    {
        p1.desloc(dX, dY);
        p2.desloc(dX, dY);
    }
    
    public void escale(double factor)
    {
        p1.escale(factor);
        p2.escale(factor);
    }
    
    @Override
    public String toString ( )
    {
        return "[" + p1 + ", " + p2 + "]";
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
    public double length()
    {
        return p1.distance(p2.x, p2.y);
    }
    
    public boolean isValid()
    {
        if(p1==null) return false;
        if(p2==null) return false;
        return !p1.equals(p2);
    }
    
    public Ponto midPoint()
    {
        double mx= (p1.x + p2.x)/2;
        double my= (p1.y + p2.y)/2;
        
        return new Ponto(mx, my);
    }
}
