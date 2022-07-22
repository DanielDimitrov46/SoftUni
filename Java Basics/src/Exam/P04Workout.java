package Exam;

import java.util.Scanner;

public class P04Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double kilometresFirstDay = Double.parseDouble(scanner.nextLine());
        double totalKilometres = kilometresFirstDay;


        for (int i = 1; i <= n; i++) {
            int dayNormPercent = Integer.parseInt(scanner.nextLine());
            double moreKilometres = kilometresFirstDay + (kilometresFirstDay * dayNormPercent/100.0);
            kilometresFirstDay = moreKilometres;
            totalKilometres+=kilometresFirstDay;


        }
        if(totalKilometres>=1000){
            System.out.printf("You've done a great job running %.0f more kilometers!%n",Math.ceil(totalKilometres-1000));
        }else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",Math.ceil(1000-totalKilometres));
        }
    }
}
