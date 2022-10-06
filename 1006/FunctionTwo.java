import java.util.Scanner;

public class FunctionTwo {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Input the number n:");
        int n = keyboard.nextInt();
        System.out.println("Ans: " + sum2(n));
    }

    static int sum2(int n) {
        if (n == 1) {
            return 2;
        }
        return sum2(n - 1) + 2 * n;
    }
}
