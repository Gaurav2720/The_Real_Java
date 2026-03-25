package lab1;
/*9.1. A company wants to develop a Java application to calculate salaries of different types of
employees.
The company has:
• Full-Time Employees
• Part-Time Employees
All employees share common attributes such as:
• Employee ID
• Employee Name
However, salary calculation differs:
• Full-Time Employee
o Fixed monthly salary
o Additional bonus
• Part-Time Employee
o Hourly wage
o Number of hours worked
Requirements:
1. Create a base class Employee containing:
o Common data members
o A method calculateSalary()
2. Create two derived classes:
o FullTimeEmployee
o PartTimeEmployee
3. Override the calculateSalary() method in both derived classes.
4. In the main() method:
o Create objects of derived classes using a base class reference.
o Demonstrate runtime polymorphism.
o Display salary details for each employee*/class Employee {
    int empId;
    String empName;

    Employee(int id, String name) {
        this.empId = id;
        this.empName = name;
    }

    double calculateSalary() {
        return 0;
    }

    void display() {
        System.out.println("ID: " + empId + " | Name: " + empName);
        System.out.println("Total Salary: Rs." + calculateSalary());
        
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    double bonus;

    FullTimeEmployee(int id, String name, double salary, double bonus) {
        super(id, name);
        this.monthlySalary = salary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return monthlySalary + bonus;
    }

    void display() {
        System.out.println("[ Full-Time Employee ]");
        System.out.println("ID: " + empId + " | Name: " + empName);
        System.out.println("Monthly Salary: Rs." + monthlySalary + " | Bonus: Rs." + bonus);
        System.out.println("Total Salary: Rs." + calculateSalary());
        System.out.println("----------------------------");
    }
}

class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorked;

    PartTimeEmployee(int id, String name, double wage, int hours) {
        super(id, name);
        this.hourlyWage = wage;
        this.hoursWorked = hours;
    }

    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    void display() {
        System.out.println("[ Part-Time Employee ]");
        System.out.println("ID: " + empId + " | Name: " + empName);
        System.out.println("Hourly Wage: Rs." + hourlyWage + " | Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: Rs." + calculateSalary());
        System.out.println("////");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Rahul Sharma", 50000, 8000);
        Employee e2 = new PartTimeEmployee(102, "Priya Mehta", 300, 80);
        Employee e3 = new FullTimeEmployee(103, "Amit Verma", 45000, 5000);
        Employee e4 = new PartTimeEmployee(104, "Sneha Kapoor", 250, 60);

        Employee[] employees = {e1, e2, e3, e4};

        System.out.println("Company Salary Details:\n");

        for (int i = 0; i < employees.length; i++) {
        if (employees[i] instanceof FullTimeEmployee) {
            ((FullTimeEmployee) employees[i]).display();
        } else {
            ((PartTimeEmployee) employees[i]).display();
        }
      }
    }
}
