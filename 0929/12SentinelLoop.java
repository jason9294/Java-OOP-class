import java.util.Scanner;

class SentinelLoop {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // 進入迴圈前的預備：
        // 1. 預備能從鍵盤輸入(Scanner)的變數
        // 2. 預備能存放輸入之整數的變數
        int n = 0;
        // 輸出提示
        // 讀取輸入之整數
        // 進入迴圈
        while (n != 999) {
            System.out.println("Please enter an integer or enter 999 to stop:");
            n = keyboard.nextInt();
            if (n == 999) {
                continue;
            }
            System.out.printf("You entered: %d\n", n);
            // 輸出提示
            // 讀取輸入之整數
        }
        // System.out.println("End.");
    }
}
