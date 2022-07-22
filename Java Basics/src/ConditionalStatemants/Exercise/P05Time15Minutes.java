package ConditionalStatemants.Exercise;

import java.util.Scanner;

public class P05Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minutes2 =minutes+15;
        if (minutes2>59){
            minutes2 = minutes2-60;
            hour++;
            if (hour>23){
                hour = 0;
            }
            if (minutes2<10){
                System.out.printf("%d:0%d",hour,minutes2);
            }else{
                System.out.printf("%d:%d",hour,minutes2);
            }
        }else{
            System.out.printf("%d:%d",hour,minutes2);
        }

    }
}
