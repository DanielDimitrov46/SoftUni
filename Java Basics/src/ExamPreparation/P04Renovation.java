package ExamPreparation;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightOfWall = Integer.parseInt(scanner.nextLine());
        int widthOfWall = Integer.parseInt(scanner.nextLine());
        int percentNotPainted = Integer.parseInt(scanner.nextLine());
        int sizeForPaint = heightOfWall * widthOfWall * 4;
        double forPaint = sizeForPaint - (sizeForPaint * (percentNotPainted / 100.0));
        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            int paint = Integer.parseInt(input);
            forPaint -= paint;
            if (forPaint <= 0) {

                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.", forPaint);
        } else if (forPaint < 0) {
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(forPaint));
        }else {
            System.out.printf("All walls are painted! Great job, Pesho!");
        }
    }
}
