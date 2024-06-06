import java.util.Scanner;
public class Program2 {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты точки а:");
        System.out.println("x:");
        double xa = in.nextDouble();
        System.out.println("y:");
        double ya = in.nextDouble();
        System.out.println("Введите координаты точки b:");
        System.out.println("x:");
        double xb = in.nextDouble();
        System.out.println("y:");
        double yb = in.nextDouble();
        Point1 a = new Point1(xa,ya);
        Point1 b = new Point1(xb,yb);
        Line otr = new Line(a, b);
        System.out.println("\nТочка a:\n"+a.toString()+"\nТочка b:\n"+b.toString()+"\n\nДлина отрезка: "+ Math.round(otr.Lenght()*100.00)/100.00);
    }
}
