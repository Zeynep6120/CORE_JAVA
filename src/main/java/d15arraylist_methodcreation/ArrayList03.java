package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Ornek 1: Bir tane Integer List olusturunuz.Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        // Example 1: Create an Integer List.Write the two closest integers in this List.
        //           [12, 23, 10, 19] ==> 12 ve 10

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println(nums); //[12, 23, 10, 19]
        // 1----------------
        //Collections.sort(nums); //[10, 12, 19, 23]
        //yukarda colleciton un içindeki sort metodunu kullandım.Collections bir yardımcı class tır. Arrays gibi dir
        //bu Collections.sort(nums) methodu diper List çeşitleri ile de kullanılır

        //şimdi de ArrayList in içindeki sort methodunu kullancam
        //yukardaki sort metodu ile burakii sort methodud aynı işi yapıyo küçükten büyüğe sıralıyor
        //yani aralarında fark yok ikisini de kullanabiliriz
        //2---------------
        //1.AŞAMA-------------
        nums.sort(null); //[10, 12, 19, 23]
        //  bu nums.sort(null); sadece ArrayList ler ile kullanılır.

        //2.AŞAMA------------------------------------------------------
        System.out.println(nums); //[10, 12, 19, 23]
        int minDiff = nums.get(1) - nums.get(0); // 12-10=2

        for (int i = 1; i < nums.size(); i++) {

            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));

        }
        System.out.println(minDiff); //2 , minimum farkı bulduk. Bu farkı hangi iki sayıdan elde ettiğimizi bulalım
        //// ODEVVVVVVV!!!!!!!! BU SORU TEK FOR İLE VEYA FOR EACH İLE ÇÖZÜLEBİLİRMİYDİ

        //3.AŞAMA-----------------------------------------------------------------------
        for (int i = 1; i < nums.size(); i++) {//[10, 12, 19, 23]

            if (nums.get(i) - nums.get(i - 1) == minDiff) {
                System.out.println(nums.get(i) + "ve" + nums.get(i - 1));
            }

        }
        //// ODEVVVVVVV!!!!!!!! BU SORU TEK FOR İLE VEYA FOR EACH İLE ÇÖZÜLEBİLİRMİYDİ
    }
}
