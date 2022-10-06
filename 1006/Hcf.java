import java.util.Scanner;

public class Hcf {
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
            System.out.println("最大公因數為: " + getHcf(m, n, m));
        }
    }

    static int getHcf(int m, int n, int r) {
        if (n % r == 0 && m % r == 0) {
            return r;
        } else {
            return getHcf(m, n, r - 1);
        }
    }
}
