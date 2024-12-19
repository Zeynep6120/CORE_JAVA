package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodCreation02 {
    public static void main(String[] args) {

        int result1 = multiply(3, 5);
        System.out.println("result1 = " + result1);

        int result2 = firstTwoMultiplyThirdAdd(4, 4, 2);
        System.out.println("result2 = " + result2);

        //String s = print("Ali Can"); bu HATALI ÇÜNKÜ void bir şeye yüklenmez doğrudan çağrı yapar.
        //çünkü void bir değer döndürmez direkt konsola yazdırır.o yüzden bir şeye yüklemeye gerek yok
        // ben string bir parametre gönderdiğim zaman o method geri bana bir şey göndermicek
        //sadece kosola yazdırıcak.yani void bir ürün dışarı çıkarmıcak. void olan methodlar dışarıya ürün vermez
        print("Ali Can");

    }//main disi
    //ornek 1: iki sayi carpan bir method oluşturunuz
    //example 1: Create a method that multiplies two numbers

    //protected: Bu class'tan erisilebilir.
    //Bir de sadece miras alinan class’lardan erisilebilir(extends)

    //bir class ın içinde bir main birden fazla method oluşabilir.
    protected static int multiply(int a, int b) {
        return a * b;
    }

    //-------------------
    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz.
    //example 2: Create a method that multiplies the first two of the given 3 numbers
    // and adds the result with the third number.

    //private : Buraya sadece ayni class icerisinden erisilebilir.Diger class'lar erisemez

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;

    }

    //-------------------
    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
    //example 3: Create a method that prints an entered word to the console

    //Eger bir method yeni bir data uretmiyor ise return type'i void olur.void ise return yazilmaz

    public static void print(String str) {
        System.out.println(str);
    }

}
