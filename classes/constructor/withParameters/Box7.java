/**
 * В данном примере программы для инициализации размеров паралелепипеда в класе Box
 * применяется параметизированый конструктор
 */
package classes.constructor.withParameters;

public class Box7 {
    double width;
    double height;
    double depth;

    Box7(double width,double height,double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume(){
        return width * height * depth;
    }
}
