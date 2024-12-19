package d17constructors_datetime;


public class CarRunner {
    //burdaki Runner bize main içeren bir class olduğunu ifade ediyor.


    public static void main(String[] args) {

        //4- Car class'indan bir object ureteli

        //9- Default Car() icine parametre girelim
        // ben costum bir constructor oluşturduğumda default olanı java otomatik sildiği için .benden aşağıda parametre istedi

        Car c1 = new Car("BMW", "3.20", 2024, false);

        System.out.println(c1.brand);//Honda   //BMW
        System.out.println(c1.model);//Accord   //3.20
        System.out.println(c1.year);//2023      //2024
        System.out.println(c1.hybrid);//true    //false

        //bu şu an orjinal değil kalıptan üretilen bir ürün
        //yani bu şu an orjinal değil kopya
        //burda hondanın kalıbından hondanın objesini ürettik
        //burda kalıp kısmı bitti fabrikadaki ilk araba üretildi gibi düşün bunu.yani kalıptan ilk
        //araba ortaya çıktı diyebiliriz.

        c1.action(); //Honda hızlı hareket eder.    //BMW hizli hareket eder
        c1.stop(); //Honda güvenli bir şekilde durur    //BMW güvenli bir şekilde durur.
        //işte bir tane kalıp çok ürün böyle ortaya çıkıyor.

        //5- Car class'a donup, constructor olusturalim

        //10 - Baska bir object üretelim ve direkt objeyi yazdiralim

        Car c2 = new Car("Audi", "A4", 2018, false);
        System.out.println(c1); //reference alindı.   //Car{brand='BMW', model='3.20', year=2024, hybrid=false}
        // yani adress alındı  //Car{brand='Audi', model='A4', year=2018, hybrid=false}

        System.out.println(c2);//reference alindı


        //11- Reference durumunu düzeltmek için Car class'a tostring methodu ekleyelim

        //Java’da toString metodu genellikle bir nesnenin(objenin)
        // içeriğini okunabilir bir String olarak döndürmek için kullanılır.

        //16- Yeni bir obje üretelim-SON
        Car c3 = new Car("Tofas", "Sahin");
        System.out.println(c3);//Car{brand='Tofas', model='Sahin', year=2023, hybrid=true}


    }
}
