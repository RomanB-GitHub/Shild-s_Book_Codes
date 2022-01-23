//Продемонстрировать порядок вызова конструкторов

class AConstructorCall {

  AConstructorCall() {
    System.out.println("Внутри конструктора AConstructorCall- superclass.");
  }
}

class BConstructorCall extends AConstructorCall {

  BConstructorCall() {
    System.out.println("Внутри конструктора BConstructorCall- subclass_1.");
  }
}

class CConstructorCall extends BConstructorCall {

  CConstructorCall() {
    System.out.println("Внутри конструктора CConstructorCall- subclass_2.");
  }
}

class CallingConstructor {

  public static void main(String[] args) {
    CConstructorCall c = new CConstructorCall();
  }
}
