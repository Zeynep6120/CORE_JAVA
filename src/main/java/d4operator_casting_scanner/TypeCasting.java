package d4operator_casting_scanner;

public class TypeCasting {
    public static void main(String[] args) {

     /*Sayisal primitive data tiplerinin birbirine donusturulmesine Type Casting denir
        Numeric (sayisal) Data Type ==> byte - short - int -       long -    float -    double */
        //int ve float ikisi de 4 byte yani aynı boyutta.long ve double de 8 byte ve aynı boyuttadır
        //java aynı boyutta olmalarına rapmen int 'i float'a otomatik çeviri fakata float'ı int'e
        //otomatik çevirmez çünkü java float taki ondalık kısmın kaybolmasından korkar.
        //aynı şey long ve double için de geçerlidir. long'u double 'a otomatik çevirir ama double'u
        //long'a çevirmez belki ondalık kısımda bir kayıp yaşanır diye.

     /*Not 1: Kucuk data type’larini buyuk data type’larina cevirmeyi Java otomatik olarak yapabilir.
        Bu isleme “AutoWidening“ (Otomatik genisletme) denir*/

        /*Not 2: Buyuk data type’larini kucuk data type’larina cevirmek riskli bir istir. Veri kaybi olusabilir.
        Java bu isi otomatik olarak yapmaz. Bu islemi kod yazanlar yapar.
        Bu isleme "Explicit Narrowing“(Aciktan Daraltma)denir.*/

        //Ornek 1: byte data type' ini int data type'ina ceviriniz. (AutoWidening)
        //Example 1: Convert byte data type to int data type.

        byte age = 13;
        int ageInt = age;

        //Ornek 2: int data type' ini short data type' ina ceviriniz. (Explicit Narrowing)
        //Example 2: Convert int data type to short data type.

        int weight = 313;
        short weightShort =(short) weight;
        //casting kaliba dökmek demek.
        //burda paranteze çevirmek istediğniz primitive i yazarız burda sayı ya bakıp shorta sığıp sıpmayacağının
        // garantisi biziz. eğer çok büyük bir int ise veri kaybı olabilri.

    }
}
