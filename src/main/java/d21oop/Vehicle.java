package d21oop;

public class Vehicle {

    /*
    Constructor Hiyerarsisi - Child class'tan bir object oluşturulduğunuzda constructor'lar
    en üstteki parent class'tan başlatılarak alta doğru çalıştırılır
     */
    //bunda bir child obje oluşturduğunda java önce en üsssteki parentın constructorını çalıştırıyor.
    //çünkü child paretın özelliklerini alması gererkir. mesela animla ve cat da önce anımal In constructor ı
    //çalışır çünkü get ondaki methodları da kullanması yani animal ın özelliklerini de alması gerekir.
    //bu nesiller boyu özelliklerin aktarılması demektir

    //Constructor oluşturalım
    public Vehicle(){
        super();//Bu Vehicle constructoru da obje class a çağrı yapar
        System.out.println("Honda,2023, Benzin");
    }
    public Vehicle(String marka,int yil,String motor){
        super();//bu super çağrısı obje class a yapılır.
        System.out.println("Honda,2024,Elektrikli");
    }


}
