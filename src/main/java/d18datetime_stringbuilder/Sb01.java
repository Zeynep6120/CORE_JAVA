package d18datetime_stringbuilder;

public class Sb01 {
    public static void main(String[] args) {

         /*
        1) "StringBuilder" class’da String ureten bir class’tir.
        2) String class kullanarak String üretiriz, Java nicin StringBuilder’i da olusturdu?
            String class "immutable" (degistirilemez) String uretir,
            StringBuilder class "mutable"(degistirilebilir) String üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
        4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
            StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
        5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli yöntemler
        ve işlevler içerir. Bunlar arasında append(eklemek), delete, insert(eklemek,sokmak), replace gibi sık kullanılan yöntemler bulunur.
        */

        //Immutable - degistirilemez
        //Bir String variable olusturup, sonra ona baska String degerleri concatenate ettiginizde,
        // her seferinde Heap Memory’de yeni bir String objesi olusur. Orjinal deger degismez.

        String s = "Java";
        String t = s + "x";
        String w = t + "?";

        //biz yeni bir variable oluşturduğumuzda Heap de her seferinde yeni bir string objesi oluşur ve
        // orjinal değer değişmez biz o objeler üzerinde işlem yaparız. yani String class değişmez.


        String str2 = "abc"; // bu çok kullanılır
        // ve bu şekilde yazarsan yazdığın  direkt String Poola eklenir.
        //ve seni oluşturdun değer sTring havuzunda varsa java yeni bir nesne oluşturmaz.mevcut objeyi yeniden kullanır
        //bu da bellek kullanımını optimize eder. ve performansı artırır
        //mesela evde su ısıtcısı var yenisi alma evdekini kullan mantığu
        String str3 = new String("abc");
        //Normalde String objesi böyle üretilir ama çok kullanıldığı
        //için java yazımı kısaltmış ve obje oluştururken yukardaki ifadeyi kullanmış. ama ikisi farklı şey ifade eder
        // aynı değildir yani
        //new ile oluşturlanda is  Heap de Her zaman yeni bir obje oluşur. çünkü new keyword 'ünü kullandık
        //new ile oluşunda String havuzunda abc varsa bile String havuzuna bakmaz her zaman yeni bir obje oluşturur.
        // equals() methodu verini içine bakar reference ye yani adrese bakmaz.
        // "==" ise verinin adresine bakar eğer adresler aynı ise true döndürür
        //new keywordunü kullandığımız stringlerde equals() methodunu kullanallım çünkü her halükarda doğru sonuç verir

        //---------------------------------------------------------------------------------------
        //"Ali" default olarak String kabul edilir ve dogrudan baska bir ture yuklenemez

        //StringBuilder sb1 = "Ali"; HATALı kod
        //append() metodu, StringBuilder nesnesine yeni bir String eklemek için kullanılır.

        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python

        sb1.append("!");
        System.out.println(sb1); //Python! //veri doğrudan sona eklenir.

        //----------------------------------------------------------------
        //Peki, bir String'i degistirdikten sonra tekrar ayni String'e yuklersem orjinal deger degismez mi?

        String a = "money";
        System.out.println(a); //money
        a = a + " more";
        System.out.println(a); //money more

        /*1-String’i degistirdikten sonra ayni String’e assign ederseniz Java yine yeni bir container olusturur.
        2-Degismis degeri bu yeni container’in icine koyar ve eski container’i gosteren
        pointer yeni container’a yonlendirilir
        3-Dolayisiyla eski container adressiz kalir ve "Garbage Collector-cop toplayici"
        adressiz olan container’lari siler. GC bellek sızıntılarını önler.
        GC, Java'nın birçok uygulama için güvenli ve verimli bir dil olmasını sağlayan önemli bir özelliktir.
        Veri memory’de sahipsiz ve guvenliksiz bir sekilde beklemez.
        4-GC'nin çalışma zamanlaması tamamen JVM (Java Virtual Machine) tarafından kontrol edilir
        ve uygulamadan bağımsızdır*/


    }
}