class AnyTrue {
    public static void main(String args[]) {
        System.out.println(anyTrue("")); // => false 輸入參數中沒有一個true的值，所以結果是false。
        System.out.println(anyTrue("000")); // => false
        System.out.println(anyTrue("00010")); // => true
    }

    public static boolean anyTrue(String str) {
        System.out.println("str = " + str);
        if (empty(str))
            return false;
        else if (first(str) == 1)
            return true;
        else
            return anyTrue(rest(str));
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