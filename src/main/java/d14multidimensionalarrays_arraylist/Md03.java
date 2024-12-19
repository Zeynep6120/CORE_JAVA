package d14multidimensionalarrays_arraylist;

public class Md03 {
    public static void main(String[] args) {

        // Ornek 1: int turünde bir Multimensional Array'deki en küçük ve en büyük elemanın toplamını bulunuz
        //Example 1: Find the sum of the smallest and largest element in a Multimensional Array of type int

        int[][] ages = {{15, 4}, {12, 43, 21}};// ==> 4+43 =47
        //min max sorularında sıfırıncı indexteki eleamnıı minimum ya da maximum kabul ederiz

        int smallest = ages[0][0];
        int biggest = ages[0][0];
        //burda bir for döngüsü ile iki boyutludan içteki arraylere ulaşacam.içteki bir for döngüsü ile yani nested for
        //ile de içteki array in elemanlarına ulaşıp karşılaştırma yapıcam

        for (int[] w : ages) {//{{15, 4}, {12, 43, 21}}

            for (int k : w) {

                smallest = Math.min(smallest, k);
                biggest = Math.max(biggest, k);

            }
            System.out.println("smallest = " + smallest); //4
            System.out.println("biggest = " + biggest);//43
            System.out.println("Toplam =  " + (biggest + smallest)); //47
        }


    }
}
