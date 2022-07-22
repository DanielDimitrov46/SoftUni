package WhileLoop.Exercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBadMarks = Integer.parseInt(scanner.nextLine());
        String nameOfProblem = scanner.nextLine();
        int badMarksCounter = 0;
        int totalMarks = 0;
        String lastProblem = "";
        boolean failed = true;
        int marksCounter = 0;
        int problemsCounter = 0;

        while (!nameOfProblem.equals("Enough")) {
            int mark = Integer.parseInt(scanner.nextLine());
            problemsCounter++;
            totalMarks += mark;
            lastProblem = nameOfProblem;
            if (mark <= 4) {
                badMarksCounter++;
                if (badMarksCounter >= numberOfBadMarks) {
                    System.out.printf("You need a break, %d poor grades.", numberOfBadMarks);
                    failed = false;
                    break;
                }
            }
            marksCounter++;
            nameOfProblem = scanner.nextLine();
        }

        if (failed) {
            System.out.printf("Average score: %.2f%n", (double) totalMarks / marksCounter);
            System.out.printf("Number of problems: %d%n", problemsCounter);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
