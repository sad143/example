
    public class Program {
        public static void main (String args[]){
            Point1 a = new Point1(1.00,2.00);
            Point1 b = new Point1(5.00,6.00);
            Line otr = new Line(a, b);
            System.out.println("Точка a:\n"+a.toString()+"\nТочка b:\n"+b.toString()+"\n\nДлина отрезка: "+ Math.round(otr.Lenght()*100.00)/100.00);
        }
    }
