package concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparator {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(23, "John", 50000),
                new Employee(11, "Jane", 75000),
                new Employee(43,"Mark", 45000),
                new Employee(7, "Emily", 80000),
                new Employee(15, "Rick", 80000)
        );
        //Natural sorting(criteria defined within UDT class definition) using Comparable interface.
        Collections.sort(employees);
        System.out.println("Natural ordering on Salary: ");
        employees.forEach(System.out::println);

        //Custom ordering using lambda expressions for Comparator interface.
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return (int)(emp1.getSalary() - emp2.getSalary());
            }
        };
        Collections.sort(employees, comparator);

        System.out.println("Custom ordering on Salary: ");
        employees.forEach(System.out::println);


        // Using lambda expressions (arrow operator) to sort first by id, then by salary
        employees.sort((e1, e2) -> {
            int idCompare = Integer.compare(e1.getId(), e2.getId());
            if (idCompare != 0) {
                return idCompare; // If ids are different, sort by id
            }
            // If ids are the same, sort by salary
            return Double.compare(e1.getSalary(), e2.getSalary());
        });
        System.out.println("sort first by id, then by salary: ");
        employees.forEach(System.out::println);
    }
}
