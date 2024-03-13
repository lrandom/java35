public class Calculator {
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public void add(float a, float b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10,20);
        calculator.add(10, 20, 30);
        calculator.add(10f, 29f);
    }
}
