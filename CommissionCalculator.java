import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total sales amount: ");
        double totalSales = scanner.nextDouble();
        
        System.out.print("Enter commission percentage: ");
        double commissionPercentage = scanner.nextDouble();
        
        double commissionAmount = (commissionPercentage / 100) * totalSales;
        
        System.out.println("The commission amount is: " + commissionAmount);
        
        scanner.close();
    }
}
