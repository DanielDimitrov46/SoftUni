package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //green
        double sideArea = x * y;
        double windowArea = 1.5 * 1.5;
        double twoSides = sideArea * 2 - windowArea * 2;
        double backWallArea = x * x;
        double entranceArea = 2 * 1.2;
        double backAndFrontWall = 2 * backWallArea - entranceArea;
        double totalGreenArea = twoSides + backAndFrontWall;
        double greenPaint = totalGreenArea / 3.4;

        //red
        double rectsOnRoof = 2*(x*y);
        double twoTriangles = 2*(x*h/2);
        double totalRedPaint = rectsOnRoof+twoTriangles;
        double redPaint = totalRedPaint/4.3;
        System.out.printf("%.2f\n",greenPaint);

        System.out.printf("%.2f",redPaint);

    }
}
