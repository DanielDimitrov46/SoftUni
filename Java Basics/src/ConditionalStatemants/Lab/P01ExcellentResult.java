package ConditionalStatemants.Lab;

import java.util.Scanner;

public class P01ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = Integer.parseInt(scanner.nextLine());
        if (mark>=5){
            System.out.println("Excellent!");

        }
    }
}
