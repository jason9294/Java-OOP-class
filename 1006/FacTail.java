import java.util.Scanner;

public class FacTail {
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
            System.out.printf("%d 的階乘(內涵是遞迴) = %d\n", num, factorial(num));
            System.out.printf("%d 的階乘(尾端遞迴) = %d\n", num, facTail(num, 1));
            System.out.printf("%d 的階乘(迴圈) = %d\n", num, facLoop(num, 1));
        }
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    static int facTail(int n, int r) {
        if (n == 0)
            return r;
        else
            return facTail(n - 1, n * r);
    }

    static int facLoop(int n, int r) {
        for (int i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
}
