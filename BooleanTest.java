
public class BooleanTest {
    public static void main(String[] args) {

        boolean b;

        b = false;
        System.out.println("b равно: " + b);
        b = true;
        System.out.println("а теперь b равно: " + b);

        if (b) System.out.println("код выполняеться!");
        b = false;
        if (b) System.out.println("код не выполняеться!");

        System.out.println("10 > 9 равно :" + (10 > 9));


    }
}
