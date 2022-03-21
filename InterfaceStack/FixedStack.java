package InterfaceStack;

// Реализазия InterfaceStack для фиксированого размера
public class FixedStack implements InterfaceStack {

  private int stck[];
  private int tos;

  FixedStack(int size) {
    stck = new int[size];
    tos = -1;
  }

  @Override
  public void push(int item) {
    if (tos == stck.length - 1) { //Использовать поле длинны стека
      System.out.println("Стек заполнен!");
    } else {
      stck[++tos] = item;
    }
  }

  @Override
  public int pop() {
    if (tos < 0) {
      System.out.println("Стек не загружен!");
      return 0;
    } else {
      return stck[tos--];
    }
  }
}
