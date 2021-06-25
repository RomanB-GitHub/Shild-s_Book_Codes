package classes.ObjectCloning;

public class Box {

    double width;
    double height;
    double depth;

    // в этом конструкторе в качестве параметра
    // используется обьект типа бокс
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // в этом конструкторе указываются все размеры
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //конструктор в котором не один из параметров не указан
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //конструктор используемый при создании куба
    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return  width * height * depth;
    }
}
