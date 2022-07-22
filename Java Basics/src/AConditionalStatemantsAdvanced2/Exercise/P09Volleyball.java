package AConditionalStatemantsAdvanced2.Exercise;

import java.util.Scanner;

public class P09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfYear = scanner.nextLine();
        double numberOfHolidays = Integer.parseInt(scanner.nextLine());
        double numberOfWeekendsTravel = Integer.parseInt(scanner.nextLine());

        double weekendsInSofia = 48 - numberOfWeekendsTravel;
        double gamesInSofia = weekendsInSofia * 3 / 4;

        double gamesOnHolidays = numberOfHolidays * 2 / 3;
        double totalGames = gamesInSofia + numberOfWeekendsTravel + gamesOnHolidays;
        if (typeOfYear.equals("leap")) {
            totalGames = Math.floor(totalGames + totalGames * 0.15);
        } else {
            totalGames = Math.floor(totalGames);
        }
        System.out.printf("%.0f", totalGames);
    }
}
