public class SuperBox {

  private double width;
  private double height;
  private double depth;

  // сконструировать клон обьекта
  SuperBox(SuperBox ob) {
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }

  // конструктор применяемый при указании всех параметров
  SuperBox(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  // конструктор применяемый при отсутствии размеров
  SuperBox() {
    width = -1; // значение -1 служит для
    height = -1;// обозначения неинициализированого
    depth = -1; // паралелепипеда
  }

  //конструктор применяемый при создании куба
  SuperBox(double len) {
    width = height = depth = len;
  }

  //расчитать и возвратить обьем
  double volume() {
    return width * height * depth;
  }

}

// теперь в классе SubBoxWeight реализованы полностью все конструкторы
class SubBoxWeight extends SuperBox {

  double weight;

  // сконструировать клон обьекта
  SubBoxWeight(SubBoxWeight ob) {
    super(ob);
    weight = ob.weight;
  }

  // конструктор применяемый при указании всех параметров
  SubBoxWeight(double w, double h, double d, double m) {
    super(w, h, d);
    weight = m;
  }

  // конструктор применяемый по умолчанию
  SubBoxWeight() {
    super();
    weight = -1;
  }

  // конструктор применяемый при создании куба
  SubBoxWeight(double len, double m) {
    super(len);
    weight = m;
  }
}

class DemoSuper {

  public static void main(String[] args) {

    SubBoxWeight myBox1 = new SubBoxWeight(10, 20, 15, 34.3);
    SubBoxWeight myBox2 = new SubBoxWeight(2, 3, 4, 0.076);
    SubBoxWeight myBox3 = new SubBoxWeight(); // по умолчанию
    SubBoxWeight myCube = new SubBoxWeight(3, 2);
    SubBoxWeight myClone = new SubBoxWeight(myBox1);
    double vol;

    vol = myBox1.volume();
    System.out.println("Volume of myBox1 will be: " + vol);
    System.out.println("Weight of myBox1 will be: " + myBox1.weight);
    System.out.println();

    vol = myBox2.volume();
    System.out.println("Volume of myBox2 will be: " + vol);
    System.out.println("Weight of myBox2 will be: " + myBox2.weight);
    System.out.println();

    vol = myBox3.volume();
    System.out.println("Volume of myBox3 will be: " + vol);
    System.out.println("Weight of myBox3 will be: " + myBox3.weight);
    System.out.println();

    vol = myCube.volume();
    System.out.println("Volume of myCube will be: " + vol);
    System.out.println("Weight of myCube will be: " + myCube.weight);
    System.out.println();

    vol = myClone.volume();
    System.out.println("Volume of myClone will be: " + vol);
    System.out.println("Weight of myClone will be: " + myClone.weight);
    System.out.println();
  }

}