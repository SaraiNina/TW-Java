package md.Lesson10.point1.pack1;

public class A {
//met nu ret nimic niv de acces default
    void defaultMethod() {
        //Afiseaza pe ecran mesajul.
        System.out.println("My Class A - Default method");
        //Cheama metoda privata
        privateMethod();
    }
// met publica,num metodei
    public void publicMethod() {
        //Afiseaza pe ecran mesajul.
        System.out.println("My Class A - Public method");
        //Am chemat metoda privata
        privateMethod();
    }
// met privata care poate fi accesata doar in aceasta clasa
    private void privateMethod() {
        System.out.println("My Class A - Private method");
    }

}

