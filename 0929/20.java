import java.util.*;

class DoWhileLoop {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
        test();
    }

    public static void test() {
        int n;
        do {
            System.out.println("請輸入 n 的值 (n 大於 0，且為偶數):");
            n = keyboard.nextInt();
        } while (n <= 0 || n % 2 != 0);

        int sum = 0;
        for (int i = 2; i <= n; i = i + 2) {
            sum = sum + i;
        }

        System.out.printf("2 + 4 + ... + %d = %d", n, sum);
    }
}
