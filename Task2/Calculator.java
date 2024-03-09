import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] marks = new int[numStudents]; // Create an array to store the marks

        // Loop to input marks
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double averageMark = (double) totalMarks / numStudents;

        char grade;
        if (averageMark >= 90) {
            grade = 'A';
        } else if (averageMark >= 80) {
            grade = 'B';
        } else if (averageMark >= 70) {
            grade = 'C';
        } else if (averageMark >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + averageMark);
        System.out.println("Grade: " + grade);
    }
}
