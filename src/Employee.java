import java.util.Objects;
    public class Employee {
        private static int counter = 0;
        private final String name;
        public int id;
        private int department;
        private int salary;

        public Employee(String name, int salary, int department) {
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.id = counter++;
        }

        public static int getCounter() {
            return counter;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public int getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }

        public void setDepartment(int department) {
            this.department = department;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id && department == employee.department && salary == employee.salary && name.equals(employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id, department, salary);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "ФИО-'" + name + '\'' +
                    ", id=" + id +
                    ", отдел-" + department +
                    ", зарплата-" + salary +
                    '}';
        }
    }
