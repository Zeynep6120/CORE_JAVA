package d26maps_exceptions;

import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Tom", 33);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);

        stdAges.put("Tom", 35);//{Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}
        //key methodunu tekrarlı yazdığında üstüne yazar ama bu best practise değil
        System.out.println(stdAges);

        //terkrarlı yazmak yerine biz replace methodunu kullanırız.bu best practice
        //-----------------------------------------------------------------------
        //1) replace() methodu, value’lari key’leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdAges.replace("Tom", 39);//{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}
        System.out.println(stdAges);

        //-----------------------------------------------------------------------
        //2) replace() methodu, eski deger kontrolu yaparakta calisir
        stdAges.replace("Tom", 21, 45);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}
        //Tom a git eski değer 21 ise onu 45 yap .eski değer 21 olmadığı için Tom 39 olarak kalır.

        stdAges.replace("Tom", 39, 45);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}
        //Tom a git eski değer 39 ise onu 45 yap demek
        //değisiklik oldu çünkü eski değer 39

        //------------------------------------------------------------------------
        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map'te yoksa Map'e ekler.
        // Key Map'te zaten varsa, metodun hiçbir etkisi olmaz.

        stdAges.putIfAbsent("Tom", 77);//{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}
        System.out.println(stdAges);
        //Key olan Tom map te olduğu için herhangi bir ekleme yapmadı.

        stdAges.putIfAbsent("Ayşe", 23);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Ayşe=23, Tom=45, Veli=63, Ali=18}
        //Ayşe Key  olmadığı için Ayşeyi map a ekler
        //Ayse key'i map'te olmadigi icin "Ayse", 23 eklendi

        //--------------------------------------------------------------
        //4- get() ve getOrDefault() method'lari eger aranan eleman map'te var ise, ikisi de ayni isi yapar
        //key verirsiniz, size value verir. Ancak getOrDefault() metodu, anahtar bulunamadığında
        // bir varsayılan değer sağlama avantajına sahiptir.

        System.out.println(stdAges.get("Tom"));//45
        System.out.println(stdAges.getOrDefault("Tom", 18));//45 //Tom map'te var.Tom un orjinal değerini verdi
        //Tom key'i map te varsa ojinal değeri getirir eğer yoksa defaultValue olan 18 i döndürür

        System.out.println(stdAges.get("Jerry"));//null
        //ben key olarak jerry verdim gitti baktı jerry yok null verdi.
        System.out.println(stdAges.getOrDefault("Jerry", 18));//18
        //gitti baktı key olarak jerry yokk jerrye default olarak benim verdiğim 18 i verdi.


        //------------------
        //5)containsKey() metodu, Map'te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map'te bir value olup olmadığını kontrol eder.
        //Boolean return ederler


        //{Can=19, Ahmet=41, Tom=45, Veli=63, Ayse=23, Ali=18}

        boolean b = stdAges.containsValue(19);
        System.out.println(b);//true

        System.out.println(stdAges.containsKey("TOM"));//false //çünkü büyük küçük harf duyarlı bir method kullandım
        System.out.println(stdAges.containsKey("Tom"));//true


        //----------------------------Buyuk kucuk harfe duyarsiz yapma
        Map<String, Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Tom".toLowerCase(), 25);//tom string olduğu için String class methodları çalışır

        System.out.println(stdAges2);//{tom=25}

        boolean b1 = stdAges2.containsKey("TOM".toLowerCase());
        System.out.println(b1);//true
        //stdAges2 nin içine bak tom var mı.tom u giriş anın da ve arma anında toLowerCase methodu ekledim.ikiside
        //girilende arananda küçüldü o yüzden true döndü.

        //-----------------------------
        String emoji = "❤\uFE0F";
        System.out.println("Emoji : " + emoji);
        //----------------------------♦•☺☻♥♦♣♠•◘○♂▬!,7BM8X`♀♪♫☼►1•↕‼¶◙§▬↨↑↓→←∟↔!▼ !"#$%&'$,)


    }
}
