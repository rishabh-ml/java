import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();
        
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;
        
        System.out.println("The compound interest is: " + compoundInterest);
        
        scanner.close();
    }
}
