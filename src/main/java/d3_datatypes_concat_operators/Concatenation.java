package d3_datatypes_concat_operators;

public class Concatenation {
    public static void main(String[] args) {

     // Ornek 1: iki int variable oluşturun. String deperi ile Integer'ları toplamı console ' a yazdırın
     // Example 1:two int variables. Print the string value and the sum of the Integers to the console.

     String s = "apple";
     int a = 10;
     int b = 11;

        System.out.println(s+a+b); //apple1011
        System.out.println(s+ (a+b));//apple21
        System.out.println(s + a * b);//apple110
        System.out.println(a + b + s);//21apple


        //Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki String veya bir String ve bir sayi arasinda kullanilirsa "concatenation" islemi olur
        //"concatenation" islemi birlestirme yapar
        //Not: Concatenation islemlerinde Java matematikteki islem onceligini kullanir





    }
}
