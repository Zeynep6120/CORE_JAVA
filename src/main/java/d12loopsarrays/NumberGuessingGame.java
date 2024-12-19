package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etmek oyunununu do-while ile yazdiriniz.
        Scanner scanner = new Scanner(System.in);
        //Java nın kendi aklından sayı tutabilmesi için random diye bir class var .rastgele demek bi şimdi
        //Random classından bir obje oluşturucaz
        Random random = new Random(); // java bunla rastgele sayı üretecek

        // 0 - 100 arasında rastgele bir sayi üretelim
        int rastgeleSayi = random.nextInt(101);

        //Kullanıcının kaç kere tahmin yaptığını takip etmek için bir sayaç oluşturalım.
        int denemeSayisi = 0;

        //Kullanıcının yaptığı tahmini saklamak için bir değişken oluşturalım.
        int tahminEdilen;

        //Kullanıcın sayıyı doğru tahmin edip etmediğini kontrol etmek için bir boolean değişken oluşturalım
        boolean tahminDogrumu = false;// ilk aşamada false yükledim. şu an bilemedi olarak kabul ediyoruz.
        //yani defaultu false. true olduğu zaman bilmiş olacak.

        System.out.println("0-100 arasinda bir sayi tahmin etmey çalışın");

        do {
            //Kullanıcıdan bir tahmin alalım
            System.out.println("Tahmini yapiniz");
            tahminEdilen = scanner.nextInt();

            //Sayaci bir artiralım
            denemeSayisi++;

            //Tahmini Kontrol edelim
            if (tahminEdilen < rastgeleSayi) {
                System.out.println("Sayi daha büyük");
            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println("Sayi daha küçük");
            } else {
                tahminDogrumu = true;
                System.out.println("Tebrikler, doğru tahmin");
                System.out.println("denemeSayisi = " + denemeSayisi);
            }


        } while (!tahminDogrumu);// döngü doğru tahmin yapılıncaya kadar devam edecek.
        scanner.close();//Random'da kapatiliyor mu?
        //bu best practice dir kaynakları kapatma demektir.

        //ODEV!!!!!!!!!!!
        //20(dahil) ile 100(dahil) arasında random sayi isteseydik????

    }
}
