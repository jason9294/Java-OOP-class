import java.util.*;

class GCD {
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        int num1, num2;

        while (true) {
            System.out.println("Input:");
            num1 = input.nextInt();
            if (num1 == 999) {
                break;
            }

            num2 = input.nextInt();
            int min;
            if (num1 < num2) {
                min = num1;
            } else {
                min = num2;
            }
            for (int i = min; i >= 1; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println(i);
                    break;
                }
            }

        }
        System.out.println("End.");
    }
}
