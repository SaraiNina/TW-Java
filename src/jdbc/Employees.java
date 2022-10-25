package jdbc;

public class Employees {
    private Integer id;
    private String name;
    private String lastName;
    private Long age;

    public Employees(Integer id, String name){
        this.id = id;
        this.name = name;
    }
    public Employees(Integer id, String name, String lastName, Long age){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;

    }
    public Employees(){
    }
    public Integer getId(){ return id;}
    public void setId(Integer id){ this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLastName() { return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public Long getAge() { return age; }
    public void setAge(Long age) { this.age = age; }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

