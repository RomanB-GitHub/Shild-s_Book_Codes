package classes.constructor.withoutParameters;

public class Box6 {
    double width;
    double height;
    double depth;

    Box6() {
        System.out.println("Конструирование обьекта Box6");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}
