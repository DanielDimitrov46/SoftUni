package NestedLoops.Lab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                System.out.printf("%d:%d%n",hours,minutes);
            }
        }
    }
}
