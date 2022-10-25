package java8;
import java.util.Objects;

public class Employee {
    private int age;
    private String name;

    public Employee(String age, String name) {
        this.age = age();
        this.name = name;

    }

    private int age() {
        return 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String new_name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name,employee.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Employee}" + " age=" + age + ",name=`" + name + '\'' + '}';
    }

    public String getLastName() {
    String getName;
        return null;
    }

    public boolean get() {
        return false;
    }




    }


