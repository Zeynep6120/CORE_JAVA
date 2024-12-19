package d27exceptions;

public class E04 {
    public static void main(String[] args) {

        //4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
        // dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.

        String[] arr = {"j", "a", "v", "a"};
        //getElementFromArray(arr,1);
        getElementFromArray(arr, 5);

    }

    //mainin dışınsa methodu oluşturuyoruz
    public static void getElementFromArray(String[] s, int idx) {
        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ındex numarası " + (s.length - 1) + " Den büyük olamaz");
            //ındex numarası 3 Den büyük olamaz
        }
    }
}
