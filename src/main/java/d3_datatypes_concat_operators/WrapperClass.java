package d3_datatypes_concat_operators;

public class WrapperClass {
    public static void main(String[] args) {


        /*Java primitive data tiplerine yeni ozellikler(methodlar) ekleyerek yeni bir yapi olusturdu.
        Bu yapiya wrapper class denir.

        Wrapper class’lar, Java'nın primitive veri türlerini object olarak
        temsil etmek için kullandığı class’lardir. Bu özellik, primitive veri türlerini koleksiyonlarda
        (örneğin ArrayList gibi) kullanabilmek için oldukça kullanışlıdır, çünkü Java'da koleksiyonlar
        sadece Object referans türlerini kabul eder. Ayrica en onemlisi girdigimiz veriler uzerinde
        method kullaniminin da yolunu acar.*/


        // Wrapper demek primitive leri class seviyesine çıkarmadır. ve metod kullanımın yolunun açmadır.
        //Wrapper' lar büyük harfle başlar çünkü class'tırlar.
        //Wrapper'lar buyuk harfle baslar cunku class'tirlar.
        // primitive          : char          - boolean - byte - short - int         - long  - float  - double
        //wrapper class       : Character     - Boolean - Byte - Short - Integer     - Long  - Float  - Double

        int i = 12;
        //i. yaptiginizda method acilmaz.

        Integer k = 12;
        //k.yaptigimizda methodlar acilir.

        //--------------------------------------------------
        // Autoboxing- Unboxing
        /*
        Java'da primitive(ilkel) türler ve wrapper sınıfları arasında otomatik dönüşüm yapabilen autoboxing ve unboxing
        mekanizmaları vardır. Autoboxing, primitive bir türü otomatik olaraak onun wroapper sınıfına çevirir. Örneğin,
        long'u Long'a dönüştürür. Unboxing ise tam tersi bir işlem yapar. Long'u long'a dönüştürür. Ikisi de otomatik
        gerçekleşir.
      */
     //primitive türler daha hızlı işlem yapar. wrapper lar  biraz daha yavaştır
        //Wrapper class lar null türleri ile kullanılabilirler. primitibvler null türleri ile kullanılamazlar.
        // ben mesela bir listenin içi boş mu diye kontrol etmek istiyorum.bunun için primitive kullanamayız.
        //ilkel türler null deper alamazlar.bunun için wrapper kullanılır.primitivelr belleği daha az yorar çünkü
        //az gelişmişlerdir. WRapper daha gelişmiş bir yapı olduğundan belleği  daha çok yorar.
        //class türlerine obje türü de denir. çünkü class lardan obje üretiliyor

        // Ornek 1: primitive int' i wrapper Integer 'a çeviriniz.
        // Example 1: Convert primitive int to wrapper Integere.

        int num = 13;

        Integer wrapperNum = num;

        // Ornek 2: Wrapper Byte'i primitive byte'a çeviriniz
        // Example 2: Convert Wrapper Byte to primitive byte

        Byte s = 19;
        byte primitiveS = s;
















    }
}
