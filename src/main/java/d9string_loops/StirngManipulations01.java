package d9string_loops;

public class StirngManipulations01 {
    public static void main(String[] args) {

        //Ornek 1: Bir String'in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        //Example 1: Starting from a specific character of a String up to a specific character
        // take all characters as dynamic.

        //1.yol: Hard Coding, tavsiye edilmez

        //1.yol---------------------------
        String a = "abc@gmail.com";
        System.out.println(a.substring(4, 9));


        //2.yol. Dinamik-----------------------
        String company1 = a.split("@")[1].split("//.")[0];
        System.out.println(company1);//gmail


        //3.yol: Dinamik.----------------------------------
        //indexOf() method'u spesifik bir karakterin ilk gorunumunun index'ini verir
        //Bu method olmayan karakterler icin -1 verir.
        
        int startingIndex = a.indexOf("@")+1;//@ sembolu yukardaki mail adresinde 4.sıradadır ve indexi 3.tür o yüzden
                                            //indexof metodu index verdiği için buranın sonucu 3 tür
        
        int endingIndex= a.indexOf(".");//9
        
        String companyName = a.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);


    }
}
