package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {

         /*
        Polymorphism:
        Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)

        OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
        Polymorphism (cok bicimlilik) demektir.
        Bir method’u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde
         calistirabilmek icin kullanilir.
        */

        /* i.Method Overloading : Java'da Method Overloading (Metot Aşırı Yükleme), aynı class içerisinde
        aynı isme sahip ancak farklı parametre listelerine sahip birden fazla metodun tanımlanması işlemidir.*/

        //String s = "Java";
        //s.substring(int beginIndex); ==> tek parametre aliyor
        //s.substring(int beginIndex, int endIndex); ==> iki parametre aliyor

        add(3.5, 5);


        //------------------
        //String s = "Java"; bu string classında bir objedir
        //s.substring(); substring methodu non-static bir metottur. Bu metot bir String objesi uzerinden cagirilir
        //YANİ substring methodunu String classı üzerinden  çağıramayız. illa bir obje oluşturup onun üzerinden
        //bu metodu çağırabiliriz.böyle methodlara non-static method deriz.yani bir obje üzerinden çağrılan
        //methodlar non-static methotdur.

        //Math.min();==> min methodu static bir metottur. Bu metot class uzerinden cagirilir.Burda min methodunu
        //class adıyla çağırabildik.static methodlara class a ait method denir. ve class ile çağrılır.Böyle methodlara
        //static  method denir.


    }//main dışı
    //overload işleminde method isimleri aynıdır.

    //ornek 1 : Toplama islemi yapan bir method olusturun ve sonra da overload edin.
    //example 1 : A method that performs an addition operation create and then overload

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    //data tipini değiştirdiğim için java bunu yeni bir method saydı
    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b);
    }
    //AW ==>audowiding memory alanını genişletme mesela double int den büyüktür o yüzden int double dönüşeceği
    //zaman memory alanın genişletir yanı audowiding yapar
    //java daraltmayı otomatik yapmaz mesela double int e koymaya çalışırsak hata alırız.

    //Method + Parametre = Method Signature (Metot imzasi)
    //Method Signature, bizim imzamiz gibi benzersiz olmalidir

    //-----------------
       /* Method Overloading'de sadece parametreler degistirilir.
   Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.

    Method Overloading icin;
    a) Parametre sayisini degistirebilirsiniz.
    b) Parametre data tiplerini degistirebilirsiniz.
    c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
    d) Method overloading olustururken return type’in, access modifier’in,
       static veya non-static olmanin hicbir etkisi yoktur.
       */

    //-----------------
    /*
    Soru 1: private method'lar overload edilebilir mi?

    Cevap 1: private method'lar overload edilebilirler cunku;
    overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
    ulasilabilir oldugundan overload'a engel degildir.

    Soru 2: static method'lar overload edilebilir mi?
    Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.

    */

}
