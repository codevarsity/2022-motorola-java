

class Employee {
    static {
        System.out.println("Initializing Employee");
    }

    String name;
    String id;
    Employee() {
        System.out.println("Creating an Employee");
    }
}

public class ClassInitializer {
    public static void main(String[] args) {
        Employee emp = new Employee();
    }
}
