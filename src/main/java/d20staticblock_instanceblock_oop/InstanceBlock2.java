package d20staticblock_instanceblock_oop;

public class InstanceBlock2 {
    //eğer tüm constructorların içinde çalışması gereken kod varsa tekrardan kurtulmak için bu kodları
    //instance block içine yerleştiririz.constructor farklı farlı ürünler ortaya çıkarmak içindi
    //eğer tüm constructorların içinde çalışması gereken aynı kodlar var ise mesela 5 tane constructorm var ise
//ve hepsine aynı kodları yazma .instance block oluştur ve tekrar eden kodları bunu içine al

public int year;
//instance block
    {
        System.out.println("Herkese Selam");
    }


    public InstanceBlock2() {
       //Buradaki sout u silip instance block içine aldık
    }

    public InstanceBlock2(int year) {

        //Buradaki sout u silip instance block içine aldık


        //instance block un içinde değişken tanımlanabiliyor.staticin içinde tanımlanmıyordu.ama sadece onun içinde geçerlı
        // oluyor yani local bir değişken olmuş oluyor.
        //staticin içinde sadece değişken ataması olur.değişken direct staticin içinde oluşturulmaz
        this.year = year;
    }
}
