import java.util.*;

public class AllPass {
    public static void main(String args[]) {
        System.out.println(allPass(new StringTokenizer("")));
        System.out.println(allPass(new StringTokenizer("60 90")));
        System.out.println(allPass(new StringTokenizer("60 90 55 70")));
    }

    public static boolean allPass(StringTokenizer st) {
        if (empty(st))
            return true;
        else if (next(st) >= 60) // 讀取目前的token，然後讓下次再呼叫時，能傳回下一token。
            return allPass(st);
        else
            return false;
    }

    public static boolean empty(StringTokenizer st) {
        return !(st.hasMoreTokens());
    }

    public static int next(StringTokenizer st) {
        return Integer.parseInt(st.nextToken());
    }
}
