package ConditionalStatemants.Lab;

import java.util.Scanner;

public class P06AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double area = 0;
        if (type.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            area = a*a;
        }else if (type.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a*b;
        }else if (type.equals("circle")){
            double a = Double.parseDouble(scanner.nextLine());
            area =Math.PI*Math.pow(a,2);
        }else if (type.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = (a*b)/2;
        }
        System.out.printf("%.3f",area);

    }
}
