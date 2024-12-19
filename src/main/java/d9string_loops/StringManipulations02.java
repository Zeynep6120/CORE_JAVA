package d9string_loops;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Ornek 1: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        // yusuf ==> ysf

        //Example 1: Print the non-repeated characters in a String side by side on the screen.

        //indexOf("u")      ==> 1  farkli tekrarli //indexof soldan sağa bakar indexe
        //lastIndexOf("u")  ==> 3 //lastindexof sağdan sola bakr indexe

        //indexOf("y")      ==> 0 ayni tekrarsiz
        //lastIndexOf("y")  ==> 0
        //indexOf ve lasIndexOf aynı ise bu o karakterin tekrarsız olduğu anlamına gelir.
        String s = "yusuf";
        if (s.indexOf("y") == s.lastIndexOf("y")) {
            System.out.print("y");
        }
        if (s.indexOf("u") == s.lastIndexOf("u")) {
            System.out.print("u");
        }
        if (s.indexOf("s") == s.lastIndexOf("s")) {
            System.out.print("s");
        }
        if (s.indexOf("f") == s.lastIndexOf("f")) {
            System.out.print("f");
        }
        System.out.println();//burda boş sout kullandık çünkü ysf den sonra alt satıra geçmesini istiyoruz
        //------------------------------------------------

        //Ornek 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

        //Example 2: Make all but the last 4 digits of a bank card invisible using '*'


        String carNum = "1234 6789 1234 6789";
        String first = carNum.substring(0, 15).replaceAll("[0-9]", "*");
        //0-9 seçtik çünkü boşluklarda bir karakter ve ben onların yerine yıldız koymak istemiyorum
        System.out.println(first);
        String last = carNum.substring(15);//6789
        //substirng tek index ile de çalışır bu 15 den başla gerisini al demek
        // bu (15, 19) da olabilir di aynı şeyi ifade ediyor iki si de         

        String result1 = first + last;
        System.out.println("result1 = " + result1);//**** **** **** 6789
        
        String result2= first.concat(last);
        System.out.println("result2 = " + result2);//**** **** **** 6789
                //concat metodu önü yazdığımız ile içine yazdığımızı sanki arada + sembolu varmis gibi
            //birbirine yapıştırır.
        

    }
}
