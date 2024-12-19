package d3_datatypes_concat_operators;

public class Variables01 {

    //psvm yazarak direkt main oluşturulabiliyor.
    // ya da ma yazıp uyarı gelince enteree basarsak da main oluşuyor.

    public static void main(String[] args) {
        // 4- long data type:
        // Tam sayilar içindir. Hafizada 8 byte(64 bit) yer kaplar
        // -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasındaki sayilardır.(kentilyon)

        //Not: Long oluştururken eğer değer, Integer'larin maximum değerinden büyük ise
        // sonunda "L" koymak zorundasiniz, yoksa "integer number too large - Tam sayı çok büyük hatasi alirsiniz.

        //Ornek 1: Insan vücudundaki hücre sayisi için variable oluşturup değer atamasi yapiniz.
        //Example 1: Create a variable for the number of cells in the human body and assign a value.

        long numberOfCells = 123456789012L;
        System.out.println(numberOfCells);

        // Ornek 2: iki tane long variable oluşturun ve toplamlarini bir etiketle console'a yazdırıin.
        // Example 2: Create two long variables and print their sums to the console with a label.

        long c = 15, d = 20;
        System.out.println("Sum : " + (c + d)); //Sum:35

        //-----------------------------------
        //5- float data type: hafizada 32 bit - 4 byte yer kaplar
        //(Decimal numbers ==> ondalikli sayilar) için kullanılır
        // Ozellikle fiyat değerleri için "float" kullanılabilir. App'inizde bu data tipini seçmelisiniz

        //Dikkat: Java ondalikli sayilari otomatik olaralk double kabul eder
        //(trigonometrik işlemler, logaritmalar vb.) çok hassas sonuçlar gerektirdiğinde,
        // double'ın daha yüksek hassasiyeti faydali olabilir. o yüzsen default double dir.
        // float olmasina israr ediyorsaniz sonuna "F" veya "f" koynalisiniz.
        // tam sayilarda default küçük olan int dir. ondaliklarda default yanı varsayılan double yani büyük olandır.

        //Ornek 1: 2 tane float data tipinde variable oluşturuneuz ve bunların toplamini bir etiket ile consola yazdırınizz
        // Example 1: Create 2 float data type variables and write their sum to the console with a label.
        //1.yol:

        float sockPrice1 = 12.99f;
        float shirtPrice1 = 25.99f;
        System.out.println("Total Price1: " + (sockPrice1 + shirtPrice1)); //Total Price1:38.98

        //2.yol:
        // scope yaşam alanı demek yani mainin için aynı scope içinde bir değişkeni iki defa tanımlayamazsınız.
        // iki süslü parantez arası scope tur ve farkli parantezler içinde aynı değişkeni tekrar tanımlayabilirsiniz.


        float sockPrice2 = 12.99f, shirtPrice2 = 25.99f;
        System.out.println("Total Price2: " + (sockPrice2 + shirtPrice2));

        // 3 çorap, 2 gömlek olsaydı?
        // what if there were 3 socks and 2 shirts?
        System.out.println("Total Price: " + (3 * sockPrice1 + 2 * shirtPrice1));//Total Price:90.95
        // koddaki girinti ve çıkıntıları intelijj otomatik olarak ayarlayabiliyor. yukardan code bölümüne
        //girip reformat code  a tıklarız kısa yolu ise( CTRL+ALT+L)
        //belli aralıktaki satırı yoruma almak istersen yukardan code bölümünü seçip comment with block comment
        //seçeneğini seçersek o satırları yoruma alır kısa yolu ise( CTRL+SHIFT+/)

        // -------------------------
        //6- double data type:
        // double memory de 8 byte(64 bit) yer kaplar, ondalikli kisim için daha fazla rakam alir.
        // Ondakikli sayilar için kullanilir. Daha hassas hesaplamalar için kullanilri.

        // Ornek 1: Hücre ağırliı için bir variable oluşturup console'a yazdiriniz.
        // Example 1: Create a variable for cell weight and print it to the console.

        double cellWeight = 0.000000000000028;
        System.out.println(cellWeight); //2.8E-16 ==> 2.8 çarpı 10 üzeri -14 demek

        // --------------------------------
        // 7- char 2 byte'tir( 16 bit). Tek karakterşer için kullanilir.
        // Sayi, sembol, harf farketmez. Data tek tirnak içine yazilir.
        // SD şeklinde  ıki karakter koyamazsiniz.
        // Örneğin 'A','x','?','5' koyabilirsiniz.

        //Ornek 1: char data tipinde bir variable oluşturunuz vve içine isminizin ilk harfini yükleyiniz.
        //Example 1: Create a variable of char type and insert the first letter of your name into it.

        char firstLetterOfTheName = 'S';
        System.out.println(firstLetterOfTheName); //S

        // --------------------------------
        // 8- Boolean Data Type: Sadece true(doğru) ve false(Yanlis) olmak üzere 2 farkli deper alirlar.

        //Ornek 1: boolean data tipinde, emekli mi sorusi için bir değisken oluşturun ve false atayin
        //Example 1: Create a variable of boolean data type for teh question "Is he/she retired?" and assign it to false.

        boolean isRetired = false;
        System.out.println(isRetired); //false

        //----------------------------------
        // CTRL+D üstteki ifadeyi alta yapıştırır. bu intellij in kısayol özelliğidir.
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        System.out.println("-----------------");
        System.out.println(b1 && b2); //false
        System.out.println(b2 || b3); //true
        System.out.println(b2 && b4); // false
        System.out.println(b3 || b4); //true

        /*
        System.out.println() ve System.out.print() fonksiyonları arasındaki temel fark,
        System.out.println() 'in bir satır atlayarak çıktı vermesi,
        System.out.print()'in ise aynı satırda çıktı vermeye devam etmesidir

        */
        System.out.println("Hello");
        System.out.println("World");
        //Hello
        //World

        System.out.print("Hello");
        System.out.print("   world");
        // Hello   world


    }

}
