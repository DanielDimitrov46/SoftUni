package StrahoExam;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int first =number%10;
        int second =(number/10)%10;
        int third =(number/100)%10;
        for (int i = 1; i < first+1; i++) {
            for (int j = 1; j < second+1; j++) {
                for (int k = 1; k < third+1; k++) {
                    System.out.printf("%d * %d * %d = %d;\n",i,j,k,i*j*k);
                }
            }
        }
    }
}
