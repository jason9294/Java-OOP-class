import java.util.*;

public class AnyFail {
    public static void main(String args[]) {
        System.out.println(anyFail(new StringTokenizer("")));
        System.out.println(anyFail(new StringTokenizer("60 90")));
        System.out.println(anyFail(new StringTokenizer("60 90 55 70")));
    }

    public static boolean anyFail(StringTokenizer st) {
        if (empty(st))
            return false;
        else if (next(st) >= 60) // 讀取目前的token，然後讓下次再呼叫時，能傳回下一token。
            return anyFail(st);
        else
            return true;
    }

    public static boolean empty(StringTokenizer st) {
        return !(st.hasMoreTokens());
    }

    public static int next(StringTokenizer st) {
        return Integer.parseInt(st.nextToken());
    }
}
