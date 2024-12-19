package d9string_loops;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

        1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        3- Başında ve sonunda boşluk olmamalıdır.*/

        /*Example 1: Check if a password has the following conditions.

        1- The password must contain at least one character, nothing must be entered.
        2- The characters must not only consist of (space) characters, but also non-space characters.
        3- There should be no spaces at the beginning and end.*/

        //Not: isEmpty() metodu sadece hicligi kontrol eder (true verir).
        //isEmpty() true verirse kullanıcı enter ile geçmeye çalışıyordur.
        //isBlank() metodu ise hem hicligi hem de space'i kontrol eder(true verir)
        //isBlank() true veriyor ise kullanıcı ya space e basmıştır ya da space a basıp enter e basmıştır.
        //------------------
        //1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.

        String pwd = "a";
         boolean first = pwd.isEmpty();// isEmpty() bu method hiçliği kontol ediyor ver eğer şifrenin içi boş ise true verir
        System.out.println("first = " + first);
         //"" bu şu anlama geliyor kullanıcı entera basıp geçmeye çalışıyor.
        //" " bu da kullanıcı space basmış demek.

        //2-Karakterler sadece (space) boşlık karakterlerden ibaret olmamalı,
        //space harici karakterlerde bulunmalidir.

        boolean second = pwd.isBlank();
        System.out.println("second = " + second);

        //3-Başında ve sonunda boşluk olmamalıdır
        boolean third = pwd.trim().equals(pwd);
        System.out.println(third);

        if(first){
            System.out.println("Parola hiç bir şey yazmadan geçilemez");
        }
        if(second){
            System.out.println("Parola boş bırakılmamalı ve boşluk haricei karakterlerde bulunmalıdır");
        }
        if(!third){
            System.out.println("Parolanın başında ya da sonunda boşluk bırakılmamalıdır");
        }



















    }
}
