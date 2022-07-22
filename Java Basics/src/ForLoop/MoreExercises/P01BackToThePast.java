package ForLoop.MoreExercises;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int yearToStay = Integer.parseInt(scanner.nextLine());
        int years = yearToStay-1800;
        int evenYearsCounter = 0;
        int oddYearsCounter = 0;
        int boyYears = 18;
        int addedMoney = 0;
        for (int i = 0; i <= years; i++) {
            if (i % 2 == 0) {
                evenYearsCounter++;
                if(i!=0){
                boyYears++;
                }
            } else {
                oddYearsCounter++;
                boyYears++;
                addedMoney += 50 * boyYears;
            }
        }
        double evenMoney = evenYearsCounter * 12000;
        double oddMoney = oddYearsCounter * 12000 + addedMoney;
        double diff = money-(evenMoney+oddMoney);
        if(diff>=0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",diff);
        }else{
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(diff));
        }

    }
}
