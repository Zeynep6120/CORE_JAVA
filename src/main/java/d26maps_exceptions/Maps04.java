package d26maps_exceptions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Maps04 {

    public static void main(String[] args) {

        //Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim

        /*
        Thread Safe: Aynı anda birçok iş parçacığı tarafından güvenli bir şekilde erişilebilen yapılar.
        Veri yarışlarını ve tutarsızlıkları önler.
        //iş parçacığı güvenliği bir den fazla kişinin aynı andan aynı şeyi yaparken sorun yaşamaması anlamına gelir
        //mesela birden fazla kişi para çekiyor ve hiçbiri de sorun yaşamıyor


        Multi Thread: Aynı anda birden fazla iş parçacığı tarafından çalıştırılabilen programlar.
        Paralel işleme ve performans artışı sağlar.

        //Multi Thread i bir yapı gibi düşün
        //Thread safe i de multi threa din güvenli çalışmasını sağlayan başka bir yapı gibi düşün
        //oyun olarak düşünürsek oyuncu hareket ediyor aynı anda düşmanlar hareket ediyor hem de arka planda müzik çalıyor
        //bu farklı işler aynı anda olmalı.ve birbirlerini etkilememeliler.çünkü oyun çok iş parçacıklı çalışıyor
        //multi thread yapılar bu şekildedir.


        Synchronized: Aynı anda sadece bir iş parçacığı tarafından erişilebilen metodlar veya kod blokları.
        Eşzamanlılık sorunlarını ve veri tutarsızlıklarını önler.
        //bir şeyin aynı anda sadece bir kişi tarafından kullanılabilmesi için sıraya konulması demektir
        //örneğin bir okulda sadece bir bilgisayar var 3 tane tane de öğrenci gelmiş ne yapacaklar sıraya girecek ler
        //yani senkronize olacaklar.her kez sıraya girecek.sekrenozised bir sistemde bilgisayarın sadece bir öğrenci
        //tarafından kullanılması sağlanır.böylece bilgisayar hem bozulmaz hem de karışıklık olmaz
        */

        /*HashMap, HashTable ve ConcurrentHashMap arasindaki fark nedir?
        1- HashMap
            a) Thread Safety:
        Thread-safe değildir.
        Çok iş parçacıklı (multi-threaded) ortamda veri tutarsızlıkları olabilir.
            b) Multi Thread:
        ****Tek iş parçacıklı (single-threaded) ortamlar için idealdir.****
        Çok iş parçacıklı ortamlar için harici senkronizasyon gerektirir.
            c) Synchronized:
        Synchronized değildir, yani aynı anda birden fazla iş parçacığı tarafından erişilebilir.
            d) Null Key/Value:
        Bir null key ve birden fazla null value kabul eder.
            e) Performans:
        En hızlısıdır çünkü synchronized değildir.
         */

        /*
        2- Hashtable
            a) Thread Safety:
        Thread-safe'tir.
        Synchronized yapısı nedeniyle aynı anda sadece bir iş parçacığı tarafından kullanılabilir.
            b) Multi Thread:
        ***Çok iş parçacıklı (multi-threaded) ortamlar için uygundur.***
            c) Synchronized:
        Synchronized'dir, yani tüm metotlar synchronized olarak işaretlenmiştir ve aynı anda sadece bir iş parçacığı tarafından erişilebilir.
            d) Null Key/Value:
        Ne null key ne de null value kabul eder. NullPointerException atar.
            e) Performans:
        HashMap'ten daha yavaştır çünkü synchronized'dir*/

        /*
        3- ConcurrentHashMap
            a) Thread Safety:
        Thread-safe'tir.
        Segment-based locking kullanarak senkronizasyon sağlar.
            b) Multi Thread:
        ***Çok iş parçacıklı (multi-threaded) ortamlar için idealdir.***
        Aynı anda birden fazla iş parçacığı tarafından güvenli bir şekilde kullanılabilir.
            c) Synchronized:
        Synchronized'dir, ancak segment-based locking sayesinde daha iyi performans sunar.
            d) Null Key/Value:
        Ne null key ne de null value kabul eder. NullPointerException atar.
            e) Performans:
        HashTable'dan daha hızlıdır çünkü segment-based locking kullanır.
        Çok iş parçacıklı ortamlar için optimize edilmiştir.
        */

        /*HashMap, Hashtable ve ConcurrentHashMap ne zaman kullanılir?
        1- HashMap:
        Tek iş parçacıklı uygulamalar için idealdir  çünkü synchronized değildir(ek bir işlem ve zaman gerektirmez)
        Çok iş parçacıklı ortamda kullanılacaksa, dış senkronizasyon mekanizmaları ile korunmalıdır.

        2- Hashtable:
        Eski kod tabanları ve miras uygulamalar için uygundur
        (Varolan bir kod tabanını korumak veya mevcut bir projeyi
        güncellemek zorunda olduğunuz durumlar)
        Yeni projeler için genellikle önerilmez çünkü daha modern ve performanslı alternatifler vardır.

        3- ConcurrentHashMap:
        Modern ve yüksek performanslı çok iş parçacıklı uygulamalar için en iyi seçenektir.
        (Web sunucuları, veri işlem sistemleri, yüksek trafikli uygulamalar)
        Thread safety ve performansın önemli olduğu her durumda tercih edilir.*/

        Hashtable<String, Integer> studentGrades = new Hashtable<>();
        studentGrades.put("Selma", 70);
        studentGrades.put("Tuba", 75);
        studentGrades.put("Ibrahim", 85);
        studentGrades.put("Sefa", 87);

        //studentGrades.put(null, 50); //Hata ,key de de value da da null kabul etmiyor exception fırlatıyor direkt.
        //studentGrades.put("Ahmet", null); //Hata


        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Ahmet", 41);
        stdAges.put(null, 41);
        stdAges.put(null, 39);
        stdAges.put("a", null);
        stdAges.put("b", null);

        System.out.println(stdAges);

        // ConcurrentHashMap oluşturma
        ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();

        // Eleman ekleme
        stock.put("Elma", 10);
        stock.put("Muz", 20);

        //Elemana erisme
        System.out.println("Elmanin stok miktari: " + stock.get("Elma")); //Elmanin stok miktari: 10

        //Guncelleme veya ekleme
        stock.putIfAbsent("Cilek", 30); //Cilek yoksa ekle
        System.out.println(stock); //{Muz=20, Elma=10, Cilek=30}

        stock.replace("Muz", 20, 25);
        System.out.println(stock); //{Muz=25, Elma=10, Cilek=30}

        //Eleman silme
        stock.remove("Elma");
        System.out.println(stock); //{Muz=25, Cilek=30}

        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " stok miktari: " + value);
        }
        //--------------------
        /*
        1) TreeMap’ler entry’leri natural order’a gore siraya koyar, bu yuzden yavastirlar
        2) TreeMap’ler  thread-safe ve synchronized degildir.
        3) TreeMap’lerin key’lerinde null kullanilamaz(Comparator istisnasi var ama onerilmez),
        ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) TreeMapler key’e bakarak siralama yapar
         */

        TreeMap<String, Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        //countryPopulation.put(null, 18000000); HATA treemap lerin key lerinde  null kullanılmaz null olsa naturel order olmazdı
        countryPopulation.put("Italy", null);
        countryPopulation.put("France", null);

        System.out.println(countryPopulation);
        //{France=null, Germany=83000000, Italy=null, Netherland=18000000, Turkiye=83000000, USA=400000000}

        /*LinkedHashMap, HashMap'e benzer, ancak ekleme sırasına göre sıralanmış bir şekilde verileri tutar.
    Yani, LinkedHashMap verileri eklediğiniz sırayla tutar ve bu sırayı korur.
    Bu nedenle, verileri eklediğiniz sırayla geri almanız gerektiğinde kullanışlı olabilir.

    **ornegin,bir takvim uygulamasında, etkinlikleri tarih sırasına göre tutmak için kullanılabilir.
    yada bir restoranın sipariş alım sistemi düşünün. Müşterilerin siparişlerini verme sırası,
    restoranın sipariş hazırlama sırasını belirler.

    Aynı mantık, müşteri hizmetleri çağrı merkezleri, sırayla hizmet veren işletmeler veya
    benzeri senaryolarda da kullanılabilir.
    Müşteri veya işlem sıralarını takip etmek için LinkedHashMap tercih edilebilir.LinkedHashMap sınıfı thread-safe degildir
*/
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("Ali", 25);
        lhm.put("Can", 18);
        lhm.put("Mehmet", 30);

        for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        //        Ali --> 25
        //        Can --> 18
        //        Mehmet --> 30 //insertion order

        //HashMap arka planda nasil calisiyor?
        //HashMap'in varsayılan boyutu(kapasitesi)
        // 16'dır (0 ila 15).16 adet "bucket" (kova) bulunacağı anlamına gelir.
        // Bu "bucket"lar, HashMap içindeki anahtar-değer çiftlerini tutar.
        // Bucket'in memory'de kapsadigi alan degiskendir.


        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.get("USA");
        capitals.put("Italy", "Rome");
        capitals.put("Turkiye", "Ankara");
        //hask kode çakışmasında aynı hask kodları yanına node oluşturup
        //sağ doğru Linked Liste olarak ekler
        //yani aynı bucket olursa yana doğru linked liste olarak ekler.
        capitals.get("Turkiye");
        capitals.put("Turkiye", "Istanbul");
        //12 bucket dolunca bir 16 tane daha java bucket açar ama
        // bu sefer hash code ları 16 ya değil 32 ye bölmeye başlar


    }
}
