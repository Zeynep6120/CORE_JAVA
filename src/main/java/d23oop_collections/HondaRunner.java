package d23oop_collections;

public class HondaRunner {
    public static void main(String[] args) {

       // Honda h= new Honda(); //Abstract class lardan obje üretilemez.çünkü sınıflandırma için üretildi

        Civic c= new Civic();
        c.engine();//Gas 1.6 Eco //içindeki bildi Civic in Override ından geldi.
        //engine in içindeki bilgi civic class ının içinde override edilen engine methodundan geldi.Honda classında
        //oluşan engine methodu abstract bir methodur .ne yapacağını söyler yani al engine methodunu kullan der
        //ama engine methodunu nasıl kullanacağımızı söylemez.biz bunu civic classında override ederek nasıl kullanacağımıza
        //karar verdik ve burda obje oluşturup çağırdık.

        //Abstrac mantığında şu vardır body siz olan methodu kaç tane child varsa kullanır.override ederek kullanmak zorunda.

        Accord a =new Accord();
        a.engine();//Gas 2.0 Turbo

        a.music();//Pro .bu bilgi direct parent tan geldi çünkü music methodu override edilmedi
    }
}
