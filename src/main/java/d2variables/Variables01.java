package d2variables;

public class Variables01 {

    public static void main(String[] args){

        //java bu satırı okumaz kendimize ve başkasına açıklamadır./
        /*
        java bu satırı okumaz kendimize ve başkasına açıklamadır.
        *= bununu adı asterix tir
         */

        /*
        1)Java dili Strongly Typed'dir. bu nedenle Java'daki her değişken (variable),
        belirli veri türü(data type) ile ilişkilendirilmektedir.
        2)Kod yazanin değişkenlere uygun değerlerin atandığından emin olması her zaman gerekir.
         Aksi takdirde hata oluşur.
         */


         /*
         Ornek 1: String data tipinde ismi hi olan bir variable oluşturarak,
         icine "Hello World" yukleyip console' a yazdiriniz.
         Example 1: By creating a String data type variable with the name hi, load " Hello wolrd " into it and write it to console.
         */

         //Siralama nasil olacakti?
         // data type ==> variable name==> atama operatoru ==> data==> noktalo virgül
         String               hi             =             "Hello World"   ;
         System.out.println(hi);//Hello World

         //--------------------------------------
        // Ornek 2: Tamsayi(int) data tipinde ismi age olan bir variable olusturunuz
        // ve icine  15 yükleyip console yazdırınız

        // Example 2: Create a variable with the name age of the integer (int) data type
        // and load 15 into it and write it to the console

        int age = 15;
        System.out.println(age);//15
        //----------------------------------
        /* Java Primitive Data Types:
        (tamsayılar için= byte,short,int,long:  ondalıklı için = double ,float: karakter için=char boolean)
        Not 1: primitive data type'larini Java olusturmuştur. biz oluşturamayız
        Not 2: primitive data  type'larini isimlerinde sadece kücük haraf kullanılır.
        Not 3: Primitive datalar, data type'larına göre memory'de farklı yer kaplar
        Not 4: primitive datalar, iclerinde sadece sizin atadıpnız değeri barindırırlar
         */
        //---------------------------
        // 1- byte data type
        // tam sayilar içindir. Hafizada 1 byte(8 bit) yer kaplar
        // -128 den + 127 e  kadar tamsayi değerlerini kaplar.

        // Ornek 1: byte data tipinde öğrenci yaşı için bir variable oluşturun ve değer atayin
        // Example 1: Create a variable for student age in byte data type and assigne a value.

        byte studentAge = 13;
        System.out.println(studentAge);//13

        //-----------------------------------
        // 2- short data type :
        //Tam sayilar içindir. Hafizada 2 byte (16 bitJ) yer kaplar. Aralik(range) genişledi.
        // -32768 den +32767 ' e  tamsayi değerleni için kullanilir.

        // Ornek 1: Site nüfusu için bir variable oluşturun ve 1200 değerini atayin
        // Example 1: Create a variable for the site population and assign it the valur 1200

        short sitePopulation = 1200;
        System.out.println(sitePopulation);//1200

        //----------------------------------------
        //3- int data type:
        // tam sayilar içindir. Hafizada 4 byte (32 bit ) yer kaplar
        //-2,147,483,648 ile 2,147,483,647 'e tamsayi değerleri için kullanılır.

        // Ornke 1: Ulke nufusunun için bir variable oluşturun ve değer atayin.
        // Example 1: Create a variable for the country pupulation and assign a value.

        int countryPopulation = 84234345;
        //java println içinde yazdığuınız çift tırnaklardaki label yani etiketleri aynen konsola yazdırır.
        //countryPopulation.soutv
        //countryPopulation.soutv ===>değişken isimi ve soutv yazıp entere bastık
        System.out.println("countryPopulation = " + countryPopulation);

        System.out.println("Turkiye Nufusu:" +countryPopulation);

        //Ornek 2: iki tane int variable oluşturun ve toplarini console'a yazdırın
        //Example 2: Create two int variables and print their sums to the console

        int a = 12 , b = 13;
        System.out.println("Toplam sonuc =" + (a+b));




    }

}
