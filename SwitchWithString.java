/**
 * Использование символьных строк для управления оператором Switch
 *
 * символьные строки лучше применять только в тех случаях, когда управляющие данные уже находятся в строковой форме.
 * Иными словами, пользоваться символьными строками в операторе switch без особой необходимости не следует.
 * (Потеря ресурсов памяти)
 */
public class SwitchWithString {
    public static void main(String... args) {

        String str = " два ";

        switch (str) {
            case " один ":
                System.out.println("Nuber 1");
                break;
            case " два ":
                System.out.println("Number 2");
                break;
            case " три ":
                System.out.println("Number 3");
                break;
            default:
                System.out.println("Not correct number!");
        }

    }
}
