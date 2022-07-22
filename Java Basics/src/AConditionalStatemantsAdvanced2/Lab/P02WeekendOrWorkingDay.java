package AConditionalStatemantsAdvanced2.Lab;

import java.util.Scanner;

public class P02WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        String dayOfTheWeek = "";
        switch (day){
            case "Monday":
                dayOfTheWeek = "Working day";
                break;
            case "Tuesday":
                dayOfTheWeek = "Working day";
                break;
            case "Wednesday":
                dayOfTheWeek = "Working day";
                break;
            case "Thursday":
                dayOfTheWeek = "Working day";
                break;
            case "Friday":
                dayOfTheWeek = "Working day";
                break;
            case "Saturday":
                dayOfTheWeek = "Weekend";
                break;
            case "Sunday":
                dayOfTheWeek = "Weekend";
                break;
            default:
                dayOfTheWeek = "Error";
                break;
        }
        System.out.println(dayOfTheWeek);
    }
}
