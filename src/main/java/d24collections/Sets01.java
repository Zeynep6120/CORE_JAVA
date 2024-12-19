package d24collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets01 {

    public static void main(String[] args) {
        //Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no

        /*Java’da üç tür set vardır:
        1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null’i eleman olarak kabul ederler */

        //-----Ek bilgi - Hash Code gormek istersek;
        String a = "Aliye Canan";
        System.out.println(a.hashCode());//hashcode'ları benzersiz (unique) değiller
        //-------------

        /*2) LinkedHashSet: Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

        3) TreeSet: Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir Sorted Set’tir.*/

        //-------------------------

        //HashSet nasil olusturulur?

        HashSet<String> hs= new HashSet<>();
        System.out.println(hs);//[]
        hs.add("Sinan");
        hs.add("kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);//[kerem, Sinan, Tuba, Onur] //hashset karışık tutar
        hs.add("Kerem");//tekrarlı eleman hata vermez,üzerine yazar.
        System.out.println(hs);//[Kerem, kerem, Sinan, Tuba, Onur]
        //iki tane tekrarlı eleman olduğunda hata vermez üzerine yazar

        hs.add(null);//
        System.out.println(hs);//[Kerem, null, kerem, Sinan, Tuba, Onur]

        hs.add(null);
        System.out.println(hs);//[Kerem, null, kerem, Sinan, Tuba, Onur]
        //hashSet null ı değer olarak gördü ve üzerine yazdı.burda contains kullanarak veri
        //girişlerinde birilerinin boş geçip geçmediğini .yani değer girip girmediğini kontrol edebiliriz.çünkü değer girilmeyip
        //enter a basılırsa otomatikmen null değeri girilmiş olur.yani benim verisi olmayan bir verim varmı diye bakabiliriz.

        //-------------------------
        //LinkedHashSet nasil oluşturulur?

        LinkedHashSet<Integer>lhs = new LinkedHashSet<>();
        lhs.add(14);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs);//[14, 19, 7, 1, null] - insertion order - ekleme sırası

        LinkedHashSet<Integer>ls = new LinkedHashSet<>();
        ls.add(14);
        ls.add(19);
        ls.add(17);
        ls.add(11);
        System.out.println(ls);//[14, 19, 17, 11]

        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.

        lhs.retainAll(ls);//lhs ye bak ortaklarını al ls ile
        System.out.println(lhs);//[14,19]
        System.out.println(ls);//[14, 19, 17, 11]

        //ODEV: Farkli olanlari bulan bir metot var mi?

        //-----------------------------
        //TreeSet nasil olusturulur?

        TreeSet<Character> ts= new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
      //  ts.add(null); HATA, null koymazsınız.sıralama ile alakalı bir durum.null ı eleman olarak kabul etmiyor
        //çünkü null ın doğal sıralaması yoktur. yani a ile b  mi c ile de mi arasına koyacak bilmediğinden
        //null ı direkt kabul etmiyor.
        System.out.println(ts);//[A, G, R, U, Z] -natural order  - A'dan Z'ye

        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.

         SortedSet<Character>ss=ts.subSet('G','U'); //ilk karakter dahil ikincisi hariç
        System.out.println(ss);//[G, R]



















    }
}
