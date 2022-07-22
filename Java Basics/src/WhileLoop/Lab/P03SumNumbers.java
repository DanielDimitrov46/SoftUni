package WhileLoop.Lab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        //int inputs = Integer.parseInt(scanner.nextLine());
        int total = 0;
        while (total < number) {
            int inputs = Integer.parseInt(scanner.nextLine());
            total += inputs;
        }
        System.out.printf("%d", total);
    }
}
