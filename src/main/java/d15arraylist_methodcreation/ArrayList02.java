package d15arraylist_methodcreation;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        //Ornek 1:  Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.
        //Example 1: Create a String ArrayList and delete the elements containing "a".

        //---------------------------
        /*for each kullandiginizda list’lerde eleman sayisini azaltamazsiniz.

        Cunku "for each" döngüsü ile bir koleksiyonu veya diziyi dolaşırken, koleksiyonun veya dizinin
        boyutu değişirse, bu, döngünün tutarlılığını bozar. Özellikle, eleman kaldırıldığında, döngü hâlâ
        eski boyutu dikkate alacak, bu da dizi sınırlarını aşabilir veya yanlış elemanlara erişebilir.
        Ayrıca, diğer elemanların dizin numaraları değişecektir, bu da yanıltıcı sonuçlara yol açabilir.

        Concurrent Modification Exception - Eşzamanlı Değişiklik İstisnası olusur.
        Yani bir dongu sayisi for each tarafindan ornegin 4 olarak ayarlanmissa,
        siz bir elemani silince o 4 uzerinden devam etmeye calisacagi icin tutarsizlik olusur */

        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Niğde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r);//[Manisa, Niğde, Tokat, Van]
        //remove ==> sil , kaldır demek
/*
        for (String w : r){

            if(w.contains("a")){
                r.remove(w);
            }
        }
        System.out.println(r);*/ //HATA Concurrent Modification Exception I FIRLATTI

        //for each her zaman for un yaptığı şeyleri yapamıyor yukardaki olayda buna bir örnektir

        for (int i = 0; i < r.size(); i++) {//[Manisa, Niğde, Tokat, Van]

            if (r.get(i).contains("a")) {// r listine git getir i indeksindeki veriyi contains metodu ile bak bakalım
                //içinde a varmı
                r.remove(i);//eğer verinin içinde a var ise onu sil

                i--; // i-- ekledik çünkü java her silme işleminden sonra index leri yeniden düzenler
                // ve bu döngü esnasında bazı elemanların atlanmasına sebep olur i-- sayesinde bunun
                //önüne geçmiş oluruz.!!!!!!!!!!!!!!!!!!!
                // yani döngüden bir eleman eksildiği zaman i bir azaltmış oldum.
            }
        }
        System.out.println(r);

        //ODEV: Bu soruyu i’yi son index’ten baslatarak ta cozebilirdik.i-- yazmaya gerek kalmazdi. Nasil?!!!!!!!!!!!!!

    }
}
