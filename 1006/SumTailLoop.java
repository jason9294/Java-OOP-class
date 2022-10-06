
/*
請使用尾端遞迴及迴圈撰寫一個計算一個數字字串內所有數字的和的類別方法。

Input a string of numbers:
1234
尾端遞迴：10
迴圈：10
Input a string of numbers:
3456
尾端遞迴：18
迴圈：18
 */
import java.util.Scanner;

public class SumTailLoop {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        String s;
        System.out.println("Input a string of numbers:");
        s = keyboard.nextLine();
        System.out.printf("尾端遞迴：%d\n", sumTail(s, 0));
        System.out.printf("迴圈：%d\n", sumLoop(s, 0));
        System.out.println("Input a string of numbers:");
        s = keyboard.nextLine();
        System.out.printf("尾端遞迴：%d\n", sumTail(s, 0));
        System.out.printf("迴圈：%d\n", sumLoop(s, 0));
    }

    public static int sumTail(String str, int r) {
        if (empty(str)) {
            return r;
        } else {
            return sumTail(rest(str), r + first(str));
        }
    }

    public static int sumLoop(String str, int r) {
        while (!empty(str)) {
            r = r + first(str);
            str = rest(str);
        }
        return r;
    }

    public static boolean empty(String str) {
        return (str.equals(""));
    }

    public static int first(String str) {
        return Integer.parseInt(str.substring(0, 1));
    }

    public static String rest(String str) {
        return str.substring(1);
    }
}
