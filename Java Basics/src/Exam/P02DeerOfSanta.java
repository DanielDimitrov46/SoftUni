package Exam;

import java.util.Scanner;

public class P02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysGone = Integer.parseInt(scanner.nextLine());
        int leftFoodInKg = Integer.parseInt(scanner.nextLine());
        double foodForFirstDeer = Double.parseDouble(scanner.nextLine());
        double foodForSecondDeer = Double.parseDouble(scanner.nextLine());
        double foodForThirdDeer = Double.parseDouble(scanner.nextLine());

        double totalFoodForFirstDeer = daysGone*foodForFirstDeer;
        double totalFoodForSecondDeer = daysGone*foodForSecondDeer;
        double totalFoodForThirdDeer = daysGone*foodForThirdDeer;

        double total = totalFoodForFirstDeer+totalFoodForSecondDeer+totalFoodForThirdDeer;

        if(total<=leftFoodInKg){
            System.out.printf("%.0f kilos of food left.%n",Math.floor(leftFoodInKg-total));
        }else{
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(total-leftFoodInKg));
        }
    }
}
