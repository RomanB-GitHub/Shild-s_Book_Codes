package classes.modificators.stackExample;


//В этом классе определяется целочисленный стек
//который может содержать 10-ть значений

public class Stack {

    /*
     переменные stack и tos являются закрытыми
     это означает что они не могут быть случайно или намеренно изменены
     таким образом что бы нарушить стек
     */

    private int[] stack = new int[10];
    private int tos;

    // инициализация вершины стека

    Stack() {
        tos = -1;
    }

    //разместить елемент в стеке

    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен!");
        else
            stack[++tos] = item;
    }

    //извлечь елемент из стека

    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен!");
            return 0;
        }else{
            return stack[tos--];}
    }
}
