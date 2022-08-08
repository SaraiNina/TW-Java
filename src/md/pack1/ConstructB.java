package md.pack1;

public class ConstructB{
    String name;
    int id=10;
    int age;
    float food;

    //one class with three overloaded constructors, use "this()" to passed parameters
    //to class proprietes


    ConstructB(){
        System.out.println("ConstructB()");
    }
        ConstructB(float food1){
         this();
         this.food=food1;

    }
    ConstructB(float food1, String name1){
        this(food1);
        this.name=name1;
        this.food=food1;

    }

    public ConstructB(int id, int age, String name, float food){

    }
    public static void main(String[] args){
        ConstructB consB=new ConstructB(20F, "Tom");
        System.out.println(consB.food + consB.name);
}

}
