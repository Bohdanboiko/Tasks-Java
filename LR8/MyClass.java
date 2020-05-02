import java.util.*;
public class MyClass {
    private double first;
    private double second;
    public MyClass() {this(0,0);}
    public MyClass(double First, double Second) {
        Init(First, Second);
    }

    public void Read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a(0): ");
        double first = s.nextDouble();
        System.out.print("Enter r: ");
        double second = s.nextDouble();
        //s.close();
        Init (first,second);
    }
    public double getFirst() {
        return first;
    }
    public void setFirst(double first) {
        this.first = first;
    }
    public double getSecond() {
        return second;
    }
    public void setSecond(double second) {
        this.second = second;
    }
    public void Init(double First, double Second) {
        setFirst(First);
        setSecond(Second);
    }
    public void Display() {
        System.out.println("first = " + getFirst() + "; second = " + getSecond());
    }
    public double Element(int n) {
        return first* Math.pow(second, n);
    }
}
