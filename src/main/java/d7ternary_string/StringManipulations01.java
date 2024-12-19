package d7ternary_string;

public class StringManipulations01 {
    public static void main(String[] args) {

        //String Data Tipi (Class)
        //String Data tipi, kelimeler, semboller, rakamlar, içerebilir.

        // Ornek 1: "s" String'inde kullanılan karakter sayisini bulunuz.
        //Example 1: Find the number of character used in String "s".

        //length() methodu String'in uzunlugunu dondurur.1’den baslar
        //length() methodu boşluğu da karakter gibi kabul edip sayar bu yüzden alltaki cümlede 12 karakter var gibi çıktı
        String s = "Java is easy";
        int slength = s.length();
        System.out.println(slength); //12

        System.out.println("-----------------------------------");
        //------------------
        //Ornek 2: "s" String'inde ilk ve son index’teki karakterleri aliniz.
        //Example 2: Get the characters in the first and last index of String "s".

        //charAt(int index) metodu, belirtilen index’te yer alan karakteri döndürmek için kullanılır.
        //Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.
        //son indeks her zaman length in bir eksiği çıkar.
        //Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
        // gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.

       char firstChar = s.charAt(0);
        System.out.println(firstChar); //J

        char lastChar = s.charAt(11); //statik code
        System.out.println(lastChar);

        char lastChar2 = s.charAt(s.length()-1);//dynamic code
        System.out.println(lastChar2);
    // her zaman length()-1 son indeksi verir bu tarz code lara dyanmic code denir.

        //-------------------------------------------------
        System.out.println("--------------");
        //------------------
        //Ornek 3: "s" String'indeki ilk 4 karakteri aliniz.
        //Example 3: Get the first 4 characters of the string “s".

        //substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring'i döndürür.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)

        String sub1 = s.substring(0,4);
        System.out.println(sub1);


        //Ornek 4: "s" String'indeki "is" kelimesini aliniz.
        //Example 4: Get the word "is" in String "s".

        System.out.println("--------------");
        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        System.out.println("--------------");
        //Ornek 5: "s" String'indeki "easy" kelimesini aliniz.
        // Example 5: Get the word "easy" in Strin "s".

        String sub3 = s.substring(8,12); // ilk index dahil ikinci index dahil değil
        System.out.println(sub3);

        //2.kullanimi: substring(int beginIndex): Belirtilen indeksten başlayarak sonuna
        // kadar olan substring'i döndürür.

        System.out.println("--------------");
        String sub4= s.substring(8); //Java ya dedimki 8. indeksten başla sona kadar ne varsa al
        System.out.println(sub4); // easy


        //------------------
        //Ornek 6: “s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.
        //Example 6: Check if the word easy exists in the String "s".

        //contains() method’u herhangi bir karakterin veya karakterlerin String'de
        // var olup olmadigini kontrol eder.
        //contains() methodu true veya false return eder. boolean
        //büyük küçük harf duyarlıdır. easy ile Easy farklıdır yani

        boolean isExist = s.contains("easy");
        System.out.println(isExist);

        //------------------
        //Ornek 7: “s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        //Example 7: Check if the string "s" starts with a certain letter.

        //startsWith() methodu bir Strig’in ilk karakterini/karakterlerini kontrol eder
        //startsWith() methodu boolean return eder.
        //büyük küçük harf duyarlıdır
        System.out.println("--------------");
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        //-----------------------------
        //Ornek 8 : "s" String'inin "easy" ile bitip bitmediğin kondtol ediniz.
        //Example 8: Check if the string "s" ends with "easy"

        //endsWith() methodu bir String'in son karakterini/karakterlerini kontrol eder
        //endWith() methodu boolean return eder.
        //büyük küçük harf duyarlıdır
        System.out.println("--------------");
        boolean isEnd= s.endsWith("easy");
        System.out.println(isEnd);











    }
}
