package generics;

public class EmployeeGenericClassTest {

    public static void main(String[] args) {

        EmployeeGenericClass<String, Integer> employeeGenericClass = new EmployeeGenericClass<>("Ana", 10);
        System.out.println(employeeGenericClass);
    }

}
