package ForLoop.MoreExercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double from5AndHigher = 0;
        double from4To499 = 0;
        double from3To399 = 0;
        double below3 = 0;
        double totalGrades = 0;
        for (int i = 0; i < n; i++) {
            double studentsGrades = Double.parseDouble(scanner.nextLine());
            totalGrades+=studentsGrades;
            if (studentsGrades < 3) {
                below3++;
            } else if (studentsGrades <= 3.99) {
                from3To399++;
            } else if (studentsGrades <= 4.99) {
                from4To499++;
            } else {
                from5AndHigher++;
            }
        }
        double percentageTopStudents = (from5AndHigher/n)*100;
        double percentageFrom4 = (from4To499/n)*100;
        double percentageFrom3 = (from3To399/n)*100;
        double percentageBelow3 = (below3/n)*100;
        double averageGrade = (totalGrades/n);
        System.out.printf("Top students: %.2f%%%n",percentageTopStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",percentageFrom4);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",percentageFrom3);
        System.out.printf("Fail: %.2f%%%n",percentageBelow3);
        System.out.printf("Average: %.2f%n",averageGrade);
    }
}
