package classes.modificators.packageDefault_public_private;

//демонстрация модификаторов доступа private и public их отличий
public class Test {
    int a; // доступ определяемый по умолчанию
    public int b;//открытый доступ
    private int c;// закрытый доступ

    //методы доступа к члену c даного класса
    void setc(int i) {
        //установить значение члена с данного класса
        c = i;
    }

    int getc(){
        //получить значение члена с данного класса
        return c;
    }
}
