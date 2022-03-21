package InterfaceStack;

//Реализация наращиваемого стека
public class DynamicStack implements InterfaceStack {

  private int stck[];
  private int tos;

  //Выделить память и инициализировать стек
  public DynamicStack(int size) {
    stck = new int[size];
    tos = -1;
  }

  // Разместить елемент в стеке
  @Override
  public void push(int item) {
    if (tos == stck.length - 1) {
      int temp[] = new int[stck.length * 2];
      //Удвоить размер
      for (int i = 0; i < stck.length; i++) {
        temp[i] = stck[i];
      }
      stck = temp;
      stck[++tos] = item;
    }
    else stck[++tos] = item;
  }

  // Извлечь елемент из стека
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
