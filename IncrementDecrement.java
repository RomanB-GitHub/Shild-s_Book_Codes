// демонстрация операции декремента

public class IncrementDecrement {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c, d;

        c = ++b;
        d = a++;
        c++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
