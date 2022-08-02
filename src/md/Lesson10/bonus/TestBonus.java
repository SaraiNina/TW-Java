package md.Lesson10.bonus;

public class TestBonus {
    public static void main (String[] args){
        //am creat referinta la obiectul ClassBonus
        ClassBonus myClassBonus = new ClassBonus();
        //la referinta apelez metoda si ii atribium valoarea proprietatii
        myClassBonus.number = "123";
        myClassBonus.setName("Nadin");
        myClassBonus.setVal(10);

        //obiect 1 setat prin seteri
        System.out.println("Valoarea lui Val = " + myClassBonus.getVal());
        System.out.println("Valoarea lui Name = " + myClassBonus.getName());
        System.out.println("Valoarea lui Number = "+ myClassBonus.getNumber());

        //obiect 2 setat prin constructor
        //am creat obiectul2
        ClassBonus myClassBonus2 = new ClassBonus("Tuluz", 2, "2019");
        System.out.println("Valoarea lui Val = " + myClassBonus2.getVal());
        System.out.println("Valoarea lui Name = " + myClassBonus2.getName());
        System.out.println("Valoarea lui Number = "+ myClassBonus2.getNumber());
    }

}
