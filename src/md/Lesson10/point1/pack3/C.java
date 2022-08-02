package md.Lesson10.point1.pack3;
//clasa publica
public class C {
//metoda publica void, num. metodei
    public void pubMetC(){
        //Afiseaza la ecran mesajul
        System.out.println("Public Method C");
        //Am chemat met default in met publica
        defMetC();
        //Am chemat met default in met publica
        prMetC();
    }//met default void, num. metodei
    void defMetC(){
        System.out.println("Default Method C");
    }
    //met privata void, num.metodei
    private void prMetC(){
        System.out.println("Private Method C");

    }

    }

