package examExercises;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rentForHall = Integer.parseInt(scanner.nextLine());
        double statue = rentForHall*0.70;
        double catering = statue*0.85;
        double sound = catering*0.50;
        double totalFees = statue+catering+sound+rentForHall;
        System.out.printf("%.2f",totalFees);
    }
}
