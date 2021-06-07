/*
    Иннициализировать двухмерный массив
 */
public class ArrayMatrix {
    public static void main(String[] args) {
        double[][] matrixArrey = {
                {0 * 0, 1 * 0, 2 * 0, 3 * 0},
                {0 * 1, 1 * 1, 2 * 1, 3 * 1},
                {0 * 3, 1 * 2, 2 * 2, 3 * 2},
                {0 * 4, 1 * 3, 2 * 3, 3 * 3},
        };
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                System.out.print(matrixArrey[i][j] + " ");

            }
            System.out.println();

        }
    }


}
