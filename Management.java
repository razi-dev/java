import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public void displayInfo() {
        System.out.println("Employee Number: " + eNo + ", Name: " + eName + ", Salary: " + eSalary);
    }
}

public class Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for employee " + (i + 1) + ":");
            System.out.print("Enter Employee Number: ");
            int eNo = scanner.nextInt();
            System.out.print("Enter Employee Name: ");
            String eName = scanner.next();
            System.out.print("Enter Employee Salary: ");
            double eSalary = scanner.nextDouble();
            employees[i] = new Employee(eNo, eName, eSalary);
        }

        System.out.print("\nEnter Employee Number to search: ");
        int searchENo = scanner.nextInt();
        boolean found = false;

        for (Employee employee : employees) {
            if (employee.eNo == searchENo) {
                employee.displayInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        scanner.close();
    }
}
