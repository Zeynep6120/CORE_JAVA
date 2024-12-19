package d27exceptions;

public class E01 {
    public static void main(String[] args) {

        /*Exception: Kod çalıştırıldığında akışı bozan hatalardır. "Beklenmedik sorunlar" demektir.
        Her exception, hata mesajını ve hata türüne ait bilgiyi içinde bulundurur.

        1- exception (İstisnalar), normal kod yürütme akışını bozan hatalardir.

        2- exception bir classtir. Methodlari vardir. Kendi icinde hata kodlari, bilgi mesajlari vardir.
        Ornegin; Bir classtaki bir method cagirildigi zaman kod calismaya baslar. Bu andan itibaren kodlar satir satir
        okunmaya baslar. Ve kodlarda bir hata varsa, exception durumu olusur.

        Tabi bu hatalari developer onceden ongorup handler etmeli, duzeltmelidir ama kullanici programimizi
        kullanirken ongorulmeyen durumlar her zaman olusabilir. Bir hata olustugunda neden kaynaklandigini
        ogrenip cozmek, o an cozulemiyorsa da sistemin durmayip calismasinin devam etmesi icin alternatif
        cozumler uretmek gerekiyor

        3- Bir exception oluştuğunda, kod yürütme durur. Exception’lar, hata ayıklama günlüklerinde(log) oturum açar.*/

        /*
        4- Exception Handling, Java’da, akışı kesintiye uğratmadan kodumuzdaki istenmeyen istisnaları
        veya sorunları işlememize olanak tanıyan bir yöntemdir

        5- Exception denince akliniza 3 seyin gelmesi lazim. try, catch ve finally (optional).

        6- Kod başarılı bir şekilde çalışmadığında bile, kullanıcı deneyiminin sorunsuz olmasını sağlamak için,
        tüm yürütmeleri bir try catch ifadesine sarmak programlama dünyasında en iyi uygulama olarak kabul edilir.
        Ancak, tüm kodları körü körüne try-catch blokları içine almak her zaman en iyi pratik değildir.
        Bu, hataları maskeleyebilir ve programın gerçek hataları gizlemesine yol açabilir.

        https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
         */

        //1) ArithmeticException : Matematik kurallarinda herhangi bir hata yaparsaniz bu exception'i alirsiniz
        //division(5,0);
        //division2(8, 0);
        division3(7,0);

    }//main
    public static void division(int a, int b){
        if(b==0){
            System.out.println("Lütfen sıfır girmeyiniz");
        }else{
            System.out.println(a/b);
        }
    }

    //try-catch kullandiginizda sistem tarafindan "try" bolumu calistirilir,
    // eger "try" bolumunde hata ile karsilasilmazsa "catch" blogu hic calismaz
    //Eger "try" bolumunde hata ile karsilasilirsa hata alinan satirda calisma durdurulur
    // ve "catch - yakalamak" bolumu calismaya baslar.
    //try da her hangi bir exception fırlatılmaz ise catch çalışmaz.
    //try da herhangi bir hata olursa o satırda çalışma direct durur ve tryın altındaki kodlar çalışmaz.direckt catch e
    //gidilri.ve catch bölümü çalışnaya başlar.

    public static void division2(int a,int b){

        //hata beklenilen kod try ın içine alınır.eğer orda hata olursa catch onu otomatikmen yakalar.
        try{
            System.out.println(a/b);
            System.out.println("Try içi görev tamamlandı");
        }catch(ArithmeticException e){// e bir değişken ismi buraya elma yazsak da olur . e üzerinden methodlar çağrılrı.
            System.out.println("Lütfen sıfıra bölme işlemi yapmayınız");
        }
        System.out.println("try catch sonrasi kod , akışına devam ediyor");
        //hata oluştuğu an o satırda çalışma durur
        // yani tray ın içinde çalışma durur .java exception fırlatır.catch onu yakaladır
    }

    //Throw Exceptions : a/b gibi islem sirasinda degilde, istenmeyen durumu gorunce hatayi biz olusturalim

    public static void division3(int a, int b){
        try{
            if(b==0){
                throw new ArithmeticException("Sıfıra bölme hatası");
            }
        }catch(ArithmeticException e){// e bir değişken ismi buraya elma yazsak da olur . e üzerinden methodlar çağrılrı.
            System.out.println("Lütfen sıfıra bölme işlemi yapmayınız");
        }
        System.out.println("try catch sonrasi kod , akışına devam ediyor");
    }













}
