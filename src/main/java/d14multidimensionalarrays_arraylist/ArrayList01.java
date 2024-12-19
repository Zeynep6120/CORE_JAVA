package d14multidimensionalarrays_arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        /*ArrayList, dinamik boyutlu bir array’dir; eleman ekleyip çıkarırken boyutu otomatik olarak ayarlanır.
         Gerçek hayatta bir alışveriş listesi gibi düşünülebilir.
         Alışveriş listesi, ürün isimlerini içerir ve bu isimler String türündedir.*/

        /*
        1)Array’ler primitive data type’lari ve reference’lari depolayabilir ama Arraylist’ler
        non-primitive’leri (reference’lari) depolar
        2)ArrayListler memory’de Array’lerden daha fazla yer kaplar
        3)Array’ler olusturulurken bastan eleman sayisini belirtmek zorundayiz
        4)ArrayList’ler eleman sayisinda esnektirler.

        5) Array’leri Java niye iptal etmedi?
            a) Array’ler cok daha hizlidir
            b) Array’ler memory’de cok az yer kaplarlar
            c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array’ler tercih edilir

        6) Java’da generic (kapsamli) türler (<> ile belirtilen türler) için yalnızca referans
        veri türleri kullanılabilir. Primitive veri türleri (örneğin int, char, boolean, double, vb.)
         doğrudan generic türlerin içine yerleştirilemez. Bu nedenle, özel bir durumla karşılaştığınızda,
         bu türleri ilgili sınıflarla sarmalamanız (wrapper) gerekir.
        */

        //Java 7: Programlama dilinin sürümüdür.
        //JDK 7: Java 7 ile yazılım geliştirmek için kullanılan araç setidir.

        //ArrayList nasil olusturulur?
        //ArrayList<Integer> ages = new ArrayList<Integer>(); //Java 6 ve oncesi
        ArrayList<Integer> ages = new ArrayList<>(); //Java 7 ve sonrasi -type inference -tip cikarimi
        //sağ taraf soldan tipi alıyo o yüzden artık içinde integer gibi belirtme kaldırıldı.

        //------------------
        //ArrayList'lere eleman nasil eklenir?

        //add() metodu, ArrayList'e yeni bir eleman eklemek için kullanılır ve
        // eklenen elemanı listenin sonuna yerleştirir.
        //Arraylist bir classtır.Array bir objedir yani özel bir yapılanmadır class değildir.
        //ArrayList list interface ini kullanan bir classtır.
        //ArrayList de toString ya da DeepToString gibi herhangi methoda ihtiyaç yoktur doğrudan yazdırılır.yani Arrayler gibi
        //değiller
        ages.add(9);
        ages.add(12);
        ages.add(5);
        System.out.println(ages);//[9,12,5]

        //List' te araya eleman eklemek için index numarsini yazariz
        ages.add(1, 28);
        System.out.println(ages); //[9, 28, 12, 5]

        //add(int index, E element): Bu metot, belirtilen elemanı ArrayList'in belirtilen konumuna ekler.
        // Mevcut elemanlar sağa kaydırılır.

        ages.add(3, 7);
        System.out.println(ages);//[9, 28, 12, 7, 5]
        //eklemek istediğin indexi yazıyoruz önce ve eklemek istediğiniz sayıyı yazıyoruz.o sayı o indexe yerleşiyor
        // ve önceden o indexte bulunan sayı bir sağa kaymış oluyor

       /* ages.add(5,11);
        System.out.println(ages); //[9, 28, 12, 7, 5, 11] */// BURAYIII SORRRRR

        //doğrudan add methodu ile ekleme yapınca o sayıyı sona atıyor.
        ages.add(11);
        System.out.println(ages); //[9, 28, 12, 7, 5, 11]


        //----------------------------------------
        //Ornek 1: Verilen Integer List'i, ages List'ini içine koyunuz.
        //Example 1: Put the Integer List into the ages List

        //addAll() metodu, bir koleksiyondaki tüm öğeleri mevcut ArrayList'e eklemek için kullanılır.
        // Bu metod, genellikle bir ArrayList'i başka bir koleksiyonun öğeleriyle genişletmek
        // istediğinizde kullanışlıdır.

        //addAll(int index, Collection<? extends E> c): Bu metod, belirtilen koleksiyondaki tüm öğeleri ArrayList'in
        // belirtilen indeksinden başlayarak ekler. Bu işlem sırasında, var olan öğeler sağa kaydırılır.

        ArrayList<Integer> newAges = new ArrayList<>();
        //ArrayList lerin içine primitive halini yazamazsın wrapper  hallerini yazmak zorundasın
        // bunlar gelişmiş yapılar primitive ile değil non-primitive ile çalışıyorlar.

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges);
        System.out.println(ages);//[9, 28, 12, 7, 5, 11, 1, 2, 3]

        ages.addAll(0, newAges);
        System.out.println(ages);//[1, 2, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]
        //agesin değişen haline ekleme yapıldı. çünkü java yukardan aşağı işlem yapar

        //-----------------------------------
        //-------------------
        //size() metodu, ArrayList'teki öğelerin sayısını döndürür. (int return eder)
        //Array deki length ArrayList teki size metoduna denk geliyor. yani ArrayList in boyutunu almak için size kullanılır
        // size ArrayListin içindeki eleman sayısını sayar ve bana integer bir değer verir.

        int totalElement = ages.size();//[1, 2, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]
        System.out.println(totalElement);//12

        //-----------------------------------------
        //get(int index) metodu, ArrayList'te belirli bir konumdaki ogeye erismek icin kullanilir.
        // bu get i getir gibi düşün biz içine bir index veririz be get metodu bize o index deki elemanı bize getirir.

        int element = ages.get(3);//[1, 2, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]7
        System.out.println(element); //9  3.index teki elemanı getirdi.

        //-----------------------------------------------------------
        //-------------------
        //set(int index, E element) metodu, ArrayList'te belirtilen indeksteki öğeyi verilen
        //set metodu bir indexin değerini değiştirmek için kullanılır.
        // yeni öğeyle değiştirir.
        // Bu metot, listedeki bir öğeyi güncellemek için kullanılır. Metot, eski öğeyi döndürür.

        int a = ages.set(1, 25);
        System.out.println(a);//2 , eski değeri gösterdi yani set methodunun değiştireceği değer.yani bize geri bildirim yapıyor
        //biz dedikki 1. indexteki elemanı 25 yap o da gitti 1. indexe baktı ve orda 2 varmış geldi bize
        //yani burda komut doğrulaması yaptı
        //dedi ben 2 yi değiştiricem biz de diyoruz ki tamam değiştir.
        System.out.println(ages);//[1, 25, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]


    }
}
