package AConditionalStatemantsAdvanced2.Lab;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        String workingTime = "";
        switch (day) {//if (day = "Monday"){}
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour >= 10 && hour <= 18) {
                    workingTime = "open";
                } else {
                    workingTime = "closed";
                }
                break;
            default:
                workingTime = "closed";
                break;
        }
        System.out.println(workingTime);
    }
}
