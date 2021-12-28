public class Recursion2 {

  int values[];

  Recursion2(int i) {
    values = new int[i];
  }

  //вывести рекурсивно елементы
  void printArray(int i) {
    if (i == 0) {
      return;
    } else {
      printArray(i - 1);
    }
    System.out.println("[" + (i - 1) + "]" + values[i - 1]);
  }
}

class Recursion2Test {

  public static void main(String[] args) {
    Recursion2 myRec2 = new Recursion2(10);
    int i;

    for (i = 0; i < 10; i++) {
      myRec2.values[i] = i;
    }
    myRec2.printArray(10);
  }
}
