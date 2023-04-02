package StrahoExam;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        days -= 1;
        String type = scanner.nextLine();
        String grade = scanner.nextLine();
        double price = 0;
        double total = 0;
        switch (type) {
            case "room for one person":
                price = 18.00;
                total = price * days;
                break;
            case "apartment":
                price = 25;
                total = price * days;
                if (days < 10) {
                    total *= 0.7;
                } else if (days >= 10 && days <= 15) {
                    total *= 0.65;
                } else {
                    total *= 0.5;
                }
                break;
            case "president apartment":
                price = 35;
                total = price * days;
                if (days < 10) {
                    total *= 0.9;
                } else if (days >= 10 && days <= 15) {
                    total *= 0.85;
                } else {
                    total *= 0.8;
                }
                break;
        }
        if (grade.equals("positive")) {
            total = total + (total * 0.25);
        } else {
            total *= 0.9;
        }
        System.out.printf("%.2f", total);
    }
}
