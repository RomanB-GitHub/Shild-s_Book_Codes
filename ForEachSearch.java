/**
 * Поиск в массиве с приминением цикла for  в стиле for each
 */
public class ForEachSearch {

    public static void main(String[] args) {
        int[] numb = {6, 8, 3, 7, 2, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        /*
            Использовать цикл for  в стиле for each для поиска
            значения  val в массиве nums
         */

        for (int x : numb) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найдено!");
    }
}
