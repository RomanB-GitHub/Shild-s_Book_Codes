package classes.modificators.stackExample;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        //разместить числа в стеке
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);

        //извлечь эти числа из стека
        System.out.println("Стек myStack1 : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack1.pop() + " ");
        }

        System.out.println("\nСтек myStack2 :");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack2.pop() + " ");
        }

        //эти операторы недопустимы из-за модификатора доступа
        //myStack.tos = -2;
        //myStack.stack[3] = 100;
    }
}
