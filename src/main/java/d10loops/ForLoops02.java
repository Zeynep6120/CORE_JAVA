package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {
        /*
        Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tüm karakter'leri console'a yazdıriniz
        ==>"Tramvay"==>"Tr"
         */

        /*
        Example 1: Write all characters before the first letter 'a' in a given String to the console
        */
        //charAt() methoduna index verince size karakteri getirir.
        //break keyword'u bir döngüyü veya bir switch ifadesini erken bir şekilde sonlandırmak için kullanılır
        //yani break döngüyü kırar ve sonlandırır
        //Java ya ait kelimelere keyword denir.
        String s = "Tramvay";

        for (int i = 0; i < s.length(); i++) {//i<=s.length()-1

            char ch = s.charAt(i);

            if (ch == 'a') {
                break;
            }
            System.out.print(ch);//Tr
        }
        System.out.println("-----------------------------");
        //not: java sürekli charAt methodunda string classa  gidip yoruldupu için bu methodu bir değişkene atamak java yı hızlandırır
        //şu şekilde sembolize edilebilir alican her seferinde bakkala gidip bir ekmek alıyor ama bunu bir taşıyıcıya yükleyip
        //bir seferde beş tane ekmek alması daha kolay bu yüzden string class ı bir değişkene atadık.ve performans açısından
        //bu daha verimlidir. Hemde kodun okunurluğu artar.

        //-------------------------------------------------

        System.out.println();
        //--------------------
        //Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz.
        //"Pwd12?Ab" ==> P12?A

        //Example 2: Write the code that does not print lowercase letters in a given String to the console
        //ASKII TABLE da a=97 ve z=122 dir (97-122 arası küçük harf aralığıdır.)
        //char in sayısal özelliğide var olduğunu ASKII TABLE gösterir.


        //continue ==> geri kalan kodları yürütme ve artırma azaltma ya git demek oluyor
        //alttaki koda ya da başka koda bakam direkt i++ ya git demek oluyor.

        String s1 = "Pwd12?Ab";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i); // bu classı bir değiskene atadık çünkü java sürekli string classa gidip yorulmasın diye

            if (ch >= 'a' && ch <= 'z') {
                continue;
            } else {
                System.out.print(ch);//P12?A
            }
            //bir class ta iki den ch değişkeni oluşturabilmemin nedeni scope dan kaynaklı yukardaki for döngüsü için ayrı
            //bu for döngüsü için ayrı düşünüyoruz.yani for döngüsünü içinde oluşturduğum için sıkıntı çıkmadı
            // ama eğer dışında oluşturmaya kalksam olmaz hata verir di.

        }


        //------------------------------------İNTERVİEW    - iş görüşmesi sorusu


        //   Ornek 3: Verilen bir stringi tersten yazan bir kodu yaziniz.
        //Example 3: Write the code that reverses a given string

        //           String t = "Ali Can";  ==> “naC ilA”
        //Loop olustururken baslangic ve bitis degeri cok onemlidir

        //son index her zaman length()-1’tir
        // ters çevirmelerde son index ten başlanır kod yazmaya.
        System.out.println("-------------");
        String t = "Ali Can";

        String reverse = ""; // memory de alan açtım. ters çevirince bunun içinde saklıyacağım.

        for (int i = t.length() - 1; i >= 0; i--) {
            reverse = reverse + t.charAt(i);

        }
        System.out.println(reverse);//naC ilA

    }
}
