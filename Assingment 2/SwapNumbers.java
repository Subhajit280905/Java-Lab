// Assingment 2.3
import java.util.Scanner;

class SwapNumbers {
    int num;
    SwapNumbers(int n) {
        num = n;
    }
    void swap(SwapNumbers obj1, SwapNumbers obj2) {
        int temp = obj1.num;
        obj1.num = obj2.num;
        obj2.num = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        SwapNumbers obj1 = new SwapNumbers(a);
        SwapNumbers obj2 = new SwapNumbers(b);
        SwapNumbers s = new SwapNumbers(0);
        s.swap(obj1, obj2);

        System.out.println("After Swap:");
        System.out.println(obj1.num);
        System.out.println(obj2.num);
        sc.close();
    }
}