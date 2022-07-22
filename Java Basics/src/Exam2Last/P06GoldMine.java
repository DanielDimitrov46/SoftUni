package Exam2Last;

import java.util.Scanner;

public class P06GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLocations = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= numberOfLocations; i++) {
            double averageProfitTForDay = Double.parseDouble(scanner.nextLine());
            int numberOfDaysForOneLocation = Integer.parseInt(scanner.nextLine());
            double forPeriodProfit = 0;
            for (int j = 1; j <= numberOfDaysForOneLocation; j++) {
                double ProfitTForDay = Double.parseDouble(scanner.nextLine());
                forPeriodProfit += ProfitTForDay;
            }
            double averageGold = forPeriodProfit / numberOfDaysForOneLocation;;
            if(averageGold>=averageProfitTForDay){
                System.out.printf("Good job! Average gold per day: %.2f.\n",averageGold);
            }else {
                double diff = averageProfitTForDay-averageGold;
                System.out.printf("You need %.2f gold.%n",diff);
            }
        }
    }
}
