package md.pack1;

public class ConstructA {
        String name;
        int id=10;
        int age;

        //one class with three overloaded constructors, use this to passed parameters
    //to class proprietes

        public ConstructA(int id1, String nameA){
            this.id=id1;
            this.name=nameA;
        }
    ConstructA(int i){
            this.id=i;
            id=i;
        }
        public ConstructA(int a, int b, String c){
            this.age=a;
            id=b;
            name=c;

        }
    }
}
