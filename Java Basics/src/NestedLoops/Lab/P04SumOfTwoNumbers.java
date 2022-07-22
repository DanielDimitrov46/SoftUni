package NestedLoops.Lab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int combinationCounter = 0;
        int total = 0;
        boolean flag = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinationCounter++;
                total = i + j;
                if (total == magicNum) {
                    flag = true;
                    System.out.printf("Combination N:%d ", combinationCounter);
                    System.out.printf("(%d + %d = %d)%n", i, j, magicNum);
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if(!flag){
            System.out.printf("%d combinations - neither equals %d",combinationCounter,magicNum);
        }
    }
}
