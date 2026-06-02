import java.util.ArrayList;

public class StudentManagementSystem {

    private ArrayList<Student> students =
            new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully!");
    }

    // View Students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No Student Records Found!");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Search Student
    public void searchStudent(int rollNo) {

        for (Student student : students) {

            if (student.getRollNo() == rollNo) {
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    // Delete Student
    public void deleteStudent(int rollNo) {

        for (Student student : students) {

            if (student.getRollNo() == rollNo) {
                students.remove(student);
                System.out.println("Student Deleted!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    // Update Student
    public void updateStudent(
            int rollNo,
            String newName,
            String newGrade) {

        for (Student student : students) {

            if (student.getRollNo() == rollNo) {

                student.setName(newName);
                student.setGrade(newGrade);

                System.out.println("Student Updated!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }
}