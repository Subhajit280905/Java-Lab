// Assingment 2.8
import java.util.Scanner;

class ReverseNumber {
    int num;
    ReverseNumber(int n) {
        num = n;
    }
    void reverse() {
        int rev = 0;
        int temp = num;
        while (temp != 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReverseNumber obj = new ReverseNumber(n);
        obj.reverse();
        sc.close();
    }
}