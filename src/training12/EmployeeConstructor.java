package training12;

public class EmployeeConstructor {



    int id;
    String name;
    double salary;

    EmployeeConstructor(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        EmployeeConstructor e1 = new EmployeeConstructor(101, "Rahul", 25000);

        e1.display();
    }
}



