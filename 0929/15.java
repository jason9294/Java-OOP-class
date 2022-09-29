import java.util.Scanner;

class Fac {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter one value:");
        int n = keyboard.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(n + "!:" + sum);
    }
}
