package studentmanagementsystem;

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[2];

        // Input for Regular Student
        System.out.println("Enter details for Regular Student:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();

        System.out.print("Student ID: ");
        int id1 = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character left by nextInt()

        System.out.print("Class Name: ");
        String className1 = scanner.nextLine();

        System.out.print("Enter 3 marks: ");
        double[] marks1 = new double[3];
        for (int i = 0; i < 3; i++) {
            marks1[i] = scanner.nextDouble();
        }
        scanner.nextLine(); // Clear buffer after reading doubles

        System.out.print("Attendance Status (Present/Absent): ");
        String attendanceStatus1 = scanner.nextLine();

        students[0] = new RegularStudent(name1, id1, className1, marks1, attendanceStatus1);

        // Input for Online Student
        System.out.println("\nEnter details for Online Student:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();

        System.out.print("Student ID: ");
        int id2 = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character left by nextInt()

        System.out.print("Class Name: ");
        String className2 = scanner.nextLine();

        System.out.print("Enter 3 marks: ");
        double[] marks2 = new double[3];
        for (int i = 0; i < 3; i++) {
            marks2[i] = scanner.nextDouble();
        }
        scanner.nextLine(); // Clear buffer after reading doubles

        System.out.print("Platform (Zoom/Google Meet): ");
        String platform = scanner.nextLine();

        System.out.print("Attendance Status (Present/Absent): ");
        String attendanceStatus2 = scanner.nextLine();

        students[1] = new OnlineStudent(name2, id2, className2, marks2, attendanceStatus2, platform);

        // Display details and calculate grades for each student
        for (Student student : students) {
            System.out.println("\n----------------------------------");
            student.displayDetails();
            ((Grading) student).calculateGrade();
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
