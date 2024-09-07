import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the equilateral triangle: ");
        double side = scanner.nextDouble();
        double perimeter = 3 * side;
        System.out.println("The perimeter of the equilateral triangle is: " + perimeter);
        scanner.close();
    }
}
