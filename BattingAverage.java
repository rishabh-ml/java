import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total runs scored: ");
        double totalRuns = scanner.nextDouble();
        
        System.out.print("Enter times out: ");
        int timesOut = scanner.nextInt();
        
        double battingAverage = totalRuns / timesOut;
        
        System.out.println("The batting average is: " + battingAverage);
        
        scanner.close();
    }
}
