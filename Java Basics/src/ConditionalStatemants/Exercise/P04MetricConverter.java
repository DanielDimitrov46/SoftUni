package ConditionalStatemants.Exercise;

import java.util.Scanner;

public class P04MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberForConvert = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();
        if (inputUnit.equals("cm")) {
            numberForConvert /= 100;
        } else if (inputUnit.equals("mm")) {
            numberForConvert /= 1000;
        }
        if (outputUnit.equals("mm")) {
            numberForConvert *= 1000;
        } else if (outputUnit.equals("cm")) {
            numberForConvert *= 100;
        }
        System.out.printf("%.3f",numberForConvert);
    }
}
