package d12loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        //Array - dizi
        /*
            1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.

            2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
            bir String dizisi sadece String değerler saklayabilir.

            3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
            Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.

            4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir

            5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.

            6)Array’ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
            (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
        */

        //Array olusturmak

        String[] stdNames1 = new String[3];// daha çok bu üstteki javada kullanılıyor
        String stdNames2[] = new String[4];// bu çok kullanılmıyor .bu daha çok c tarzı bir sintax

        // Array ler de obje sınıfından türemiş olarak kabul edilirler. o yüzden obje classının bazı methodlarını
        // kullanabilirler.
        /*
        NOTTTT!!!!
        System.out.println(stdNames1); // arraylar doğrudan yazdırılımaz
        // 3 tane null görmedik çünkü java da array lar sout ile doğrudan yazılamaz.
        //karşımıza sayılar harfler fln çıkar bu heap memorydeki adrestir.bu heap memory deki arrayin olduğu
        //yerin adresini gösterir.
    */
// JAVA da ARRAYS diye yardımcı bir class vardır.bu tarz dizi ve arraylerle çalışmak için kullannıllır.içinde ç
        //çesitli methodlar vardır

        System.out.println(Arrays.toString(stdNames1)); //[null, null, null] şimdi heap e ulaştık.
        //class ismi ile çağrılan methodlara  statik method denir!!!!1

        System.out.println("------------------------------");
        //-------------------
        //ornek 1: 5 elemanli notes adinda, int bir array olusturunuz ve console’a yazdiriniz

        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes));//[0, 0, 0, 0, 0]
        System.out.println("---------------------------------");

        //-------------------
        //ornek 2: 10 elemanli integers adinda, Integer  bir array olusturunuz ve console’a yazdiriniz
        //Array’ler de non primitive (reference) veri tipleri de saklanabilir.

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));//[null, null, null, null, null, null, null, null, null, null]
        //non-primitive ler default olarak null konuluyor.wrapper lara default olarak null konur.

        //-----------------------
        //ornek 3: 3 elemanli names adinda, String bir array olusturunuz ve console’a yazdiriniz
        String[] names = new String[3];
        System.out.println(Arrays.toString(names));//[null, null, null]

        System.out.println("---------------------------------");
        //-----------------------
        //Array'e eleman eklemek
        //index mantigiyla ekleniyor. 0 ilk index demektir
        names[0] = "Ali Can";
        names[2] = "Veli Han";
        names[1] = "Ayse Hanim";
        //names[3]= "Hasan Kaya"; HATA, 3.index yok.

        System.out.println(Arrays.toString(names));//[Ali Can, Ayse Hanim, Veli Han]

        //Bir veryiy gormek için ist:
        System.out.println(names[1]); // Ayse Hanim
        System.out.println("-----------------------------");
        names[0] = "Omer Can";
        System.out.println(Arrays.toString(names));//[Omer Can, Ayse Hanim, Veli Han]

        System.out.println("----------------------------");
        //-----------------------
        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.
        //Example 1: Create a String array, add 5 elements to it, all elements have
        // display the sum of the number of characters it contains.

        String[] cities = new String[5];
        cities[0] = "Bayburt";
        cities[1] = "Sivas";
        cities[2] = "Denizli";
        cities[3] = "Adana";
        cities[4] = "Ankara";

        //---1.yol: for loop
        int totalChar = 0;

        for (int i = 0; i < cities.length; i++){ //burdaki length field'dir .yani alan okuması yapar method değildir.


            totalChar = totalChar + cities[i].length();// burdaki length şu ana kadar bildiğimiz methodtur
                                                        //dinamik bir şekilde illeri saydı.bu string class methodudur.
        }
        System.out.println(totalChar);//30,

        System.out.println("-----------------------------------");
        //-------------------
        //2.yol: for each loop (enhanced - gelistirilmis loop)

        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop'taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w’nun kullanilmasidir. 'w'whatever dan geliyor

/*        for (Datatype variable : array yada collections){
            calisacak kodlar
        }*/

        int sum = 0;

        for(String w :cities){
            sum = sum +w.length();
        }
        System.out.println(sum);//30



    }
}
