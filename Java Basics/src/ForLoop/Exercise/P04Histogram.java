package ForLoop.Exercise;

import java.util.Scanner;

public class P04Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1Counter = 0;
        double p2Counter = 0;
        double p3Counter = 0;
        double p4Counter = 0;
        double p5Counter = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1Counter++;
            } else if (number < 400) {
                p2Counter++;
            } else if (number < 600) {
                p3Counter++;
            } else if (number < 800) {
                p4Counter++;
            } else {
                p5Counter++;
            }
        }
        double p1= (p1Counter/n)*100;
        double p2= (p2Counter/n)*100;
        double p3= (p3Counter/n)*100;
        double p4= (p4Counter/n)*100;
        double p5= (p5Counter/n)*100;
        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%%n",p5);
    }
}
