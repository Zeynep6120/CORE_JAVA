package d6if_switch;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        /*
        Ornek 1: Kullanıcının vermiş olduğu gün isimlerine bakarak Hafta sonu veya Hafta içi olduğuna karar veren kodu yazınız
        Pazartesi ==> Hafta içi     Cumartesi ==> Hafta sonu
         */

        /*
        Example 1: Write the code that decides whether it is Weekend of Weekday based on the day names given by the user
        Monday ==> Weekday   Saturday ==> Weekend
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day name");
        String dayName = input.next();

        //equals() iki String'in birbirinin aynisi olup olmadığını kontrol eder.
        //Bu method boolean return eder(true veya false)

        //equalsIgnoreCase() iki String'in birbirinini aynisi olup olmadığını büyük küçük harfi dikkate almadan kontrol eder

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") ||
                                    dayName.equalsIgnoreCase("Sunday");


        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wendesday") ||
                dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");


        if (isWeekendDay) {
            System.out.println("Weekend");

        } else if (isWeekDay) {
            System.out.println("Weekday");
        } else {
            System.out.println("Enter a valid day name");
        }


    }
}
