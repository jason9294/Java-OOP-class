import java.util.*;

class LoopLogicError4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        while (true) {
            System.out.print("請輸入兩個數，或輸入-1結束程式:");
            a = sc.nextInt();
            if (a == -1) {
                break;
            }
            b = sc.nextInt();
            System.out.printf("這兩個數相加的值是：%d%n", a + b);
        }
        System.out.println("程式結束");
    }
}
