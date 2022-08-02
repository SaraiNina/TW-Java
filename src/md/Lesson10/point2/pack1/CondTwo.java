package md.Lesson10.point2.pack1;
//in clasa aceasta am creat o metoda publica care cheama in ea alte doua metode private declarate mai jos
public class CondTwo {
    public void metodaPrincipala(){
        System.out.println("Metoda");
        metPrivat1();
        metPrivat2();
    }
   private void metPrivat1(){
       System.out.println("priv1");
   }
   private void metPrivat2(){
       System.out.println("priv2");
   }
}
