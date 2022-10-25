package java8;

import java.util.Optional;

public class MyOptionalTwo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("10", "Ion");
        Employee employee2 = new Employee("15", "Vasile");
        Employee employee3 = new Employee("20", "Matei");
        Employee employee4 = new Employee("33", "Alex");
        Employee employee5 = new Employee("34", "Virgil");
        Employee employee6 = new Employee("34", "Virgil");

        Optional<Employee> possibleEmployee = Optional.ofNullable(employee6);
  //      if(possibleEmployee.isPresent()){
//           System.out.println(possibleEmployee.get().getName());

        //     }
        //     System.out.println(possibleEmployee.orElse(new Employee("11", "Ion")));
        //      possibleEmployee.map(employee -> employee.getName()).ifPresent(emp -> System.out.println());
             Employee employee = possibleEmployee.orElseThrow(()-> new RuntimeException("Obiectul nu poate fi null"));
        //    System.out.println(employee);

        possibleEmployee.orElseGet(()->new Employee("","Ion"));
        System.out.println(employee);
    }


}
