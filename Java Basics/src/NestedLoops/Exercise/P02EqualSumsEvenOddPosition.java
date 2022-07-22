package NestedLoops.Exercise;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        for (int i = n1; i <= n2; i++) {
            int number = i;
            int evenPositions = 0;
            int oddPositions = 0;
            for (int j = 6; j > 0; j--) {
                int digit = number % 10;
                number /= 10;
                if (j % 2 == 0) {
                    evenPositions += digit;
                } else {
                    oddPositions += digit;
                }
            }
            if (evenPositions == oddPositions) {
                System.out.printf("%d ", i);

            }

        }
    }
}
