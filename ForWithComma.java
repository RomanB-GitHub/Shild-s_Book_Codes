/**
 * Использование комы в операторе цикла for
 */

public class ForWithComma {

    public static void main(String[] args) {

        int a, b;

        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
