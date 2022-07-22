package ForLoop.Exercise;

import java.util.Scanner;

public class P05DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                p2++;
            } if (number % 3 == 0) {
                p3++;
            } if (number % 4 == 0) {
                p4++;
            }
        }
        double numbers1 = p2 / n * 100;
        double numbers2 = p3 / n * 100;
        double numbers3 = p4 / n * 100;

        System.out.printf("%.2f%%%n",numbers1);
        System.out.printf("%.2f%%%n",numbers2);
        System.out.printf("%.2f%%",numbers3);
    }
}
