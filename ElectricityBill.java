//For the first 100 units: ₹1.50 per unit
//For the next 200 units: ₹2.50 per unit
//For units above 300: ₹3.50 per unit


import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        
        double bill = 0;
        
        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 300) {
            bill = (100 * 1.50) + ((units - 100) * 2.50);
        } else {
            bill = (100 * 1.50) + (200 * 2.50) + ((units - 300) * 3.50);
        }
        
        System.out.println("The total electricity bill is: ₹" + bill);
        
        scanner.close();
    }
}
