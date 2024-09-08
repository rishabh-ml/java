import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the original price of the product: ");
        double originalPrice = scanner.nextDouble();
        
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();
        
        double discountAmount = (discountPercentage / 100) * originalPrice;
        double discountedPrice = originalPrice - discountAmount;
        
        System.out.println("The discounted price is: " + discountedPrice);
        
        scanner.close();
    }
}
