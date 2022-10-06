import java.util.Scanner;

public class RemoveChar {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        String s, c;
        System.out.println("Input a string:");
        s = keyboard.nextLine();
        System.out.println("Input a character:");
        c = keyboard.nextLine();
        System.out.printf("%s\n", removeChar(s, c));
        System.out.println("Input a string:");
        s = keyboard.nextLine();
        System.out.println("Input a character:");
        c = keyboard.nextLine();
        System.out.printf("%s\n", removeChar(s, c));
    }

    public static String removeChar(String str, String c) {
        if (empty(str)) {
            return "";
        } else if (!first(str).equals(c)) {
            return first(str) + removeChar(rest(str), c);
        } else {
            return removeChar(rest(str), c);
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
