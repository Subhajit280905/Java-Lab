// Assingment 1.3
class c2f {
    double celsius;
    void convert() {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
    public static void main(String[] args) {
        c2f obj = new c2f();
        obj.celsius = 37;
        obj.convert();
    }
}