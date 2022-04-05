package ExceptionsInfo;
/*
Эта программа содержит ошибку.
В последовательности операторов catch подкласс исключений должен быть
указан перед эго суперклассом, иначе это приведет к недостежимому коду
и ошибке во время компиляции.
 */
public class SuperClassCatch {

  public static void main(String[] args) {
    try {
      int a = 0;
      int b = 42 / a;
    }catch (Exception e){
      System.out.println("Перехват исключений общего класса Exception.");
    }
    /*
    Этот оператор catch вообще не должен быть достигнут,
    так как подкласс ArithmeticException является производным
    от класса Exception
     */
//    catch (ArithmeticException e){
//      //Ошибка! Недостежимый код!
//      System.out.println("Этот код вообще не достежим");
//    }
  }

}
