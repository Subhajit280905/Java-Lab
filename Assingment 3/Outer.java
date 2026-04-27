// Assingment 3.2
import java.util.Scanner;

class Outer {
    int x;
    Outer(int n) {
        x = n;
    }
    class Inner {
        void show() {
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Outer obj = new Outer(n);
        Outer.Inner in = obj.new Inner();
        in.show();
        sc.close();
    }
}