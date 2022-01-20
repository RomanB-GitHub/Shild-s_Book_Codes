// Использовать ключевое слово super
// с целью предотвратить сокрытие имен

public class KeyWordSuperA {

  int i;
}

class KeyWordSubB extends KeyWordSuperA {

  int i;

  KeyWordSubB(int a, int b) {
    super.i = a; //член из класса А
    i = b;       //член из класса B
  }

  void show() {
    System.out.println("Член из суперкласа А: " + super.i);
    System.out.println("Член из сабкласа В: " + i);
  }
}

class UseWordSuper {

  public static void main(String[] args) {
    KeyWordSubB subObject = new KeyWordSubB(5, 7);

    subObject.show();
  }
}

