import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Question 5: Given a list of employee objects:

class Employee {
    private String name;
    private String department;

    public Employee() {
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "'}";
    }
}

public class QuesE {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Harsh", "IT"),
                new Employee("Amit", "HR"),
                new Employee("Sneha", "IT"));

        // 1. using filter() to get only IT department employees - used to filter
        // employees by department
        List<Employee> itEmployees = employees.stream().filter(e -> "IT".equals(e.getDepartment())).toList();
        System.out.println("IT Department Employees: " + itEmployees);

        // 2. using map() to get names of all employees in uppercase - used to transform
        // employee names to uppercase
        List<String> upperCaseNames = employees.stream().map(e -> e.getName().toUpperCase()).toList();
        System.out.println("Upper Case Names: " + upperCaseNames);

        // 3. using collect(.groupingBy()) to group employees by department - used to
        // group employees by department
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employees by Department: " + employeesByDept);
    }
}
