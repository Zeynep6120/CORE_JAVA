package d28exception_enum;

import java.util.Arrays;
import java.util.Scanner;

public enum EnumRunner {
    ;

    public static void main(String[] args) {

        //Cities c = new Cities(); HATA- enum'dan object uretilemez

        //1- Enum daki bir sabite nasil ulasabiliriz?
        Cities il = Cities.AKSARAY;
        System.out.println(il);//AKSARAY

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi);//Bursa

        //3-Ankara'nin posta koduna ulaşalım
        String postaKodu = Cities.ANKARA.getPostalCode();
        System.out.println(postaKodu);//06000

        //4-Antalya'nin plaka koduna ulaşalım
        System.out.println(Cities.ANTALYA.getPlateCode());//7

        //5-Kullanıcıdan bir ilin plaka kodunu alarak bunun hangi il olduğunu console a yazdırın

        // values() methodu enum içindeki tüm datalari bir Array içinde bize verir.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen plaka kodunu giriniz");
        int plaka = input.nextInt();

        Cities[] sehirler= Cities.values();
       // System.out.println(Arrays.toString(sehirler));//[ADANA, ADIYAMAN, AFYONKARAHİSAR, AĞRI, AMASYA,.........

        //bir enum doğrudan döngüye sokulabilirmi?

        if(plaka<1 || plaka>81){
            System.out.println("Lütfen 1 ile 81 arasında bir plaka kodu giriniz");
        }else{
            for(Cities w : sehirler){
                if(plaka==w.getPlateCode()){
                    System.out.println("girmiş oluduğunuz plaka "+ w.getCityName()+" iline aittir");
                    break;
                }
            }
        }


    }
}
