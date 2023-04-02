package StrahoExam;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double party = scanner.nextDouble();
        int lovelypisaniq = scanner.nextInt();
        int roses = scanner.nextInt();
        int keyholders = scanner.nextInt();
        int carikaturi = scanner.nextInt();
        int surprise = scanner.nextInt();

        double total = lovelypisaniq*0.60+roses*7.20+keyholders*3.60+carikaturi*18.20+surprise*22;
        int numberOfArticles = lovelypisaniq+roses+keyholders+carikaturi+surprise;
        if (numberOfArticles>25){
            total*=0.65;
        }
        total*=0.90;
        if(total>=party){
            System.out.printf("Yes! %.2f lv left.", total-party);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", party-total);
        }
    }
}
