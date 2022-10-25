package exception;

public class TestException {
    public static void main(String[] args){
        CustomClass customClass= new CustomClass();
try{
        customClass.m(4);

}catch (EmployeeException employeeException) {
    employeeException.printStackTrace();

}catch(DepartmentException departmentException){
    departmentException.printStackTrace();

}finally {
    System.out.println("Finally");
}
            System.out.println("Mai departe");
        }
}
