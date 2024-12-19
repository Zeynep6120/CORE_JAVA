package d8stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {


        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        //Example 1: Find the total price of the following products.
        //String tv = "$456.99"; String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        //valueOf() : Belirtilen String'i Double'a cevirir
        //bu metodun stringi double a çevirmek için stringin içinde sadece double olması lazım,
        //o yüzden ilk başta stringin içindeki dolar işaretini sildik sonra double çevirdik
        // bunun içinde wrapper olan Double kullandık o yüzden d harfi büyük yazıldı.çünkü metodlar wrapperlar ile
        // kullanılıyor.

        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");
        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println("totalPrice = " + totalPrice);//1332.98
        //--------------------------------------


        //---------------------
        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console'a yazdiriniz.
        //           "   ali cAN   " ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console.

        //trim() metodu bir String'deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String'i istediginiz karakterden parcalamaya yarar.
        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna "method chain (zincir)" denir

        String name = "   ali cAN   ";
        char first = name.trim().toUpperCase().charAt(0);
        //method chain de en son methodun dönüş tipine göre açılır. burda en son method char olduğu için first char yaptık
        System.out.println(first);//A;

       char last =name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("last = " + last);

        System.out.println(first + last);// bu ikisini birbirine yapıştırdığımda ASKII kode bakar ve toplama yapar sonucu 132
                                            //bulur.
        System.out.println(""+first+last);


    }
}
