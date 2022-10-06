import java.util.Scanner;

public class Reverse {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        String s, c;
        System.out.println("Input a string:");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
        System.out.println("Input a string:");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
    }

    public static String reverse(String str) {
        if (empty(str)) {
            return "";
        }
        return reverse(rest(str)) + first(str);
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
