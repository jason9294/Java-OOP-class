import java.util.Scanner;

public class PowerOfTail {
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
            System.out.println("Ans（尾端遞迴）: " + powerTail(m, n, 1));
            System.out.println("Ans（迴圈）: " + powerLoop(m, n));
        }
    }

    static int powerTail(int m, int n, int r) {
        if (n == 0) {
            return r;
        } else {
            return powerTail(m, n - 1, r * m);
        }
    }

    static int powerLoop(int m, int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * m;
        }
        return res;
    }
}
