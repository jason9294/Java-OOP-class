import java.util.Scanner;

class GradeSum {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        int c = 0;
        while (true) {
            System.out.println("Please enter score or enter -1 to stop:");
            n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            c++;
            sum = sum + n;
        }
        System.out.printf("Total:%d", sum);
        System.out.printf("The average of %d score is:%.2f", c, (float) sum / c);

    }
}