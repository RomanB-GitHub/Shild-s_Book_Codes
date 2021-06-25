package classes.overloadingConstructor;

/**
 * В даном примере конструкторы определяются в классе Box
 * для инициализации размеров паралелепипеда
 * тремя разными способами
 */
public class Box {
    double weight;
    double height;
    double depth;

    // в конструктор где указаны все параметры
    Box(double w, double h, double d) {
        weight = w;
        height = h;
        depth = d;
    }

    // в конструктор где не указаны параметры
    Box() {
        weight = -1;  //использовать значение -1 для
        height = -1;  // обозначения неинициализированого паралелепипеда
        depth = -1;
    }
    //конструктор используемый при создания куба
    Box(double len){
        weight = height = depth = len;
    }

    //расчитать и возвратить обьем
    double volume(){
        return weight * height * depth;
    }


}
