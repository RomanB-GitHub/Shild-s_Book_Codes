// Продемонстрировать применение двумерного массива

public class TwodArray {

    public static void main(String[] args) {
        int[][] twod = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twod[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twod[i][j] + " ");
            }
            System.out.println();
        }
    }
}
