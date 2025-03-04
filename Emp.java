import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    
    public void printDetails() {
        System.out.println("Employee Number: " + eNo + ", Name: " + eName + ", Salary: " + eSalary);
    }
}

class Emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

       
        Employee[] employees = new Employee[n];

       
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Enter employee number (eNo): ");
            int eNo = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Enter employee name (eName): ");
            String eName = scanner.nextLine();
            
            System.out.print("Enter employee salary (eSalary): ");
            double eSalary = scanner.nextDouble();
            scanner.nextLine(); 
            
            employees[i] = new Employee(eNo, eName, eSalary);
        }

       
        System.out.print("Enter employee number (eNo) to search: ");
        int searchENo = scanner.nextInt();
        boolean found = false;

        for (Employee employee : employees) {
            if (employee.eNo == searchENo) {
                employee.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with eNo " + searchENo + " not found.");
        }

        scanner.close();
    }
}

