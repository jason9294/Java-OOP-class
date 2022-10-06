import java.util.Scanner;

public class PowerOf {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        int m, n;
        while (true) {
            System.out.println("Input m:");
            m = keyboard.nextInt();
            if (m == 999) {
                System.out.println("End");
                break;
            }
            System.out.println("Input n:");
            n = keyboard.nextInt();
            System.out.println("Ans: " + power(m, n));
        }
    }

    static int power(int m, int n) {
        if (n == 1) {
            return m;
        } else {
            return power(m, n - 1) * m;
        }

    }
}
