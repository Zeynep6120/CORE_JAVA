package d4operator_casting_scanner;

import java.util.Locale;
import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Ornek 3: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        //Example 3: Write the code that takes two numbers from the user, performs 4 operations and displays the
        // results of the operations on the screen.

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //Local ayarlarımı burda Amerikaya göre alarak aşağıda doubl ifade yazerken araya virgul değil de artık nokta
        //kullanabilirim
        System.out.println("Lütfen iki sayı giriniz.");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        System.out.println("Addition :" + (firstNumber + secondNumber));
        System.out.println("Subtraction :" + String.format("%.2f",(firstNumber - secondNumber)));
        // noktadan sonra kaç basamak istiyorsak onun için bir methodtur.
        System.out.println("Multiplication :" + (firstNumber * secondNumber));
        System.out.println("Division :" + (firstNumber / secondNumber));


    }
}
