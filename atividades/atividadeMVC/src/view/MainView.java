package view;

import controller.StudentController;
import model.*;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainView {
    private Scanner scanner;
    private StudentController controller;
    private University hogwarts;
    private Course firstYearCourse;

    public MainView() {
        scanner = new Scanner(System.in);
        controller = new StudentController();
        hogwarts = new University("Hogwarts School of Witchcraft and Wizardry");
        firstYearCourse = new Course(1, "1st Year Magic School");
    }

    public void showMenu() {
        int option;
        do {
            System.out.println("\n=== THE MARAUDER'S MAP (STUDENT CRUD) ===");
            System.out.println("1 - Enroll New Student (Create)");
            System.out.println("2 - View Great Hall (List All)");
            System.out.println("3 - Update Student Details (Update)");
            System.out.println("4 - Expel Student (Delete)");
            System.out.println("0 - Mischief Managed (Exit)");
            System.out.print("Choose your spell: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: enrollNewStudent(); break;
                case 2: listStudents(); break;
                case 3: updateStudent(); break;
                case 4: expelStudent(); break;
                case 0: System.out.println("Nox. System shutting down."); break;
                default: System.out.println("Invalid spell cast.");
            }
        } while (option != 0);
        scanner.close();
    }

    private void enrollNewStudent() {
        System.out.print("Enter Muggle/Wizard Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // Cria Person -> Passa pela University -> Vira Student
        Person newPerson = new Person(name, age);
        Student matriculatedStudent = hogwarts.enrollStudent(newPerson, firstYearCourse);

        controller.createStudent(matriculatedStudent);
    }

    private void listStudents() {
        List<Student> students = controller.getAllStudents();
        System.out.println("\n--- LIST OF REGISTERED WIZARDS ---");
        for (Student s : students) {
            // nomes das disciplinas e juntos em uma String
            String subjectsStr = s.getCourse().getSubjects().stream()
                    .map(Subject::getName)
                    .collect(Collectors.joining(", "));

            System.out.printf("ID: %d | Name: %-18s | Age: %d | Enrollment: %s\n",
                    s.getId(), s.getName(), s.getAge(), s.getEnrollmentNumber());
            System.out.println("   -> Course: " + s.getCourse().getName());
            System.out.println("   -> Subjects: [" + (subjectsStr.isEmpty() ? "None" : subjectsStr) + "]");
            System.out.println("-----------------------------------------------------------");
        }
    }

    private void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Age: ");
        int age = scanner.nextInt();

        controller.updateStudent(id, name, age);
    }

    private void expelStudent() {
        System.out.print("Enter Student ID to EXPEL: ");
        int id = scanner.nextInt();
        controller.deleteStudent(id);
    }
}