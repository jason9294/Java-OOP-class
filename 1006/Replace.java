import java.util.Scanner;

public class Replace {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        String s, c1, c2;
        System.out.println("Input a string:");
        s = keyboard.nextLine();
        System.out.println("Input a character:");
        c1 = keyboard.nextLine();
        System.out.println("Input another character:");
        c2 = keyboard.nextLine();
        System.out.printf("%s\n", replace(s, c1, c2));
    }

    public static String replace(String str, String c1, String c2) {
        if (empty(str)) {
            return "";
        } else if (first(str).equals(c1)) {
            return c2 + replace(rest(str), c1, c2);
        } else {
            return first(str) + replace(rest(str), c1, c2);
        }
    }

    public static boolean empty(String str) {
        return (str.equals(""));
    }

    public static String first(String str) {
        return str.substring(0, 1);
    }

    public static String rest(String str) {
        return str.substring(1);
    }
}
