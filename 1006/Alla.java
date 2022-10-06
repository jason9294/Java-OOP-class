public class Alla {
    public static void main(String args[]) {
        System.out.println(allA("")); // => true 輸入參數中沒有一個false的值，所以結果是true。
        System.out.println(allA("aaa")); // => true
        System.out.println(allA("aaaa")); // => true
        System.out.println(allA("aa0a0")); // => false
    }

    public static boolean allA(String str) {
        if (empty(str))
            return true;
        else if (first(str).equals("a"))
            return allA(rest(str));
        else
            return false;
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
