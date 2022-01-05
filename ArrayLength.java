public class ArrayLength {

  private int[] stck;
  private int top;

  ArrayLength(int size) {
    stck = new int[size];
    top = -1;
  }

  void push(int element) {
    if (top == stck.length - 1) {
      System.out.println("This stack is full already!!!It's not possible to add something.");
    } else {
      stck[++top] = element;
    }
  }

  int pop() {
    if (top < 0) {
      System.out.println("This stack is empty now!");
      return 0;
    } else {
      return stck[top--];
    }
  }
}

class ArrayLengthTest {

  public static void main(String[] args) {
    ArrayLength myArray1 = new ArrayLength(8);
    ArrayLength myArray2 = new ArrayLength(4);

    // let's add some elements into arrays
    for (int i = 0; i < 8; i++) {
      myArray1.push(i);
    }
    for (int i = 0; i < 4; i++) {
      myArray2.push(i);
    }

    //let's get elements from arrays
    System.out.println("myArray1 : ");
    for (int i = 0; i < 8; i++) {
      System.out.print(myArray1.pop() + ";");
    }

    System.out.println("\nmyArray2 : ");
    for (int i = 0; i < 4; i++) {
      System.out.print(myArray2.pop() + ";");
    }
  }
}
