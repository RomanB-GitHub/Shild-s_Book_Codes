public class Recursion1 {

  int factorial(int n) {
    int result;
    if (n == 1) {
      return 1;
    }
    result = factorial(n - 1) * n;
    return result;
  }
}

class RecursionTest {

  public static void main(String[] args) {
    Recursion1 myRec = new Recursion1();

    System.out.println("factorial of 3 : " + myRec.factorial(3));
    System.out.println("factorial of 4 : " + myRec.factorial(4));
    System.out.println("factorial of 5 : " + myRec.factorial(5));
  }
}
