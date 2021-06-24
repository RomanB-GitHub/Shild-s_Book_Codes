package classes.stack;

/*
    В этом классе определяется целочисленный стек
    в котором можно хранить до десяти целочисленных значений
 */
public class StackTest {

    public static void main(String[] args) {


        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //размещаем значения чисел в стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        // Извлечь ети числа из стека

        System.out.println("\nСодержимое стека mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.print(" " + mystack1.pop());

        System.out.println("\n Содержимое стека mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.print(" " + mystack2.pop());

    }
}
