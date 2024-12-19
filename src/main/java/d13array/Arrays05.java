package d13array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {



        //Arraylerin eşit olup olmadığu nasil anlaşılır?

        //Arrayler aynı uzunluğa sahip ve aynı index te aynı elaman varsa bu arrayler eşittir.
        int[] a = new int [3];
        a[0] = 2;
        a[1] = 1;
        a[2] = 3;

        int[] b = new int [3];
        a[0] = 2;
        a[1] = 1;
        a[2] = 3;

       boolean result = Arrays.equals(a,b);
        System.out.println("result = " + result);
    }
}
