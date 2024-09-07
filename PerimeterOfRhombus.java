import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the rhombus: ");
        double side = scanner.nextDouble();
        double perimeter = 4 * side;
        System.out.println("The perimeter of the rhombus is: " + perimeter);
        scanner.close();
    }
}
