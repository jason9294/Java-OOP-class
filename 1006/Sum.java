
/*
請使用遞迴撰寫一個計算一個數字字串內所有數字的和的類別方法。

Input a string of numbers:
2345
14
Input a string of numbers:
369
18
 */

import java.util.Scanner;

public class Sum {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        String s;
        System.out.println("Input a string of numbers:");
        s = keyboard.nextLine();
        System.out.printf("%d\n", sum(s));
        System.out.println("Input a string of numbers:");
        s = keyboard.nextLine();
        System.out.printf("%d\n", sum(s));
    }

    public static int sum(String str) {
        if (empty(str)) {
            return 0;
        } else {
            return first(str) + sum(rest(str));
        }
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
