package ExamPreparation;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first4Digit = Integer.parseInt(scanner.nextLine());
        int last4Digit = Integer.parseInt(scanner.nextLine());

        int a = first4Digit / 1000;
        int b = (first4Digit / 100) % 10;
        int c = (first4Digit / 10) % 10;
        int d = (first4Digit / 1)% 10;

        int j = last4Digit / 1000;
        int k = (last4Digit / 100) % 10;
        int l = (last4Digit / 10) % 10;
        int m = (last4Digit / 1) % 10;

        for (int i = a; i <= j; i++) {
            if (i % 2 != 0) {
                for (int n = b; n <= k; n++) {
                    if (n % 2 != 0) {
                        for (int o = c; o <= l; o++) {
                            if (o % 2 != 0) {
                                for (int p = d; p <= m; p++) {
                                    if (p % 2 != 0) {
                                        System.out.printf("%d%d%d%d ", i, n, o, p);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
