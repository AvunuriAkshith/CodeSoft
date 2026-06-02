import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManagementSystem sms =
                new StudentManagementSystem();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    sms.addStudent(
                            new Student(
                                    rollNo,
                                    name,
                                    grade));

                    break;

                case 2:
                    sms.displayStudents();
                    break;

                case 3:

                    System.out.print("Enter Roll No: ");
                    int searchRoll = sc.nextInt();

                    sms.searchStudent(searchRoll);

                    break;

                case 4:

                    System.out.print("Enter Roll No: ");
                    int updateRoll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("New Grade: ");
                    String newGrade = sc.nextLine();

                    sms.updateStudent(
                            updateRoll,
                            newName,
                            newGrade);

                    break;

                case 5:

                    System.out.print("Enter Roll No: ");
                    int deleteRoll = sc.nextInt();

                    sms.deleteStudent(deleteRoll);

                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}