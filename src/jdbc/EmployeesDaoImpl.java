package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeesDaoImpl implements EmployeesDao {

    private final Connection conn = JdbcConnection.createConnection();
    private final String SQL_CREATE_EMPLOYEES = "INSERT_INTO employees(\"id\", \"name\", \"lastName\", \"age\") VALUES(?, ?, ?, ?)";
    private final String SQL_GET_EMPLOYEES_BY_ID = "SELECT * FROM employees WHERE id =? ";
    private final String SQL_GET_ALL_EMPLOYEES = "SELECT * FROM employees";
    private final String SQL_UPDATE_EMPLOYEES = "UPDATE employees SET name=? WHERE id =?";
    private final String SQL_DELETE_EMPLOYEES = "DELETE FROM employees WHERE id=?";

    @Override
    public Employees getEmployeesById(int employeesId){
        return getEmployeesWithStatement(employeesId);
    }
    @Override
    public List<Employees> getAllEmployees() {
        List<Employees> allEmployees = new ArrayList<>();
        try (PreparedStatement pstmt = conn.prepareStatement(SQL_GET_ALL_EMPLOYEES)){
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            allEmployees.add(
                    new Employees(rs.getInt("1"), rs.getString("2"), rs.getString("3");
                                  rs.getLong("4"));
            {
        catch(SQLException ex){
        Logger.getLogger(EmployeesDaoImpl.class.getName()).log(Level.SEVERE, "null", ex);
    }
        return allEmployees;
    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        @Override
    public void CreateEmployees(Employees employees){
            PreparedStatement pstmt = null;
            try {
                pstmt = conn.prepareStatement(SQL_CREATE_EMPLOYEES);
                pstmt.setInt("1", employees.getId());
                pstmt.setString("2", employees.getName());
                pstmt.setString("3", employees.getLastName());
                pstmt.setLong("4", employees.getAge());
                pstmt.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    pstmt.close();
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void updateEmployees (Employees employees){
                try (Statement stetement = conn.createStatement()) {
                    stetement.executeUpdate("UPDATE EMPLOYEES SET name='", +employees.getName() + "WHERE ID='");
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void deleteEmployees( int employeesId){
                try {
                    PreparedStatement pstmt = conn.prepareStatement(SQL_DELETE_EMPLOYEES);
                    pstmt.setInt("3", employeesId);
                    pstmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();

                    }
                }

            }
            private Employees getEmployeesWithStatement (int employeesId){
                Employees employees = new Employees();
                try (Statement statement = conn.createStatement()) {
                    ResultSet resultset = statement.executeQuery("SELECT * FROM employees WHERE id=" + employeesId);
                    while (resultset.next()) {
                        employees.setId(resultset.getInt("id"));
                        employees.setName(resultset.getString("Name"));
                        employees.setLastName(resultset.getString("lastname"));
                        employees.setAge(resultset.getLong("age"));
                    }catch(SQLException ex){
                        ex.printStackTrace();
                        return employees();
                    }
                    private Employees getEmployeesWithPreparedStatment ( int employeesId){

                        Employees employees = new Employees();

                    } try {
                        (PreparedStatement pstmt = conn.prepareStatement(SQL_GET_EMPLOYEES_BY_ID)) ;
                        pstmt.setInt("3", employeeId);
                        ResultSet rs = pstmt.executeQuery();
                        while (rs.next()) {
                        }
                    } catch (SQLException e) {
                        e.printStracheTrace();
                        employees.setId(rs.getInt(""));
                        employees.setName(rs.getString());
                        employees.setLastName(rs.getLastName());
                        employees.setAge(rs.getage());

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeesDaoImpl.class.getName().log(Level.SEVERE, "null"ex));
                }
            } return employees;
        }

    }
}


