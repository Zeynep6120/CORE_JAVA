package d12loopsarrays;

public class WhileLoops03 {
    public static void main(String[] args) {
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //Example 1: Write the code to check if a given integer is a palindrome.
        //           Palindrome: 121 <==> 121        123321 <==> 123321
//tersten okunuşu aynı olan de normal de okunuşu aynı olan sayılar

        int k = 313;
        String original = String.valueOf(k);  //"313"
        String reversed ="";// Ters çevrilmiş olanı bunu içinde saklıyacağız.
        //ters çevrilmelerde işleme son indexten başlanır.

        //son index her zaman "length()-1 "dir.
        int index = original.length()-1;//son indexi aldık.indexe atadık.

        while(index>=0){
            reversed = reversed +original.charAt(index);
            index--;
        }
        System.out.println(reversed);//313

        if(original.equals(reversed)){
            System.out.println("Palindromdur");
        }else{
            System.out.println("Palindrom değildir");
        }





    }
}
