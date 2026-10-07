import java.util.*;

public class calculator{

    static int add(int a, int b) {
        return a + b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String op = sc.next();

        int result = op.equals("+") ? add(a, b) : divide(a, b);
        int expected = op.equals("+") ? a + b : a / b;

        System.out.println(result == expected ? "Test Passed" : "Test Failed");
    }
}