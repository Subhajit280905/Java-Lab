// Assingment 3.3
import java.util.Scanner;

class MatrixMultiply {
    int[][] a = new int[2][2];
    int[][] b = new int[2][2];
    int[][] c = new int[2][2];

    MatrixMultiply(int[][] x, int[][] y) {
        a = x;
        b = y;
    }
    void multiply() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
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
        MatrixMultiply obj = new MatrixMultiply(x, y);
        obj.multiply();
        sc.close();
    }
}