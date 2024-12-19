package d14multidimensionalarrays_arraylist;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {

        //Ornek 1: Iki boyutlu bir Array'i tek boyutlu bir Array'e ceviriniz.
        //Example 1: Convert a two-dimensional Array to a one-dimensional Array.
        // int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }

        //-----------------------
        //1.adim: Iki boyutlu bir Array'de kac eleman oldugunu bulan kodu yazalim
        int[][] numbers = {{5, 4}, {2, 3, 2}};
        int totalNumberOfElement = 0;

        for (int[] w : numbers) {//{{5, 4}, {2, 3, 2}}

            totalNumberOfElement = totalNumberOfElement + w.length;

        }
        System.out.println("totalNumberOfElement = " + totalNumberOfElement); //5

        //------------------------------------------
        //2.adım : Tek boyutlu Array'i, iki boyutlu Array'in eleman sayisini kullanarak oluşturalım
        int[] newArr = new int[totalNumberOfElement];
        System.out.println(Arrays.toString(newArr));//[0, 0, 0, 0, 0]

        //3. adım: iki boyutlu Array'deki elemanlari tek boyutlu Array'e transfer edelim
        // iki boyutlu array lerde dolaşmak için nested for yani iç içe for kullanılır.
        int idx = 0;
        for (int[] w : numbers) {

            for (int k : w) {
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2]
    }
}
