package d20staticblock_instanceblock_oop;

import java.time.LocalDate;

public class StaticBlock {

    //Senaryo: Subat ayinda fiyatlarda indirim olacak. Class cagirildiginda otomatik price’i alacak
    // ve class’in heryerinde bu degeri kullanacak.
    //Scenario: There will be a discount on prices in February. The class will get the price automatically when called
    // and will use this value everywhere in the class

    //Bir variable olusturup deger atamazsaniz o variable'i initialize etmediniz demektir
    static double pi; //global variable

    static int price;

    //----------------------------------------------------------------
    //birden fazla static method varsa da yukardan aşağı çalışırlar
    static {
        System.out.println("static block 2");
        LocalDate currentDate = LocalDate.now(); //şu ankı tarihi aldık

        if (currentDate.getMonthValue() == 2) {
            price = 1000;
            System.out.println(price);//alinan ayın tarihini aldık ve 2 ye eşit mi diye kontrol ettik
        } else {
            price = 2000;
            System.out.println(price);

        }
        //yukarda bir değişken oluşturduk atamları static in içinde yapıldı. tarih geldiğinde price değikeni otomatik d
        //değişir ve aşağıda bir yerde price değişkeni çağrılırsa ayarlanan değer artık kullanılır
    }


//-------------------------------------------------------------------------------
//Static variable static bloclar içinde intialize edilirse herşeyden önce hazır hale gerlirm
//yani static bloclar benim yemek yapmak için domates patates ve baharatlarımı hazırladığım yer olaraK Düşünebiliriz
//main kısmı yemek yapma aşaması olarak düşünürsek static bloğu yemekten önce hazır ediyorumki daha hızlı yemek yapabiliyim
//
// main kısmını yemek yapma aşamasıdır
//-------------------
//tanımlamayı static bloğun dışında yaptım çünkü. eğer ben bloğun içinde tanımlama yapsaydım bu değişken sadece
//bloğun içinde yaşardı yani mainin içinde tanınmazdı.yani yerel(local) bir değişken olurdru.ben bunun önüne
//şu şekilde geçerim o değişeni static blokun dışında tanımlarım artık bu değişken (global) bir değişken oldu
//artık bu değişken her yerde tanınır hale geldi.şimdi değişkeni dışarda tanımladık ama static bloğın içinde değer atatdık

    //------------------------------------------------------------------------------------
    static { //static block
        pi = 3.14;
        System.out.println("Static block 1");
    }

    //----------------------------------------------------------------------------------------
//static block mainde önce çalışır.
//staic  block ile javaya hız kazandırıyoruz
//atıyorum ben pi yi javanın içinde 10 defa kullanacam 10 defa assign etmem gerekir .bunun yerine static block ta
//bir defa assign ediyorum ve sadece main de çağırma işlemı yapıyorum ve bu sayede java ya hız kazandırıyorum.
//eğer main  methodu staic block tan yukarda bile olsa yine block önce çalışır. çünkü blocklar aşağıdan yukarı
//mantığının dışında çalışır. static blocklar her zaman önce çalışır.
    public static void main(String[] args) {

        /*“static” blok, bir class’in yüklenmesi sırasında otomatik olarak çalışan ve class’in başlatılmasını
        veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.

         Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
         Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
         bir şekilde hazır olmasını sağlar.*/
        System.out.println(pi);
        System.out.println("main method ici");

    }
}