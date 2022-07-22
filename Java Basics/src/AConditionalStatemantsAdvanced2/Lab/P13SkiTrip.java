package AConditionalStatemantsAdvanced2.Lab;

import java.util.Scanner;

public class P13SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stayedPeriod = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String opinion = scanner.nextLine();
        double priceForPeriodWithoutDiscount = 0;
        int realPeriod = stayedPeriod - 1;
        double priceForOneNight = 0;
        switch (typeRoom) {
            case "room for one person":
                priceForOneNight = 18.00;
                priceForPeriodWithoutDiscount = priceForOneNight * realPeriod;
                if (realPeriod < 10) {
                    priceForPeriodWithoutDiscount = priceForPeriodWithoutDiscount;
                } else if (realPeriod >= 10 && realPeriod <= 15) {
                    priceForPeriodWithoutDiscount = priceForPeriodWithoutDiscount;
                } else {
                    priceForPeriodWithoutDiscount = priceForPeriodWithoutDiscount;
                }
                break;
            case "apartment":
                priceForOneNight = 25.00;
                priceForPeriodWithoutDiscount = priceForOneNight * realPeriod;
                if (realPeriod < 10) {
                    priceForPeriodWithoutDiscount -= priceForPeriodWithoutDiscount * 0.30;
                } else if (realPeriod >= 10 && realPeriod <= 15) {
                    priceForPeriodWithoutDiscount -= priceForPeriodWithoutDiscount * 0.35;
                } else {
                    priceForPeriodWithoutDiscount -= priceForPeriodWithoutDiscount * 0.50;
                }
                break;
            case "president apartment":
                priceForOneNight = 35.00;
                priceForPeriodWithoutDiscount = priceForOneNight * realPeriod;
                if (realPeriod < 10) {
                    priceForPeriodWithoutDiscount -= priceForPeriodWithoutDiscount * 0.10;
                } else if (realPeriod >= 10 && realPeriod <= 15) {
                    priceForPeriodWithoutDiscount -= priceForPeriodWithoutDiscount * 0.15;
                } else {
                    priceForPeriodWithoutDiscount -= priceForPeriodWithoutDiscount * 0.20;
                }
                break;
        }
        if (opinion.equals("positive")){
            priceForPeriodWithoutDiscount+=priceForPeriodWithoutDiscount*0.25;
        }else{
            priceForPeriodWithoutDiscount-=priceForPeriodWithoutDiscount*0.10;
        }
        System.out.printf("%.2f",priceForPeriodWithoutDiscount);

    }
}
