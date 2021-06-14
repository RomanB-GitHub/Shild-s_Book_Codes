/**
 *  Пример в котором в цикл for был добавлен прерыватель break
 */

public class ForEachWithBreak {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int x:numbers){
            System.out.println("Выводим число : " + x);
            sum += x;
            if (x == 5) break; // прервать цикл при достижении 5
        }
        System.out.println("Сума превіх 5 елементов равна : " + sum);
    }
}
