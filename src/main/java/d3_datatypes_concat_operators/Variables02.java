package d3_datatypes_concat_operators;

public class Variables02 {
    public static void main(String[] args) {

        /*
        Non-primitive Data types:
        Orneğin String class non-primitive bir data type'dir.
        Not 1: Üretilen her bir class ayni zamanda bir "non-primitive" data type dir.
        bu yüzden "non-primitive " data type'lar sinirsiz sayıdadır denilebilir.

        Not 2: Non-primitive data type'larin isimleri büyük harf ile başlar.
        Not 3: Non- primitive'ler için Java memory'de büyüklüğüne göre değişen boyutlara yer ayırır.
         */

        // String Data Tipi(Class): String data tipi,cümleler, kelimeler, semboller,rakamlar içerebilir.

        //Ornek 1: Oğrenc, ismi için variable oluşturup deper olarak Ali Can atayiniz.
        //Example 1: Create a variable for the student name and assign the value to Ali Can.

        String studentName = "Ali Can";
        int age = 7;
        // primitive türlerde  method kullanımı açılmaz.non-primitive ler kısaca class tır .class ların aktif ve pasif
        //özellikleri vardır. o yüzden memory de iki şey olur birincisi primitiveler gibi değer atanır. null iken Ali Can
        //oldu. ikincisi class ın method ları aktifleşir. biz istersek bunları kullanırız
        // null ı biz içi boş obje olarak tanımlarız.

        //-------------------------------------------
        /*
        Soru: primitive ve non-primitive data type'lari arasinda farklar nelerdir? (İNTERVİEW SORUSU)

        1-)"primitive" ler sadece bizim atadiğimiz deperi içerir
        "non-primitive" ler bizim atadiğimiz değeri ve methodlari içerir

        2-)"primitive" ler küçük harfle başlar, "non-primitive" ler büyük harf ile başlar. class lar büyük harf ile başlar
        3-)"primitive" leri java üretmiştir ve 8 tanedir.
        "non-primitive" leri Java ve kod yazanlar üretebilir,sinirsiz sayıdadır.
        4-) "primitive" ler memory' de data type'larina göre sabit boyutta bellek kullannır
        "Non-primitive" ler için Java memory'de büyüklüğüne göre değişen boyutlarda bellek kullanabilir.
        */

        // Ornek 2: Sehir ismi için bir variable oluşturun  ve once "Ankara" sonra da "Izmir" degerlerini atayip
        // Example 2: Create a variable for  the city name and assign the values "Ankara" and then "Izmir" and print

        String cityName = "Ankara";
        System.out.println(cityName); //Ankara

        cityName = "Izmir";
        System.out.println(cityName);//Izmir








    }
}
