import java.util.Scanner;

class Trace {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter one value:");
        int n = keyboard.nextInt();
        int sum = 1;
        int i = 1;
        while (i <= n + 1) {
            System.out.println("n=" + n + "m=" + i + "f=" + sum);
            if (i > n) {
                break;
            }
            sum = sum * i;
            i++;
        }
        System.out.println(n + "!:" + sum);
    }
}
