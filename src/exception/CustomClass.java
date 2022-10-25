package exception;

public class CustomClass {
    //  void m(Integer number){
    //      System.out.println("Init");
    //     if(number<10) {
    //        throw new RuntimeException("Numarul transmis este mai mic ca 10");
    //    }
    //    System.out.println("Destroy");
    //    }
    void m(Integer number) {
        if (number < 5) {
            throw new EmployeeException();
        }

            }
        }








