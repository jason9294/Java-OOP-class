public class CountTrue {
    public static void main(String args[]) {
        System.out.println(countTrue("")); // => 0 輸入參數中沒有一個false的值，所以結果是0。
        System.out.println(countTrue("1")); // => 1
        System.out.println(countTrue("01")); // => 1
        System.out.println(countTrue("101")); // => 2
        System.out.println(countTrue("1101")); // => 3
    }

    public static int countTrue(String str) {
        if (empty(str))
            return 0;
        else if (first(str) == 1) // 1(true)
            return countTrue(rest(str)) + 1;
        else // 0(false)
            return countTrue(rest(str)) + 0;
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