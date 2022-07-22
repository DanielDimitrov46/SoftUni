package AConditionalStatemantsAdvanced2.Lab;

import java.util.Scanner;

public class P04PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        String title = "";

        if (sex.equals("m")) {
            if (age >= 16) {
                title = "Mr.";
            } else {
                title = "Master";
            }
        } else if (sex.equals("f")) {
            if (age >= 16) {
                title = "Ms.";
            } else {
                title = "Miss";
            }
        }
        System.out.println(title);
    }
}
