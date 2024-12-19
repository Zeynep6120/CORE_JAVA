package d11loops;

public class ForLoops01 {
    public static void main(String[] args) {

        //INTERVİEWWW   SORUSU!!!!!!!!!!!!!!!!!!!!!!!!!
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz.(interview sorusu)
        //example 1: Print the sum of the digits of a given integer to the console

        //           578 ==> 5+7+8=20 ==> Output 20 olmali
        int sum = 0;
        for (int i = 578; i > 0; i = i / 10) {//    i/=10; böylede olabilirdi
            sum = sum + i % 10;
        }
        System.out.println("sum = " + sum);


        System.out.println("--------------------------------------");
        //------------------------------------------------

        //Ornek 2: Bir String'teki tekrarsız karakterleri veren kodu yazınız.
        //Example 2: Write teh code that returns the non-repeating characters in a String.
        //Yusuf ==> Ysf

        String t = "Yusuf";
        String unique = ""; //glabol tanımladık

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i); //index verdik bize harfi verecek yani karakteri verecek.

            if (t.indexOf(ch) == t.lastIndexOf(ch)) {
                unique = unique + ch;
            }
        }
        System.out.println("Tekrarsiz: " + unique);// Terkrarsiz = Ysf

    }
}
