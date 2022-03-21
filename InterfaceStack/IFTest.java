package InterfaceStack;

//Создать переменную интерфейса и обратиться к стекам через нее

public class IFTest {

  public static void main(String[] args) {

    InterfaceStack myStack;
    //Создать переменную ссылки на интерфейс

    FixedStack fs = new FixedStack(8);
    DynamicStack ds = new DynamicStack(5);

    myStack = ds; // загрузить динамический стек
    // разместить числа в стеке
    for (int i = 0; i < 12; i++) {
      myStack.push(i);
    }

    myStack = fs;//загрузить фиксированый стек
    // разместить числа в стеке
    for (int i = 0; i < 8; i++) {
      myStack.push(i);
    }

    myStack = ds;
    System.out.println("Значения в динамическом стеке : ");
    for (int i = 0; i < 12; i++) {
      System.out.println(myStack.pop());
    }

    myStack = fs;
    System.out.println("Значения в фиксированом стеке : ");
    for (int i = 0; i < 8; i++) {
      System.out.println(myStack.pop());
    }


  }

}
