package d17constructors_datetime;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {


        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        //Example 1: If the date you have received from the user is in the past, give the message "You have entered an invalid date".
        //If the date you have received from the user is in the future, say "You can enter the time".

        Scanner input = new Scanner(System.in);
        LocalDate givenDate = null;  // LocalDate givenDate;   bu ikisini de kullanabiliriz. boş başlattım birazdan
        //kullanıcı girecek demek.

        while (true) {//sonsuz döngü oluşturdum içten kırılmadığı sürece sürekli çalışıcak

            System.out.println("Lütfen yılı giriniz");
            int year = input.nextInt();

            System.out.println("Lütfen ayı giriniz");
            int month = input.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Ay 1 ile 12 arasında olmalıdır tekrar deneyiniz");
                continue; //kullanıcıyı döngünün başına yönlendirir
            }

            System.out.println("Lütfen günü giriniz");
            int day = input.nextInt();

            //Ayin kaç çektiğini bulalım. Yıl ve Ay için YearMonth objesi oluşturalım
            //YearMonth diye bir class var onun objesindenoluşturmamız lazım

            YearMonth yearMonth = YearMonth.of(year, month);
            //burda kullanıcının girdiği yıl ve ayı yearMonth objesine verdik o ayın kaç çektiğini bulacak
            //yani o yılın o ayı kaç çekiyo bunu bulacak

            //Ayin maksimum gün sayısını bulalım
            int daysIntMonth = yearMonth.lengthOfMonth();
            //yukardaki gibi bazı objeler oluşturuken new kullanmıyoz arka planda obje oluşuyor .bu statik medhotlarda olur.

            if(day<1 || day>daysIntMonth){
                System.out.println("Girilen ay için geçersiz gün.tekrar deneyiniz");
                continue;
            }
            givenDate=LocalDate.of(year,month,day);// Girilen bilgiler ile tarih oluşturduk.

            if(givenDate.isBefore(LocalDate.now())){
                System.out.println("Geçersizi geçmiş bir tarih girdiniz.Tekrar deneyiniz");
            }else{
                System.out.println("zamanı girebilirsiniz");
                break; //geçerli tarih girildiği için döngüyü kırdık
            }

        }
        //break'te buradaki kodlar calisir
        //return icinde bulundugu metodu sonlandirir. Burada main metodu sonlandirir ve
        //programin calismasi durur
        //break yazılırsa break ten sonraki kodlar çalışmaya devam eder.
        //break calisirsa buraya gelir, buradan sonra kod varsa, o kodlar calisir.
        //return calistirildiginda, metodun geri kalan kismi yurutulmez ve metottan cikilir.
        //yani return dişarı ürün vermek için methodu komple sonlandırır.
        // eğer return mainin içindeyse. main zaten motor .motoru durduruyor ve programın çalışması durur.
        // main durmasi programin calismasinin durmasi anlamina gelir.


    }
}
