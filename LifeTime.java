
public class LifeTime {
    public static void main(String[] args) {

        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; // переменная инициализируется каждый раз при входе в блок кода
            System.out.println("y  равно : " + y);// здесь всегда выводиться значение  -1;
            y = 100;
            System.out.println("Теперь\" У \" равно : " + y);

        }
    }
}
