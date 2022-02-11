package AbstractClass;

//Применение абстрактных методов и классов

abstract class AbstrFigure {

  double dim1;
  double dim2;

  public AbstrFigure(double a, double b) {
    dim1 = a;
    dim2 = b;
  }

  abstract double area();
}

class AbstrRegtangle extends AbstrFigure {

  public AbstrRegtangle(double a, double b) { 
    super(a, b);
  }

  double area() {
    System.out.println("В области прямоугольника!");
    return dim1 * dim2;
  }

}

class AbstrTriangle extends AbstrFigure {

  public AbstrTriangle(double a, double b) {
    super(a, b);
  }


  double area() {
    System.out.println("В области триугольника!");
    return (dim1 * dim2) / 2;
  }
}

class AbstrDemo {

  public static void main(String[] args) {
    //AbstrFigure f = new AbstrFigure(10,10);// обьявление обьектов недопустимо (так как abstract)
    AbstrRegtangle r = new AbstrRegtangle(9, 5);
    AbstrTriangle t = new AbstrTriangle(10, 8);

    AbstrFigure figureRef;

    figureRef = r;
    System.out.println("Площадь равна: " + figureRef.area());

    figureRef = t;
    System.out.println("Площадь равна: " + figureRef.area());
  }
}