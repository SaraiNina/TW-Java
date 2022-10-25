package jdbc;

import java.util.List;

public interface EmployeesDao {
    void createEmployees(Employees employees);
    Employees getEmployeesById(int EmployeesId);
    List<Employees> getAllEmployees();
    void updateEmployees(Employees employees);
    void deleteEmployees(int EmployeesId);

    List<Employees>getEmployeesWithStatement();
}
