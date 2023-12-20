import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int nSubs = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= nSubs; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            total += marks;
        }
        double AvgPercent = (double) total / (nSubs * 100) * 100;
        char grade;
        if (AvgPercent >= 90) {
            grade = 'A';
        } else if (AvgPercent >= 75) {
            grade = 'B';
        } else if (AvgPercent >= 60) {
            grade = 'C';
        } else if (AvgPercent >= 45) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("----------------------------");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + AvgPercent + "%");
        System.out.println("Grade: " + grade);
    }
}