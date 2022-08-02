package md.Lesson10.bonus;
//am creat clasa ClassBonus am declarat in ea doua proprietati private si una publica
public class ClassBonus {
    private String name;
    private int val;
    public String number;
//am creat construtorul
    public ClassBonus() {
    }

    public ClassBonus(String name, int val, String number) {
        this.name = name;
        this.val = val;
        this.number = number;
    }
    //aceste metode le-am scris ca un proiect si atunci cind vom apela clasa,
    // ea va sti deja ce trebuie sa faca
//am creat o met publica cu numele  setName
// in paranteze am declarat tipul si numele  metodei
    public void setName(String name) {
        //proprietatii iam atribuit valoarea parametrului
        this.name = name;
    }
//met de tip bublic
    public void setNumber(String number) {
        this.number = number;
    }

    public void setVal(int val) {
        this.val = val;
    }
//metode de tip public ,cind chemam aceaste metode ele ne va returna valoarea proprietatilor
    public int getVal() {
        return val;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;

    }
}
