package d16methodcreation_overloading_varargs_passbyvalue;

public class CarRunner {
    //burdaki Runner bize main içeren bir class olduğunu ifade ediyor.

    //4- Car class'indan bir object ureteli
    public static void main(String[] args) {

        Car c1 = new Car();

        System.out.println(c1.brand);// Honda //burda hondanın kalıbından hondanın objesini ürettik
        //burda kalıp kısmı bitti fabrikadaki ilk araba üretildi gibi düşün bunu.yani kalıptan ilk
        //araba ortaya çıktı diyebiliriz.
        System.out.println(c1.model);//Accord
        System.out.println(c1.year);//2023
        System.out.println(c1.hybrid);//true
        //bu şu an orjinal değil kalıptan üretilen bir ürün
        //yani bu şu an orjinal değil kopya

        c1.action(); //Honda hızlı hareket eder.
        c1.stop(); //Honda güvenli bir şekilde durur

        //5- Car class'a donup, constructor olusturalim

    }
}
