package InterfaceWithDefaultMethods;

interface IntStack {
  void push(int item); //сохранить элемент в стеке
  int pop(); //извлечь элемент из стека

  /* Метод clear() будет доступен по умолчаниюб и поэтому
  его придется реализовать, в том заранее существующем класе,
  где уже применяется интерфейс IntStack
  */

  default void clear(){
    System.out.println(" Метод clear() не реализован! ");
  }
}
