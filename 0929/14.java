import java.util.*;

class LoopLogicError6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tot = 0;
        while (true) {
            System.out.println("請輸入數值，或輸入-1結束程式：");
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            tot = tot + num;
        }
        System.out.println("你輸入的數字總合為：" + tot);
        System.out.println("程式結束");
    }
}
