import java.util.*;

class Power {
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
            System.out.println((long) Math.pow(num1, num2));
        }
        System.out.println("End.");
    }
}
