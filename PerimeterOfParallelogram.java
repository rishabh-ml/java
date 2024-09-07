import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the side of the parallelogram: ");
        double side = scanner.nextDouble();
        double perimeter = 2 * (base + side);
        System.out.println("The perimeter of the parallelogram is: " + perimeter);
        scanner.close();
    }
}
