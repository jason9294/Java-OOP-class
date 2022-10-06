import java.util.Scanner;

public class Factorial {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        int num;
        while (true) {
            System.out.println("Input n:");
            num = keyboard.nextInt();
            if (num == 999) {
                System.out.println("End");
                break;
            }
            System.out.println(num + "的階乘 = " + factorial(num));
        }
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
