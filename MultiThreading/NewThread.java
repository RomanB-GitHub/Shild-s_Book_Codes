package MultiThreading;
// создать второй поток исполнения

class NewThread implements Runnable {

  Thread t;

  NewThread() {
    //создать новый,второй поток исполнения
    t = new Thread(this, "Демонстрационный поток");
    System.out.println("Дочерний поток создан!" + t);
    t.start(); //запустить поток исполнения
  }

  // точка входа во второй поток исполнения
  public void run() {
    try {
      for (int n = 5; n > 0; n--) {
        System.out.println("Дочерний поток " + n);
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      System.out.println("Дочерний поток прерван");
    }
    System.out.println("Дочерний поток завершен!");

  }
}

class ThreadDemo {

  public static void main(String[] args) {
    new NewThread(); // создать новый поток

    try {
      for (int n = 5; n > 0; n--) {
        System.out.println("Главный поток " + n);
        Thread.sleep(1000);

      }
    } catch (InterruptedException e) {
      System.out.println("Главный поток прерван");
    }
    System.out.println("Главный поток завершен!");
  }
}
