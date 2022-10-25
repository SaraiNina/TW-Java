package generics;

public class EmployeeGenericClass <T1, T2 extends Comparable> {
    private T1 proprietyName;
    private T2 proprietyAge;

    int to() {
        return proprietyAge.compareTo(proprietyName);
    }

    public EmployeeGenericClass(String string, int i){
        this.proprietyName = (T1) "Name";
        this.proprietyAge = null;

    }
    public T1 getProprietyName(){return proprietyName;}

    public void setProprietyName(T1 proprietyName) {this.proprietyName = proprietyName;}

    public T2 getProprietyLastName(){ return proprietyAge ;}

    public void setProprietyLastName(T2 proprietyLastName) {this.proprietyAge = proprietyLastName;}
}

