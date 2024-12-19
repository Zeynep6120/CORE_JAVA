package d23oop_collections;

public class AudiRunner {
    public static void main (String[]args){

    //Engine e = new Engine(); //HATA, interface'lerden object uretilmez

    AudiA4 a4 = new AudiA4();
    a4.turbo();//Audi A4 turbo motor kullanır
    a4.esp();// Audi A4 esp fren sistemi kullanır
    a4.dijital();//Audi A4 dijital klima kullanır
        //javada muliptle inheritance yani çoklu parent için ihtiyaç duyulmuş.
    a4.run();//Audi A4 hava yastığı çalıştırı

        System.out.println(Engine.fiyat);//300
        System.out.println(AC.fiyat);//200
        System.out.println(Brake.fiyat);//100

        //yukarda fiyat değişkenin çağırıken karışıklık olmamsını nedeni
        //fiyat değişkenin statik olup interface adı ile ulaşıldığı için.

        Engine.speed();//Saatte 300km
        a4.power();//200HP




    }
}
