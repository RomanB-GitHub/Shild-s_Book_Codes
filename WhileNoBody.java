/**
 * Демонстрация цикла while в котором целевая часть цикла пустая
 */
public class WhileNoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        // расчитать среднее значение переменных i и j
        while (++i < --j) ; // у цикла нету тела!!!
        System.out.println("Среднее значение равно " + i);

    }
}
