package classes.overloadingMetods.overloadTypes;

/*
    Применить автоматическое преобразование типов к перегрузке
 */
public class OverloadTypesDemo {

    void test() {
        System.out.println("Параметры отсутствуют!");
    }

    /*
    Перегружаемый метод проверяющий наличие двух целочисленных параметров
     */

    void test(int a, int b) {
        System.out.println("a & b : " + a + " , " + b);
    }

    /*
    Перегружаемый метод проверяющий наличие параметра  типа double
     */
    void test(double a){
        System.out.println("Внутреннее преобразование при вызове :"
                + "test (double) a : " + a);
    }

}
