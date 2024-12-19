package d21oop;

public class Dog extends Mammal {//Dog sen uzan Mammal a . çünkü senin parent ın Mammal diyoruz

    public void bark(){// bu havlama methodu köpeğe özgüdğr

        System.out.println("Dogs bark.....");
    }
    @Override//Anotation->dipnot bunu //Overide ı yazmak zorunlu değil ama kodun okunurluğunu artırır.
    //overide görünce ben diyorum ki demekki bu parentta olan bir method.
    //şimdi parentın yazdığı kodu modifiye ediyorum gibi oldu.
    public void eat() {
        System.out.println("Dogs eat...");
    }
    //Overide a ihtiyaç duyulmayan yerlerde aşırı kullanımından kaçınılmalıdır.çünkü childı tekrar kalabalıklaştırıyour
    //inhertiance nin amacı zaten classları sadeleştırmektir. ama eğer ihtiyaç varsa override kullan

    @Override
    public Animal create() {
        return new Dog();//Upcasting -Java otomatik yapar
        //child parent'inin data tipini kullanabilir.

        //bunun teknin ismi Upcasting dir yani yukarının kalıbına döktük
        //Ben bir dog objesin oluşturudum Ama dışarıya return ederken
        //Data tipini Animal diye gönderdim.buna yukarının kalıbına dökmek
        //deniyor.Dog u aldı Animal a çevirdi dışarıya verdi
        //yani çocuk babanın data  tipini kullandı.çocuk babasının data tipini
        //kullanabilir.
    }

    @Override
    public int add(int a, int b) {
        //primitive ler arasında parent child ilişkisi yoktur
        //yani primitive lerde return typeı Override yaparken değiştirilimez
        //yukardaki Animal dog gibi bir şey burda yapılmaz
        return a + b;
    }
    //primitive veri türeleri arasında bir inheritance yani akrabalık bağı
    //yoktur.çünkü bunlar class değilki.int long short byte ın arasında
    //bir parent child ilişkisi yoktur


}
