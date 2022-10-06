import java.util.Scanner;

public class CountA {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        String s;
        System.out.println("Input a string:");
        s = keyboard.nextLine();
        System.out.printf("%s has %d As\n", s, countA(s));
        System.out.println("Input a string:");
        s = keyboard.nextLine();
        System.out.printf("%s has %d As\n", s, countA(s));
    }

    public static int countA(String str) {
        if (empty(str)) {
            return 0;
        } else if (first(str).equals("A")) {
            return 1 + countA(rest(str));
        } else {
            return 0 + countA(rest(str));
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
