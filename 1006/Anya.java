public class Anya {
    public static void main(String args[]) {
        System.out.println(anyA("")); // => false 輸入參數中沒有一個rrue的值，所以結果是false。
        System.out.println(anyA("xyzc")); // => false
        System.out.println(anyA("xbac")); // => true
    }

    public static boolean anyA(String str) {
        if (empty(str)) {
            return false;
        } else if (first(str).equals("a")) {
            return true;
        } else {
            return anyA(rest(str));
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
