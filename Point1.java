public class Point1 {
    private double x;
    private double y;
    public double getX()
    {
        return x;
    }
    public void setX(double tx)
    {
        this.x=tx;
    }
    public double getY()
    {
        return y;
    }
    public void setY(double ty)
    {
        this.y=ty;
    }
    public Point1 (double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString() {
        return "Координата x: "+getX()+"\nКоордината y:"+getY();
    }
}
