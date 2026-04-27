// Assingment 3.1
import java.util.Scanner;

class Factorial {
    int num;
    Factorial(int n) {
        num = n;
    }
    int findFactorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial obj = new Factorial(n);
        int result = obj.findFactorial();
        System.out.println(result);
        sc.close();
    }
}