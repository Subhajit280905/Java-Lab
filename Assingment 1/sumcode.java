// Assingment 1.2
class sumcode {
    int a, b;
    void add() {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
    public static void main(String[] args) {
        sumcode obj = new sumcode();
        obj.a = 10; 
        obj.b = 20;
        obj.add();
    }
}