public class DemoException {
    public static void main(String[] args) {
        int a = 10, b = 0, result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("ArithmeticException Handled");
        }
        System.out.println("Result: " + result);

        try {
            str("Saptarshi");
            str(null);
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("NullPointerException Handled");
        }
    }

    public static void str(String s) {
        System.out.println(s.length());
    }
}
