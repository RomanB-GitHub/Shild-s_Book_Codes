/**
 * Демонстрация работы тернарного оператора
 */
public class TernaryOperator {
    public static void main(String[] args) {

        int i, k;

        i = 10;

        k = i < 0 ? -i : i; // получить абсолютное значение переменной i .

        System.out.print("Абсолютное значенние ");
        System.out.println(i + " равно " + k);

        i = -10;

        k = i < 0 ? -i : i; // получить абсолютное значение переменной i .

        System.out.print("Абсолютное значенние ");
        System.out.println(i + " равно " + k);


    }
}
