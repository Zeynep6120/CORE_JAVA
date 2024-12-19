package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Ornek 1; Kullanıcıdan alınan bir sayinin tek mi çıft mi olduğunu yazdiran kodu oluşturunuz
        // Example 1: Create the code that prints whether a number received from the user is odd of even

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int num = input.nextInt();
        //-------------1.yol
        if(num % 2 == 0){
            System.out.println("Çift sayi");
        }
        if(num % 2 != 0){// num % 2 == 1  de yazılabilirdi ikisi de aynı şey demek
            System.out.println("Tek sayi");
        }
        //-----------------2.yol
        //if - else Statements
        if( num % 2 == 0){
            System.out.println("Sayı Çifttir");
        }
        else{
            System.out.println("Sayı Tektir");
        }

















    }
}
