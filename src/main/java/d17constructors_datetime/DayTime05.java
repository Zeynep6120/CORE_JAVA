package d17constructors_datetime;

import java.time.LocalDate;
import java.time.Period;

public class DayTime05 {
    public static void main(String[] args) {

        //ornek 2: Verilen iki tarih arasindaki farki hesaplayan kodu yaziniz.
        //example 2: Write the code that calculates the difference between two given dates.

        //Java'da Period class’i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.
        // Bu sınıf, iki LocalDate nesnesi arasındaki zaman farkını ifade eder ve java.time paketi içinde yer alır.
        // Period sınıfı, tarihler arasındaki farkları kolayca yönetmek ve manipüle etmek için çeşitli metodlar sağlar.

        //Kullanım Alanları
        //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period nesnesi olarak döndürür.

        LocalDate date1 = LocalDate.of(2002, 5, 14);
        LocalDate date2 = LocalDate.of(2024, 10, 7);

        Period difference = Period.between(date1, date2); //ben bunu period nesnesi ile karşılıcam.bir int dondurmuyor yani
        //period da bir data tipidir.
        System.out.println(difference); //P-22Y-4M-24D Period classı kullandığı format budur
        //  22 yıl 4 ay 24 gün demek açılımı böyledir

        //Ayri ayrı görelim
        int yearDifference = difference.getYears();
        int monthDifference = difference.getMonths();
        int dayDifference = difference.getDays();

        System.out.println(date2 + " ve " + date1 + " arasındaki fark "); //2024-10-07 ve 2002-05-14 arasındaki fark
        System.out.println("Yıl : " + yearDifference); //Yıl : 22
        System.out.println("Ay : " + monthDifference); //Ay : 4
        System.out.println("Gün : " + dayDifference); //Gün : 23

        //Instant
        //ZonedDateTime
        //Duration
        //Clock

        //https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html


    }
}
