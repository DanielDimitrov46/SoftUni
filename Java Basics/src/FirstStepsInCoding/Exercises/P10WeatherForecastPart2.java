package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());
        String weather = "";
        if (degrees>=5.00&&degrees<=11.9){
            weather="Cold";
        }else if (degrees>=12.00&&degrees<=14.9){
            weather = "Cool";
        }else if (degrees>=15.00&&degrees<=20.00) {
            weather = "Mild";
        }else if(degrees>=20.1&&degrees<=25.9){
            weather = "Warm";
        }else if (degrees>=26.00&&degrees<=35.00){
            weather = "Hot";
        }else{
            weather = "unknown";
        }
        System.out.println(weather);

    }
}
