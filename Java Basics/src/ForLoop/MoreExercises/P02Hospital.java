package ForLoop.MoreExercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int medics = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (untreatedPatients>treatedPatients) {
                    medics++;
                }
            }
            int patients = Integer.parseInt(scanner.nextLine());
            if (patients <= medics) {
                treatedPatients+=patients;
            } else {
                treatedPatients+=medics;
                untreatedPatients+=patients-medics;
            }
        }
        System.out.printf("Treated patients: %d.%n",treatedPatients);
        System.out.printf("Untreated patients: %d.",untreatedPatients);
    }
}
