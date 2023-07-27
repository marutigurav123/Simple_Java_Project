package project;

import java.util.ArrayList;
import java.util.Scanner;


	public class StudentManagementSystem {
	    private static ArrayList<Student> students = new ArrayList<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Student Management System");
	            System.out.println("1. Add Student");
	            System.out.println("2. Display All Students");
	            System.out.println("3. Search Student by ID");
	            System.out.println("4. Exit");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addStudent(scanner);
	                    break;
	                case 2:
	                    displayAllStudents();
	                    break;
	                case 3:
	                    searchStudent(scanner);
	                    break;
	                case 4:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	    private static void addStudent(Scanner scanner) {
	        System.out.print("Enter student name: ");
	        String name = scanner.next();

	        System.out.print("Enter student age: ");
	        int age = scanner.nextInt();

	        System.out.print("Enter student ID: ");
	        String studentId = scanner.next();

	        Student student = new Student(name, age, studentId);
	        students.add(student);

	        System.out.println("Student added successfully!");
	    }

	    private static void displayAllStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students found in the system.");
	        } else {
	            System.out.println("List of all students:");
	            for (Student student : students) {
	                System.out.println(student);
	            }
	        }
	    }

	    private static void searchStudent(Scanner scanner) {
	        System.out.print("Enter student ID to search: ");
	        String searchId = scanner.next();

	        for (Student student : students) {
	            if (student.getStudentId().equals(searchId)) {
	                System.out.println("Student found:");
	                System.out.println(student);
	                return;
	            }
	        }

	        System.out.println("Student with ID " + searchId + " not found.");
	    }
	}





