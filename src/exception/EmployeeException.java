package exception;

public class EmployeeException extends RuntimeException{
    public EmployeeException(String message){
        super(message);

    }
    public EmployeeException() {
        super();
    }
}
