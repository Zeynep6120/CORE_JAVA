package d6if_switch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {


        /*Yeni switch ifadesi, daha esnek ve güçlü bir yapı sunarak, geleneksel switch-case
        yapısının daha temiz ve ifade edilebilir hale getirilmesini sağlar.

        Ayrıca, daha önceki switch yapısı değer döndürmezken, yeni switch ifadesi bir değer döndürebilir
         ve bu değer doğrudan bir değişkene atanabilir.

        Yeni switch ifadesinin ana özellikleri:

        Case değerleri: Birden fazla case ifadesini tek bir işlemle birleştirme imkanı.
        Arrow (->) Operatörü: Geleneksel break yerine kullanılarak, kodun daha okunabilir olmasını sağlar.*/

        //--------------------------------------------
        /*Ornek 1:  Kullanıcıdan bir ay numarası girmesini isteyin (1 ile 12 arasında).
        Girilen ay numarasına göre mevsimi belirleyen ve sonucu konsola yazdıran bir program yazınız.*/

        /*Example 1: Ask the user to enter a month number (between 1 and 12).
                Write a program that determines the season according to the entered month number and prints the result to the console.*/


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Ay Numarasını giriniz");
        int month = scanner.nextInt();

        String season = switch(month){
          case 12,1,2 -> "Kis";
          case 3,4,5 ->"Ilkbahar";
          case 6,7,8 -> "Sonbahar";
          case 9,10,11 ->"Yaz";
          default -> "Bilinmeyen ay";
        };

        System.out.println("Mevsim:  " + season);

        scanner.close();//Scanner objesini kapattik.
        // NOT------------------
        // import java.util.Scanner;
       // scanner.close();//scanner objesi ile işim bittiği için Scanner classını kapattım.import demek ben o kütüphaneye
        //elektirik kablosu attım ve kütüphane ve opje arasına bağlantıyı çektim.ama şimdi ktüphane ile işim bitti
        //bu kütüphaneyi kapatmak best practistir.yani ktüp ile scanner objesi ile arasındaki bağlantıyı koparttım
        // gereksiz ağ bağlantıları sistemi yorar.
        //şimdi scanner objesini kapatıık ve artık ona erişimimz yok mesela scanner.open diye bir şey yok yeniden obje
        // oluşturmamız lazım. best practise demek herkes yazmayabilir . ama yazılsa iyi olur demek.
    }
}
