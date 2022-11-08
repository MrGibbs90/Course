public class Main {
    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Марк Руффало", 2_500_000, 1),
                new Employee("Джереми Реннер", 11_000_000, 1),
                new Employee("Пол Радд", 1_500_000, 2),
                new Employee("Бри Ларсон", 2_000_000, 3),
                new Employee("Энтони Маки", 4_000_000, 1),
                new Employee("Эванджелин Лилли", 2_000_000, 2),
                new Employee("Элизабет Олсен", 6_000_000, 2),
                new Employee("Себастиан Стэн", 4_000_000, 2),
                new Employee("Том Холланд", 3_000_000, 3),
        };
        employees[0] = new Employee("Марк Руффало", 2_500_000, 1);
        printFullNames();
        printEmployees();
        System.out.println("avg = " + calculateAverageSalary());
        System.out.println("max = " + findEmployeeWithMaxSalary());
        System.out.println("min = " + findEmployeeWithMinSalary());
        System.out.println("----high---");
    }
    private static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}