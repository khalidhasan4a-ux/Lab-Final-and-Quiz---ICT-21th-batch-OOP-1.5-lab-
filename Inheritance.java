class Employee {
    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double calculateSalary() {
        return 50000;
    }
}

class PartTimeEmployee extends Employee {
    double calculateSalary() {
        return 20000;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}
