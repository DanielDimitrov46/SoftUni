package NestedLoops.Exercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double total = 0;
        int graders = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            double averageGrade = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                total += grade;
                averageGrade += grade;
                graders++;
            }
            System.out.printf("%s - %.2f.%n", input, averageGrade / n);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", total / graders);
    }
}
