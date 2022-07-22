package NestedLoops.Exercise;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
            int primeSum = 0;
            int nonPrimeSum = 0;
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
        boolean check = true;
            for (int i = 2; i < number - 1; i++) {
                if (number % i == 0) {
                    check = false;
                }
            }
            if(!check){
            nonPrimeSum+=number;
            }else{
                primeSum+=number;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n" +
                "Sum of all non prime numbers is: %d",primeSum,nonPrimeSum);

    }
}
