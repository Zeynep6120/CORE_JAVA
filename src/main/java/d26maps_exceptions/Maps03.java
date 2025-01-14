package d26maps_exceptions;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {


        //Meshur bir İNTERVİEW SORUSU!!!!!!!!!!!!!!!!!!

        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız olsun)

        //example 1: Given a String, count the number of times each word is used in that String
        // write the code that displays.(Case insensitive)

        // ali = 2, nasilsin = 1

        String s = "Ali nasilsin Ali.";

        s = s.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(s);//ali nasilsin ali

        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));//[ali, nasilsin, ali]
        //System.out.println(words);//[Ljava.lang.String;@4dd8dc3
        //Arrayler doğrudan yazdırılmadığı için bana addres verdi
        //java string bir ifadeyi block olarak tek bir kelime gibi gördüğü için kelime sayısını saymak için
        //split methodu ile string ifadeyi boşluklardan kestim

        //[ali, nasilsin, ali] şu an elimde 3 ayrı data var ben bunu tek bir  array içinde döngüye sokabilirim artık.

        HashMap<String, Integer> myMap = new HashMap<>(); //boş  bir HasMap açtım içini doldurucam
        System.out.println(myMap);//{}
        //bu map in içini döngü ile doldurucaz birazdan


                            //[ali, nasilsin, ali]
        for(String w:words){

            Integer isThere = myMap.get(w); //ilk dongude w'nun icinde ali var. map'te ali olmadigindan null gelecek

            if (isThere == null) {
                myMap.put(w, 1);
            } else {
                myMap.put(w, isThere + 1); //map'te varsa 1 artir
            }
        }
        System.out.println(myMap); //{nasilsin=1, ali=2}

        //ODEV: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //example 2: Write the code that shows how many times each letter in a given String is used in that String.
        //           “Hello” ==> H=1, e=1, l=2, o=1


    }


    }

