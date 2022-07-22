package ForLoop.Lab;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input > maxValue) {
                maxValue = input;
            }
            if (input < minValue) {
                minValue = input;
            }
        }
            System.out.printf("Max number: %d%n",maxValue);
            System.out.printf("Min number: %d",minValue);
    }
}
