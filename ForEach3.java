/**
 *  Применение цикла for в стиле for each
 *  для обращения к двухмерному массиву
 */
public class ForEach3 {

    public static void main(String[] args) {

        int sum = 0;
        int[][] num = new int[3][5];

        //присвоить значение елементам массива nums
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                num[i][j] = (i+1)*(j+1);

        // использовать цикл for в стиле for each для вывода
        // и сумирования значений
        for (int x[]:num){
            for(int y:x){
                System.out.println("Значение равно : " + y);
                sum += y;
            }
        }
        System.out.println("Сумма :" + sum);

    }
}
