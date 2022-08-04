package pack1;

public class Person {
    private long id;
    private String firstName;
    private String lastName;

    public static int c;
    public Person(){
        c++;
        id = c;
    }

    public void setId(long sid) {
        id = sid;
    }
    public long getId(){
        return id;

    }
}
