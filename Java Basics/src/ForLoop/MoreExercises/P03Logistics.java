package ForLoop.MoreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalTons = 0;
        double to3Tons = 0;
        double from4To11Tons = 0;
        double from12ToTons = 0;
        double averagePrice = 0;
        for (int i = 0; i < n; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            totalTons += tons;
            if(tons<=3){
            to3Tons+=tons;
            }else if(tons<=11){
            from4To11Tons+=tons;
            }else if(tons>=12){
                from12ToTons+=tons;
            }

        }
        averagePrice = (to3Tons*200+from4To11Tons*175+from12ToTons*120)/totalTons;
        System.out.printf("%.2f%n",averagePrice);
        System.out.printf("%.2f%%%n",(to3Tons/totalTons)*100);
        System.out.printf("%.2f%%%n",(from4To11Tons/totalTons)*100);
        System.out.printf("%.2f%%%n",(from12ToTons/totalTons)*100);
    }
}
