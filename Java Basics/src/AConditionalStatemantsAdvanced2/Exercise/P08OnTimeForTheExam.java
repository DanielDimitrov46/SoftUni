package AConditionalStatemantsAdvanced2.Exercise;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinutes;
        int arrivalTime = arriveHour * 60 + arriveMinutes;
        String condition = "";
        if (arrivalTime < examTime - 30) {
            condition = "Early";
            System.out.println(condition);
            int diff = examTime-arrivalTime;
            if (diff<60){
                System.out.printf("%d minutes before the start",diff);
            }else{
                int h = diff/60;
                int m = diff%60;
                System.out.printf("%d:%02d hours before the start",h,m);
            }
        } else if (arrivalTime <= examTime) {
            condition = "On time";
            System.out.println(condition);
            int diff = examTime-arrivalTime;
            if (diff>0){
                System.out.printf("%d minutes before the start",diff);
            }
        } else {
            condition = "Late";
            System.out.println(condition);
            int diff = arrivalTime-examTime;
            if (diff<60){
                System.out.printf("%d minutes after the start",diff);
            }else{
                int h = diff/60;
                int m = diff%60;
                System.out.printf("%d:%02d hours after the start",h,m);
            }
        }
    }
}
