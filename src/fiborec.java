import java.util.Scanner;

public class fiborec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int r = sc.nextInt();
        fibonacciRecursian(r);
    }
    public static void fibonacciRecursian(int n){
        int a = 0;
        int b = 1;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            result = a + b;
            a = b;
            b = result;
        }
    }
}
