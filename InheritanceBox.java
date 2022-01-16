/*
  В этой программе наследование применяется
   для расширения класса Вох
 */

class InheritanceBox {

  double width;
  double depth;
  double height;

  //Клон обьекта
  InheritanceBox(Box ob) {
    width = ob.width;
    depth = ob.depth;
    height = ob.height;
  }

  // конструктор примнимающий все размеры
  InheritanceBox(double width, double depth, double height) {
    width = width;
    depth = depth;
    height = height;
  }

  // конструктор, при отсутствии размеров
  InheritanceBox() {
    width = -1;
    depth = -1;
    height = -1;
  }

  //конструктор при создании куба
  InheritanceBox(double len) {
    width = height = depth = len;
  }

  double volume() {
    return width * depth * height;
  }
}

// Расширить клас InheritanceBox,включив в его поле параметр веса
class BoxWeight extends InheritanceBox {

  double weight;

  BoxWeight(double w, double d, double h, double m) {
    width = w;
    depth = d;
    height = h;
    weight = m;
  }
}

class DemoBoxWeight {

  public static void main(String[] args) {
    BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
    BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
    double vol;

    vol = myBox1.volume();
    System.out.println("Обьем myBox1 равен: " + vol);
    System.out.println("Вес myBox1 равен: " + myBox1.weight);
    System.out.println("------------------------");

    vol = myBox2.volume();
    System.out.println("Обьем myBox2 равен: " + vol);
    System.out.println("Вес myBox2 равен: " + myBox2.weight);
  }
}
