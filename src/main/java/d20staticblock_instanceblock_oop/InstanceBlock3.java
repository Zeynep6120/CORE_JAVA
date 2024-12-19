package d20staticblock_instanceblock_oop;

public class InstanceBlock3 {

    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
    //Example 3: In a car factory, each car is black in colour and the fuel type is petrol.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)
    public String color;

    public String fuelType;

    //Instance Block - bu class'tan her object oluşturulduğunda çalışır{
    //------------------------------------------------
    {
        color = "Siyah";// her objede araba siyah olur
        fuelType = "Benzin";// her objede arabaanın yakıt tipi benzin olacak
    }
    //---------------------------------------------------------------------

    //Constructor- Class'ın objeleri olluşturulduğunda çalışır.
    //constructor ismi hangi classın içinde isen onun ismi olur

    public InstanceBlock3() {
        System.out.println("Araba rengi : " + color);
        System.out.println("Araba yakit türü : " + fuelType);
    }

    //Default olarak siyah ve benzinle başlatmak istemezsek parametreli constructor oluştururuz!!!!!!!!!!!!
    //Paramaterli Constructor oluşturalım
    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }
}
