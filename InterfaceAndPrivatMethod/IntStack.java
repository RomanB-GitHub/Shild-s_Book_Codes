package InterfaceAndPrivatMethod;

public interface IntStack {

  void push(int item); // сохранить елемент в стеке

  int pop();           // извлечь елемент из стека

  // Метод с реализацией по умолчанию возвращающий массив
  //из n - элементов, начиная из вершины стека

  default int[] popNElements(int n) {
    // возвратить запрашиваемые елементы из стека
    return getElements(n);
  }

  // Метод с реализацией по умолчанию возвращающий массив
  // из n-элементовб следующих после указаного количества
  // пропускаемых элементов

  default int[] skipAndPopNElements(int skip, int n) {
    // пропустить указаное количество елементов
    getElements(skip);
    // возвраить запрашиваемые элементы из стека
    return getElements(n);
  }

  // Закрытый метод возвращающий массив из n-элементов
  // начиная из вершины стека

  private int[] getElements(int n) {
    int[] elements = new int[n];
    for (int i = 0; i < n; i++) {
      elements[i] = pop();
    }
    return elements;

  }

}
