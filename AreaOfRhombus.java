import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first diagonal: ");
        double diagonal1 = scanner.nextDouble();
        System.out.print("Enter the length of the second diagonal: ");
        double diagonal2 = scanner.nextDouble();
        double area = 0.5 * diagonal1 * diagonal2;
        System.out.println("The area of the rhombus is: " + area);
        scanner.close();
    }
}
