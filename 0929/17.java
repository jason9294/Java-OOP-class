import java.util.Scanner;

class Nfac {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
        test();
    }

    public static void test() {
        System.out.println("Please enter one value:");
        int n = keyboard.nextInt();

        if (n > 10 || n < 1) {
            System.out.println("Error, the value is out of range.");
            return;
        }

        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(n + "!:" + sum);
    }
}
