package NestedLoops.Lab;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            for (int f = 0; f <= n; f++) {
                for (int j = 0; j <= n; j++) {
                    if (i + f + j == n) {
                        counter++;
                    }
                }
            }
        }
        System.out.printf("%d",counter);
    }
}
