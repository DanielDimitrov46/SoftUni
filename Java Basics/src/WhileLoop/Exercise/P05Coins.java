package WhileLoop.Exercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        int coins = 0;

        while (sum > 0){
            sum = Math.round(sum*100.0)/100.0;
            if(sum>=3){
            sum-=2;
            coins++;
            }else if(sum>=2){
            sum-=2;
            coins++;
            }else if(sum>=1){
                sum-=1;
                coins++;
            }else if(sum>=0.50){
                sum-=0.50;
                coins++;
            }else if(sum>=0.20){
                sum-=0.20;
                coins++;
            }else if(sum>=0.10){
                sum-=0.10;
                coins++;
            }else if(sum>=0.05){
                sum-=0.05;
                coins++;
            }else if(sum>=0.02){
                sum-=0.02;
                coins++;
            }else if(sum>=0.01){
                sum-=0.01;
                coins++;
            }
        }
        System.out.printf("%d",coins);
    }
}
