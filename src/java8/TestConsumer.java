package java8;

import java.util.ArrayList;
import java.util.List;



public class TestConsumer {
    public static void main(String[] args) {

        Employee employee1 = new Employee("10", "Ion");
        Employee employee2 = new Employee("15", "Vasile");
        Employee employee3 = new Employee("20", "Matei");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

employeeList.stream()
        .filter(el-> el.getLastName().equals("Vasile"))
        .peek((Employee em)->{
em.setName("New Name");
}).map(el-> el.getLastName() + el.getName())
        .forEach(el-> System.out.println(el));


        }

    }


