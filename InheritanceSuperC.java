/*
В иерерхии классов закрытые члены остаются закрытыми в
пределах своего класса. Эта программа содержит ошибку
и поэтому ее невозможно скомпилировать
 */
public class InheritanceSuperC {

  int i;//этот член открыт по умолчанию
  private int j;//этот член закрыт в классе A

  void setij(int x, int y) {
    i = x;
    j = y;
  }

}

class InheritanceSubD extends InheritanceSuperC {
  // член j класса InheritanceC недоступен в этом классе

  int total;

  void sum() {
    // total = i + j; // Ошибка член j в этом классе не доступен
  }
}

class Access {

  public static void main(String[] args) {
    InheritanceSubD subOb = new InheritanceSubD();

    subOb.setij(10, 40);
    subOb.sum();

    System.out.println("Сумма равна : " + subOb.total);

  }
}
