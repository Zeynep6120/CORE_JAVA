package d23oop_collections;

public class AudiA4 implements Engine, AC, Brake {

    /*
    a) interface’leri parent yapmak icin ‘implements’ keyword’u child icinde kullanilir


    b) extends kullanilmaz cunku bu iki class arasinda kullanilir

    c) AudiA4 Class’i, Engine interface’i icindeki tum methodlari override etmek zorundadir.

    d) AudiA4 Class’i, Engine interface’i icindeki tum methodlari override etmek zorunda
    oldugundan method’larin bas kismina ‘override’ yazmak gerekmez ama tavsiye edilir.

    e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
    */
//bir class a java da 3 tane parent veremezdik.ama eğer parentlar interface olursa ve implemeent keywordunü kullanırsak
    //bir class a 3 tane parent verebilirz.ama parentların içindeki tüm methodları child yani class kullanmak zorundadir.
    //-----------------------------------


    //Engine interface'inden override edilenler

    @Override
    public void eco(){
        System.out.println("Audi A4 ekonomik motor kullanır");
    }
    @Override
    public void turbo(){
        System.out.println("Audi A4 turbo motor kullanır");
    }

    @Override
    public void gas(){
        System.out.println("Audi A4 benzinli motor kullanır");
    }

    //AC interface'inde override edilenler

    @Override
    public void analog(){
        System.out.println("Audi A4 analog klima kullanır");
    }

    public void dijital(){
        System.out.println("Audi A4 dijital klima kullanır");
    }
//Brake interface'inden override edilenler

    public void abs(){
        System.out.println("Audi A4 abs fren sistemi kullanır");
    }

    public void esp(){
        System.out.println("Audi A4 esp fren sistemi kullanır");
    }
    @Override
    public void run(){
        System.out.println("Audi A4 hava yastığı çalıştırı");
    }

    //ODEV AudiS5 class'ı oluşturup , Engine, AC, Brake, interface'lerini parent olarak belirleyiniz.
}
