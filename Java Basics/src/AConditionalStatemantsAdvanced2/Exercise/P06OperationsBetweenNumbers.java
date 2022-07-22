package AConditionalStatemantsAdvanced2.Exercise;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        double result = 0;
        String symbol = scanner.nextLine();
        String type = "";
        if (symbol.equals("+")) {
            result = n1 + n2;
            if (result % 2 == 0) {
                type = "even";
            } else {
                type = "odd";
            }
            System.out.printf("%.0f %s %.0f = %.0f - %s",n1,symbol,n2,result,type);
        } else if (symbol.equals("-")) {
            result = n1 - n2;
            if (result % 2 == 0) {
                type = "even";
            } else {
                type = "odd";
            }
            System.out.printf("%.0f %s %.0f = %.0f - %s",n1,symbol,n2,result,type);
        } else if (symbol.equals("*")) {
            result = n1 * n2;
            if (result % 2 == 0) {
                type = "even";
            } else {
                type = "odd";
            }
            System.out.printf("%.0f %s %.0f = %.0f - %s",n1,symbol,n2,result,type);
        } else if (symbol.equals("/")) {
            if (n2==0){
                System.out.printf("Cannot divide %.0f by zero",n1);
            }else {
            result = n1 / n2;
                System.out.printf("%.0f %s %.0f = %.2f",n1,symbol,n2,result);
            }

        }else if (symbol.equals("%")){
            if (n2==0){
                System.out.printf("Cannot divide %.0f by zero",n1);
            }else {
                result = n1 % n2;
                System.out.printf("%.0f %s %.0f = %.0f",n1,symbol,n2,result);
            }
        }
    }
}
