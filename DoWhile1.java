/**
 * Демонстрация цикла do-while
 */
public class DoWhile1 {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("Такт " + n);
            n--;
        } while (n > 0);
    }
}
// можно переписать условие а результат будет прежним
//    do{
//         System.out.println("Такт " + n);
//         } while(--n > 0);