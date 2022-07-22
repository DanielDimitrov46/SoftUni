package AConditionalStatemantsAdvanced2.Lab;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;
        boolean flag = true;
        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales*0.08;
                } else if(sales>10000){
                    commission = sales * 0.12;
                }else{
                    flag = false;
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales*0.10;
                } else if(sales>10000){
                    commission = sales * 0.13;
                }else{
                    flag = false;
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales*0.12;
                } else if(sales>10000){
                    commission = sales * 0.145;
                }else{
                    flag = false;
                    System.out.println("error");
                }
                break;
            default:
                flag = false;
                System.out.println("error");
                break;
        }
        if (flag){
            System.out.printf("%.2f",commission);
        }

    }
}
