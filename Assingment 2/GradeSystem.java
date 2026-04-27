// Assingment 2.5
import java.util.Scanner;

class GradeSystem {
    double percent;
    GradeSystem(double p) {
        percent = p;
    }
    void checkGrade() {
        if (percent >= 90)
            System.out.println("Grade A");
        else if (percent >= 80)
            System.out.println("Grade B");
        else if (percent >= 70)
            System.out.println("Grade C");
        else if (percent >= 60)
            System.out.println("Grade D");
        else if (percent >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        GradeSystem obj = new GradeSystem(p);
        obj.checkGrade();
        sc.close();
    }
}