import java.util.Arrays;

// Вычислить растояние прохзодимое светом используя переменные типа Long
public class LongType {

  public static void main(String[] args) {
    int lightSpeed;
    long days;
    long seconds;
    long distance;

    //приблизительная скорость света миль в секунду
    lightSpeed = 186000;

    //указать количество дней
    days = 1000;

    //преобразовать дни в секунды
    seconds = days * 24 * 60 * 60;

    //вычеслить растояние

    distance = lightSpeed * seconds;

    System.out.print("За " + days);
    System.out.print(" дней свет пройдет около ");
    System.out.println(distance + " миль!");
  }

}
