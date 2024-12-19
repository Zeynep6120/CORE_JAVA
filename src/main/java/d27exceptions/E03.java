package d27exceptions;

public class E03 {
    public static void main(String[] args) {


        //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        selectChar(s, 4);

    }//main dışı

    public static void selectChar(String s, int idx) {

        try {
            char ch = s.charAt(idx);//charAt methoduna index i biz yazarız o bize karakter getirir
            System.out.println(ch);//v
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("olmayan index kullanmayınız " + e.getMessage());//olmayan index kullanmayınız String index out of range: 4
            //System.error.println.bunun ile java consola kırmızı yazı yazdırır.

            e.printStackTrace(); //kod yazan hatayı görmek isterse yazar.exceptionu gösterir ama fırlatmaz.
            //yani ayrıntı merak ettiğimiz için printStackTrace() i kullanırız.kodlar alttan çalışmaya
            //devam eder.
            //hata oluşturmaz .ama eğer hata oluşssaydı nasıl görünürdüyü bize gösterir.yani throw yapmıyor
        }
        System.out.println("App çalışıyor");
    }
}
