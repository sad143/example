public class Line {
    private Point1 a;
    private Point1 b;
    public String getA() {
        return a.toString();
    }
    public String getB() {
        return b.toString();
    }
    public void setA(Point1 a) {
        this.a = a;
    }
    public void setB(Point1 b) {
        this.b = b;
    }
    public Line(Point1 a,Point1 b)
    {
        this.a=a;
        this.b=b;
    }
    public float Lenght()
    {
        return (float)Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
    }
}
