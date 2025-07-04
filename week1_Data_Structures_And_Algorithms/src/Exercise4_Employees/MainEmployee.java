package Exercise4_Employees;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(101, "Alice", "Manager", 80000);
        employees[1] = new Employee(102, "Bob", "Developer", 60000);
        employees[2] = new Employee(103, "Charlie", "Tester", 50000);

        System.out.println("All employees:");
        for (Employee e : employees) {
            if (e != null) System.out.println(e);
        }

        System.out.println("\nSearch for Bob:");
        for (Employee e : employees) {
            if (e != null && e.toString().contains("Bob")) {
                System.out.println(e);
            }
        }
    }
}
