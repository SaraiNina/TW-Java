package md.pack1;

public class Dog {
    String name;
    int id=10;
    int age;
//three methods overloaded
    public Dog(int id1, String nameA){
        id=id1;
        name=nameA;
    }
    Dog(int i){
        id=i;
    }
    public Dog(int a, int b, String c){
        age=a;
        id=b;
        name=c;

    }
}

