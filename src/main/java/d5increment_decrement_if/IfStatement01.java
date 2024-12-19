package d5increment_decrement_if;

public class IfStatement01 {
    public static void main(String[] args) {
        //if statement
        if (3 < 5) {
            System.out.println("condition doğru, if çalıştı");
        }
        //---------------------------
        if (7 == 3 + 4) {
            System.out.println("condition doğru,if çalışmıştır");
        }

//Ornek 1: Sayi 0 (dahil) ile 10 (hariç) arasinda ise ekrana "rakam" yazdirin.
//Example 1: If the number is between 0(included) and 10 (excluded),print "Number" on the screen.

        int num = 7;

        if (num > -1 && num < 10) {// num>=0'da  çalışabilir . ama burda Java yı yorarız .java hem
            //büyüklük hemde eşitlik kontrol eder. bu da application ın yavaşlaması demektir
            System.out.println("Rakam");
        }
        //---------------------------------------
        //Ornek 2: Sayi uç basamakli ise ekrana "Sayi üç basamaklıdır"yazdirin
        //Example 2; If the number is three digit, print "The number is three digits" on the screen.

        int n = 123;
        if (n > 99 && n > 100) {
            System.out.println("Sayi üç basamaklıdır");
        }


    }
}