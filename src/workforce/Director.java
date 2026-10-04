package workforce;

import java.util.Arrays;

public class Director extends Employee {
    private Employee[] employees;

    public Director(String firstName, String lastName, double salaryCoefficient, int experience) {
        super(firstName, lastName, salaryCoefficient, experience);
        setPosition();
    }

    @Override
    public void setPosition() {
        this.position = Position.DIRECTOR;
    }

    public void addWorker(Employee employee) {
        if (employees == null) {
            employees = new Employee[1];
            employees[0] = employee;
        } else {
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
        }
    }

    @Override
    public double calculateSalary() {
        double baseSalary = super.calculateSalary();
        if (employees == null) {
            return baseSalary;
        }
        return baseSalary + (employees.length * 100);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Директор: ").append(getFullName())
                .append(" | Должность: ").append(position)
                .append(" | З/п: ").append(String.format("%.2f", calculateSalary()))
                .append(" | Стаж: ").append(experience)
                .append("\n  Подчиненные:\n");

        if (employees == null || employees.length == 0) {
            sb.append("    Нет подчиненных\n");
        } else {
            for (Employee emp : employees) {
                sb.append("    - ").append(emp.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}




