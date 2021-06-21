
// Приминение оператора break для выхода из вложеных циклов
public class BreakLoop4 {
    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 3; i++) {
            System.out.println("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer; // выход из обоих циклов
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не будет выводиться");
        }
        System.out.println("Циклы завершины");

    }
}
/**
 * class BreakErr {
     * puЬlic static void main(String args[]) {
     *
     * one: for(int i=O; i<З; i++){
     * System.out.print("Пpoxoд" + i + "· ");
     * }
     *
     * for(int j=O; j<lOO; j++) {
     * if(j == 10) break one; //ОШИБКА!
     * }
 * }
 */
