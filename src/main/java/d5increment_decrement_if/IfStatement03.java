package d5increment_decrement_if;


import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {


        //if - else if - else Statements
  /*  if(){

    }
    else if(){

    }
    else{

    }*/

        // Ornek 1: Kullanıcıdan alinan bir sayinin pozitif, negatif veya nötr oluduğunu kontrol eeden kodu yazınınz.
        // Example 1: Write the code that checks whether a number received from the user is positive, negative of naturel.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int num = scanner.nextInt();

        if(num>0){
            System.out.println(num +  "  sifirdan büyüktür");
        }
        else if(num<0){
            System.out.println(num + "  sifirdan küçüktür");

        }
        else{
            System.out.println(num + "  notrdür");

        }



    }
}
