// Assingment 3.4
import java.util.Scanner;

class MatrixSubtract {

    int[][] a = new int[2][2];
    int[][] b = new int[2][2];
    int[][] c = new int[2][2];

    MatrixSubtract(int[][] x, int[][] y) {
        a = x;
        b = y;
    }
    void subtract() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x = new int[2][2];
        int[][] y = new int[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                x[i][j] = sc.nextInt();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                y[i][j] = sc.nextInt();
        MatrixSubtract obj = new MatrixSubtract(x, y);
        obj.subtract();
        sc.close();
    }
}