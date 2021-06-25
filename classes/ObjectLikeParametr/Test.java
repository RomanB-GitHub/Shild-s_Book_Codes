package classes.ObjectLikeParametr;

/*
    Обьекты допускается передавать методам в качестве параметров
 */
public class Test {
    int a;
    int b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    // возвратить логические значения  true
    // если в качестве параметра о указан вызывающий обьект

    boolean equalTo(Test o){
        if(o.a == a && o.b == b) {return true;}
        else {return  false;}
    }
}
