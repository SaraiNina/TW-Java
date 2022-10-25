package jdbc;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        JdbcConnection.createConnection();
        EmployeesDao employeesDao =new EmployeesDaoImpl();
        Employees employeesById = employeesDao.getEmployeesById(123);
        System.out.println(employeesById);


    }
}
