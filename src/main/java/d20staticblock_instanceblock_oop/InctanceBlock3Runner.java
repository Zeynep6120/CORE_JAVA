package d20staticblock_instanceblock_oop;

public class InctanceBlock3Runner {
    public static void main(String[] args) {
        InstanceBlock3 car1 = new InstanceBlock3();
        /*Araba rengi : Siyah
        Araba yakit türü : Benzin*/
        System.out.println("---------------------------------");
        InstanceBlock3 car2 = new InstanceBlock3();
       /* Araba rengi : Siyah
        Araba yakit türü : Benzin*/

        //Bir veya daha çok object(instance) daha üretsem o da siyah ve  benzinli olur

        //yeter artık sürekli siyah ve benzinli araba oluşturduk artık farklı bir şey istersem bu durum
        //Ancak Constructor lar ile özelleştirilebilir

        System.out.println("---------------------------------");
        InstanceBlock3 car3 = new InstanceBlock3("Kırmızı", "Dizel");
        System.out.println("Araba rengi: " + car3.color);//Araba rengi: Kırmızı
        System.out.println("Araba Yakıt Türü: " + car3.fuelType);//Araba Yakıt Türü: Dizel

        System.out.println("---------------------------------");
        InstanceBlock3 car4 = new InstanceBlock3();
        //Araba rengi : Siyah
        //Araba yakit türü : Benzin
        // tekrardan bir parametresiz bir obje oluşturusak yine orjinal değerlerine döner
    }
}
