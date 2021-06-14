/**
 * Пример использования цикла for в стиле for each
 */
public class ForEach {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : number) {
            System.out.println("Значение цифры : " + x);
            sum += x;
        }
        System.out.println("\nСумма : " + sum);
    }

}
