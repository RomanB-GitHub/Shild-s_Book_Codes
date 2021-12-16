//В этом классе определяется целочисленный стек
// где можно хранить до 10 целочисленных значений

public class Stack {

  int stck[] = new int[10];
  int tos;

  Stack() {
    tos = -1;
  }

  // разместить элемент в стеке
  void push(int item) {
    if (tos == 9) {
      System.out.println("Стек заполнен!");
    } else {
      stck[++tos] = item;
    }
  }

  // извлечь элемент из стека
  int pop() {
    if (tos < 0) {
      System.out.println(" Стек не загружен!");
      return 0;
    } else {
      return stck[tos--];
    }
  }
}

class TestStack {

  public static void main(String args[]) {
    Stack myStack1 = new Stack();
    Stack myStack2 = new Stack();

    // разместить числа в стеке
    for (int i = 0; i < 10; i++) {
      myStack1.push(i);
    }
    for (int i = 10; i < 20; i++) {
      myStack2.push(i);
    }

    //извлечь числа из стека
    for (int i = 0; i < 10; i++) {
      System.out.println(myStack1.pop());
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(myStack2.pop());
    }
  }
}
