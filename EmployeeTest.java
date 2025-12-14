class Employee {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 108;
        emp1.name = "Akshay";
        emp1.salary =93000;

        emp1.display();
    }
}

