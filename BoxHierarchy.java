// Расширение класса BoxWeight
// с включением в него поля доставки cost

public class BoxHierarchy {

  private double width;
  private double height;
  private double depth;

  //сконструировать клон обьекта
  BoxHierarchy(BoxHierarchy obj) {
    width = obj.width;
    height = obj.height;
    depth = obj.depth;
  }

  //конструктор при применении всех указаных параметров
  BoxHierarchy(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  // конструктор по умолчанию (отсутствие размеров)
  BoxHierarchy() {
    width = -1;  // значение -1 для обозначения
    height = -1; // неинициализированого
    depth = -1;  // параллепипеда
  }

  // конструктор применяемый при создании куба
  BoxHierarchy(double len) {
    width = height = depth = len;
  }

  //расчитать и возвратить обьем
  double volume() {
    return width * height * depth;
  }
}

// расширение класс Вох добавлением поля weight
class BoxHierarchyWeight extends BoxHierarchy {

  double weight; //

  BoxHierarchyWeight(BoxHierarchyWeight obj) {
    super(obj);
    weight = obj.weight;
  }

  public BoxHierarchyWeight(double w, double h, double d, double m) {
    super(w, h, d);
    weight = m;
  }

  public BoxHierarchyWeight() {
    super();
    weight = -1;
  }

  public BoxHierarchyWeight(double len, double m) {
    super(len);
    weight = m;
  }
}

//добавим поле стоимости доставки cost
class BoxHierarchyShipment extends BoxHierarchyWeight {

  double cost;

  // клонировать обьект
  public BoxHierarchyShipment(BoxHierarchyWeight obj, double c) {
    super(obj);
    cost = c;
  }

  // конструктор со всеми аргументами
  public BoxHierarchyShipment(double w, double h, double d, double m, double c) {
    super(w, h, d, m);
    cost = c;
  }

  public BoxHierarchyShipment() {
    super();
    cost = -1;
  }

  public BoxHierarchyShipment(double len, double m, double c) {
    super(len, m);
    cost = c;
  }
}

class DemoShipment {

  public static void main(String[] args) {
    BoxHierarchyShipment shipment_1 = new BoxHierarchyShipment(10, 20, 15, 10, 3.41);
    BoxHierarchyShipment shipment_2 = new BoxHierarchyShipment(2, 3, 4, 0.76, 1.28);
    double vol;

    vol = shipment_1.volume();
    System.out.println(" Обьем shipment_1 равен = " + vol);
    System.out.println("Вес shipment_1 равен = " + shipment_1.weight);
    System.out.println("Стоимость доставки = $" + shipment_1.cost);

    System.out.println();

    vol = shipment_2.volume();
    System.out.println(" Обьем shipment_1 равен = " + vol);
    System.out.println("Вес shipment_2 равен = " + shipment_2.weight);
    System.out.println("Стоимость доставки = $" + shipment_2.cost);

  }
}




