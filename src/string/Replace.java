package string;
public class Replace{
    public static String repTest(String s) {
    String myString= "";
    char c[]=s.toCharArray();
    for (int i=c.length-1; i>=0; i-- ){
        myString+=c[i];

    }
    return myString;
    }
    public static void main(String[] args)
    {
        System.out.println(repTest("Hello"));

 //   public static void main(String args[]){

//        String s1="h";
  //      String replaceString1=s1.replace('h','o');
    //    String s2="e";
        //  String replaceString2=s2.replace('e','l');
      //  String s3="l";
       // String replaceString3=s3.replace('l','l');
       // String s4="l";
       // String replaceString4=s4.replace('l','e');
      //  String s5="o";
       // String replaceString5=s5.replace('o','h');

       // System.out.println(replaceString1);
       // System.out.println(replaceString2);
      //  System.out.println(replaceString3);
      //  System.out.println(replaceString4);
        // System.out.println(replaceString5);

    }
}
