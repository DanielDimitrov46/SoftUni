package NestedLoops.Lab;

import java.util.Scanner;

public class P02MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int firstNumber = 1; firstNumber <= 10; firstNumber++) {
            for (int secondNumber = 1; secondNumber <= 10; secondNumber++) {
                System.out.printf("%d * %d = %d%n",firstNumber,secondNumber,firstNumber*secondNumber);
            }
        }
    }
}
