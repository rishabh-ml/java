import java.util.Scanner;

public class CGPAJavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        
        double totalGradePoints = 0;
        
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter grade points for subject " + i + ": ");
            double gradePoints = scanner.nextDouble();
            totalGradePoints += gradePoints;
        }
        
        double cgpa = totalGradePoints / subjects;
        
        System.out.println("The CGPA is: " + cgpa);
        
        scanner.close();
    }
}
