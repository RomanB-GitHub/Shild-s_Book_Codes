package Inheritance.p1;

public class Protection {
  int n = 1;
  protected int n_pro = 2;
  public int n_pub = 3;
  private int n_pri = 4;

  public Protection(){
    System.out.println("Конструктор базоваго класса Protection");
    System.out.println("n = " + n);
    System.out.println("n_pro = " + n_pro);
    System.out.println("n_pub = " + n_pub);
    System.out.println("n_pri = " + n_pri);

  }

}
