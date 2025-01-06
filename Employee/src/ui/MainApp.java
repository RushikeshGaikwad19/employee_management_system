package ui;

import model.Employee;
import service.EmployeeService;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    private static EmployeeService employeeService = new EmployeeService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. View Employee by ID"); 
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                 
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();  
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    Employee newEmployee = new Employee(0, name, department, salary, phone, email);
                    employeeService.addEmployee(newEmployee);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                   
                    List<Employee> employees = employeeService.getAllEmployees();
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;

                case 3:
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    Employee employee = employeeService.getEmployeeById(id);
                    if (employee != null) {
                        System.out.println(employee);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                  
                    System.out.print("Enter employee ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  
                    Employee employeeToUpdate = employeeService.getEmployeeById(updateId);
                    if (employeeToUpdate != null) {
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new department: ");
                        String newDepartment = scanner.nextLine();
                        System.out.print("Enter new salary: ");
                        double newSalary = scanner.nextDouble();
                        scanner.nextLine();  
                        System.out.print("Enter new phone: ");
                        String newPhone = scanner.nextLine();
                        System.out.print("Enter new email: ");
                        String newEmail = scanner.nextLine();

                        employeeToUpdate.setName(newName);
                        employeeToUpdate.setDepartment(newDepartment);
                        employeeToUpdate.setSalary(newSalary);
                        employeeToUpdate.setPhone(newPhone);
                        employeeToUpdate.setEmail(newEmail);
                        employeeService.updateEmployee(employeeToUpdate);
                        System.out.println("Employee updated successfully!");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                  
                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    employeeService.deleteEmployee(deleteId);
                    System.out.println("Employee deleted successfully!");
                    break;

                case 6:
                  
                    running = false;
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
