package d27exceptions;

public class E02 {
    public static void main(String[] args) {
        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
        String s = "1234a";
        convertStringtoInt(s);
        //string i integere ya da integer i string e dönüştürmek gibi dönüşümler sırasında.özellikle bir metni sayısal bir
        //değere dönüştürmeye çalışırken kod yazan exception u öngörüğ try catch yapmalı


    }//main dışı

    public static void convertStringtoInt(String s) {
        try {
            int intS = Integer.valueOf(s);//bu method s deki tırnakları kaldırıp s yi integer yapacak
            System.out.println(intS + 1);
        } catch (NumberFormatException e) {
            System.out.println("dönüşüm için rakam dışı karakter kullanmayınız... " + e.getMessage());
        }
    }
}
