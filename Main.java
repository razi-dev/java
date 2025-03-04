import java.util.Scanner;
class Student { 
    String name;
    int rollNo;
    String section; 

    Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }
    
    public void printDetails() {
        System.out.print("Student Details: ");
        System.out.println(this.name + ", " + this.rollNo + ", " + section);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter section for student " + (i + 1) + ": ");
            String section = scanner.nextLine();

            students[i] = new Student(name, rollNo, section);
        }

        for (Student student : students) {
            student.printDetails();
        }

        scanner.close(); 
    }
}
