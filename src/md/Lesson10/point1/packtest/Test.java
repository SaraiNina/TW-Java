package md.Lesson10.point1.packtest;
//am facut imoport in clasa Test la pack1 toate clasele, pack2 cl. B, pack3 cl. C
import md.Lesson10.point1.pack1.A;
import proiect.Lesson10.point1.pack1.*;
import md.Lesson10.point1.pack2.B;
import md.Lesson10.point1.pack3.C;

//clasa publica Test
public class Test {
//met publica scrisa pentru a face run
    public static void main(String[] args) {
        //declaraera unei referinte noi pentru obiectul A
        A myClassA = new A();
        //Chem metoda publica din clasa A prin referinta myClassA
        myClassA.publicMethod();

        //object B
        //declaraera unei referinte noi pentru obiectul B
        B myb= new B();
        //Chem metoda publica din clasa B prin referinta myb
        myb.pubMetB();

        //object C
        //declaraera unei referinte noi pentru obiectul C
        C myClassC = new C();
        //Chem metoda publica din clasa C prin referinta myClassC
        myClassC.pubMetC();




    }

}