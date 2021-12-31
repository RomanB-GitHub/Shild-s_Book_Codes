/*В этом классе определяется целочисленный стек
  который может содержать 10 значений
 */

public class ModifierAccess2 {
/* Теперь переменные stck и tos являются закрытыми.
  это означает что они не могут быть случайно или намеренно изменены
  таким образомб что бы нарушить стек
 */

  private int[] stck = new int[10];
  private int tos;

  // Инициализировать вершину стека
  ModifierAccess2() {
    tos = -1;
  }

  // Разместить элемент в стеке
  void push(int item) {
    if (tos == 9) {
      System.out.println("stck is full allready!");
    } else {
      stck[++tos] = item;
    }
  }

  //Извлечь елемент из стека
  int pop() {
    if (tos < 0) {
      System.out.println("Stack is empty, nothing to return!!!");
      return 0;
    } else {
      return stck[tos--];
    }
  }

}

class TestModifierAccess2 {

  public static void main(String[] args) {
    ModifierAccess2 myStack1 = new ModifierAccess2();
    ModifierAccess2 myStack2 = new ModifierAccess2();

    for (int i = 0; i < 10; i++) {
      myStack1.push(i);
    }

    for (int i = 20; i < 30; i++) {
      myStack2.push(i);
    }

    System.out.println("Stack from myStack1: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(myStack1.pop() + "; ");
    }

    System.out.println("\nStack from myStack2: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(myStack2.pop() + "; ");

    }
  }
}
