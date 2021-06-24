package classes.stack;

public class Stack {
    int[] stck = new int[10];
    int tos;

    // Здесь конструктор в котором присваевается вершина stack-a.
    Stack(){
        tos = -1;
    }

    //Разместиь елемент в стеке
    void push(int item){
        if (tos == 9)
            System.out.println("Внимание стек заполнен!!!");
        else
            stck[++tos] = item;
    }

    //Извелечь элемент из стека

    int pop (){
        if (tos<0){
            System.out.println("Стек незагружен!");
            return 0;
        }
        else{
            return stck[tos--];
        }
    }
}
