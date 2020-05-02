import java.util.*;
public class Pro8 {

    public static void main(String[] args) {
        MyClass l = new MyClass();
        Scanner s = new Scanner(System.in);
        l.Read();
        l.Display();
        System.out.print("Введіть індекс елементу прогресії: ");
        int n= s.nextInt();
        System.out.println("Елемент прогресії дорівнює = " + l.Element(n));
        s.close();
    }

}
