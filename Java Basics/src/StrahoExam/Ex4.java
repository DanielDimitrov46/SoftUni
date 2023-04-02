package StrahoExam;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double total = 0;
        double current = 0;
        double currentDegrees = 0;
        for (int i = 0; i < n; i++) {
            double quantity = scanner.nextDouble();
            current += quantity;
            double degrees = scanner.nextDouble();
            total = quantity * degrees;
            currentDegrees += total;
        }
        double average = currentDegrees / current;
        System.out.printf("Liter: %.2f\n", current);
        System.out.printf("Degrees: %.2f\n", average);
        if (average < 38) {
            System.out.println("Not good, you should baking!");
        } else if (average >= 38 && average<=42) {
            System.out.println("Super!");
        }else{
            System.out.println("Dilution with distilled water!");
        }
    }
}
