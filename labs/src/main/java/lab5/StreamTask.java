package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamTask {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Lola", "LolaKM@gmail.com", 30000));
        employees.add(new Employee("Sanya", "Sanya@gmail.com", 100));
        employees.add(new Employee("Roman", "RomanL@gmail.com", 3000));
        employees.add(new Employee("Maks", "maksD@gmail.com", 2500));
        employees.add(new Employee("Nazar", "Nazarko13@gmail.com", 300));
        employees.add(new Employee("Vitua", "Vitua@gmail.com", 5000));

        System.out.println(sortEmployeesBySalary(employees));
        System.out.println(filterEmployeesBySalary(employees, 2500));
        System.out.println(employeesToNameList(employees));
    }

    public static List<Employee> sortEmployeesBySalary(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return new ArrayList<>();
        }
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
    }

    public static List<Employee> filterEmployeesBySalary(List<Employee> employees, Integer fromSalary) {
        if (employees == null || employees.isEmpty()) {
            return new ArrayList<>();
        }
        return employees.stream()
                .filter(employee -> employee.getSalary() >= fromSalary)
                .collect(Collectors.toList());
    }
    public static List<String> employeesToNameList(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return new ArrayList<>();
        }
        return employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
    }
}
