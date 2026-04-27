// Assingment 2.7
import java.util.Scanner;

class Fibonacci {
    int n;
    Fibonacci(int x) {
        n = x;
    }
    void printSeries() {
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibonacci obj = new Fibonacci(n);
        obj.printSeries();
        sc.close();
    }
}