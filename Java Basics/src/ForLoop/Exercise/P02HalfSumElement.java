package ForLoop.Exercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            total+=number;
            if(number>maxNumber){
            maxNumber = number;
            }

        }
            total-=maxNumber;
            if(maxNumber==total){
                System.out.printf("Yes%n");
                System.out.printf("Sum = %d",total);
            }else{
                System.out.printf("No%n");
                System.out.printf("Diff = %d",Math.abs(maxNumber-total));
            }
    }
}
