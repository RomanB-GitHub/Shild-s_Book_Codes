// Применение сдвига в лево
// в качестве быстрого умножения на два

public class MultByTwo {

  public static void main(String[] args) {
    int i ;
    int numb = 0xFFFFFFE; // здесь номер 268435454

    for (i = 0; i < 4 ; i++) {
      numb = numb << 1;
      System.out.println(numb);

    }
  }


}
