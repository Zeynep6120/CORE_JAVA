package d15arraylist_methodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

           /*Java da Method Olusturma: Java’da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.
        Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir
        ve bu iç class’in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde
        geçerli ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz. */

        //java da bir method içinde başka bir method olmaz
        //java da method içinde class oluşturulabilir.
        /* Method Creation - Metot Olusturma
        Java'da method nasil olusturulur?

        1- main method'un disinda, class'in icinde olusturulur
        2- Syntax'i: Access Modifier + Return Type + Method ismi + () + {}
        3- Olusturulan method nasil kullanilir?
            Main icinden method cagrisi yapilmalidir. Buna Method Call denir.*/

        int result = sum(3, 5);//arguman
        //burdaki sum in iki görevi var 1. aşağıdaki methoda verileri göndermek.2. ise sonucu içinde tutmaktır
        System.out.println("result = " + result);//8

        //method call da yani main in içinde çağrılan methodlarda iki görev vardı
        //1- methoda değerleri göndermek
        //2. sonucu içinde tutmak ama bu int string gibi data tipine sahip methodlar için geçerlidir.

        // return==> çağrıldığı yere sonucu geri gönder demek.

    }
    //main disi

    // ornek 1: Toplama yapan bir method olusturunuz.
    // Example 1: Create a method that performs addition

    //1- main metodunda sum(3, 5) çağrısında 3 ve 5 değerleri argümanlardır.
    // 2- sum metodunun tanımında a ve b parametrelerdir.

    //aşağıda bir int gibi data belirttiysek bir değer döndürecez demektir bir yere return yaz demek
    //static class tan obje üretmeden çağrılabilir demek.
    public static int sum(int a, int b) { //parametre
        return a + b;
    }

}
