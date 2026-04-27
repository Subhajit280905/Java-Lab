// Assingment 1.1
public class print_name {
    String name;

    void display() {
        System.out.println("My Name is: " + name);
    }

    public static void main(String[] args) {
        print_name obj = new print_name();
        obj.name = "Abhishek Singh";
        obj.display();
    }
}