    package ConditionalStatemants.Exercise;

    import java.util.Scanner;

    public class P01SumSeconds {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int seconds1 = Integer.parseInt(scanner.nextLine());
            int seconds2 = Integer.parseInt(scanner.nextLine());
            int seconds3 = Integer.parseInt(scanner.nextLine());
            int totalTimeInSeconds = seconds1 + seconds2 + seconds3;
            int seconds = totalTimeInSeconds%60;
            int minutes = totalTimeInSeconds/60;
            if (seconds<10){
                System.out.printf("%d:%02d",minutes,seconds);
            }else{
                System.out.printf("%d:%02d",minutes,seconds);
            }


        }
    }
