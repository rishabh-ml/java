import java.util.Scanner;

public class DepreciationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();
        
        System.out.print("Enter the scrap value: ");
        double scrapValue = scanner.nextDouble();
        
        System.out.print("Enter the useful life in years: ");
        int lifeInYears = scanner.nextInt();
        
        double depreciation = (costPrice - scrapValue) / lifeInYears;
        
        System.out.println("The yearly depreciation is: " + depreciation);
        
        scanner.close();
    }
}
