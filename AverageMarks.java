import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        
        double totalMarks = 0;
        
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }
        
        double averageMarks = totalMarks / subjects;
        
        System.out.println("The average marks are: " + averageMarks);
        
        scanner.close();
    }
}
