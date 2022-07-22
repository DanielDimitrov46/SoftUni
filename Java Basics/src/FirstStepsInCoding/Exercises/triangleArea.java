package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = (side*height)/2;
        System.out.printf("%.2f",area);

    }
}
