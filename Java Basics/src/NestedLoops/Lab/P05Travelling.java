package NestedLoops.Lab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("End")) {
            String destination = input;
            double price = Double.parseDouble(scanner.nextLine());
            while (sum < price) {
                double amount = Double.parseDouble(scanner.nextLine());
                sum += amount;
            }
            System.out.printf("Going to %s!%n", destination);
            sum = 0;
            input = scanner.nextLine();
        }
    }
}
