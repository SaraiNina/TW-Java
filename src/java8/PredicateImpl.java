package java8;


import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Employee> {

    @Override
    public boolean test(Employee employee) {
        return  employee.getName().equals("Vasile");

    }
}
