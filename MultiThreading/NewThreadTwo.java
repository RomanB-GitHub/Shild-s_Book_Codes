package MultiThreading;

import org.w3c.dom.ls.LSOutput;

// Создать второй поток исполнения расширив класс Thread
class NewThreadTwo extends Thread {

  NewThreadTwo() {
    //создать новый поток исполнения
    super("Демонстрационный поток");
    System.out.println("Дочерний поток" + this);
    start();
  }

  // Точка входа во второй поток исполнения
  public void run() {
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println("Дочерний поток: " + i);
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      System.out.println("Дочерний поток был прерван");
    }
    System.out.println("Дочерний поток был завершен!");
  }
}

class ExtendsThread {

  public static void main(String[] args) {
    new NewThreadTwo(); // создать новый поток исполнения

    try {
      for (int i = 5; i > 0; i--) {
        System.out.println("Главный поток: " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Главний поток был прерван");
    }
    System.out.println("Главный поток был завершен!");
  }
}
