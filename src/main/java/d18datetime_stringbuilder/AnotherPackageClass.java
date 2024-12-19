package d18datetime_stringbuilder;

import d19stringbuilder_buffer_accessmodifier_static.Student;

public class AnotherPackageClass {
    public static void main(String[] args) {


        //bunu için Student19 dan bir tane obje üretelim
        //yani 19 daki Student class ın objesini 18.package de üretiyorum
        // yani başka bir package de paşka bir class ın objesini üreteblirim
        Student veli =new Student();
        System.out.println(veli.stdName);
       // System.out.println(veli.address); buna ulaşamadım çünkü protected
        // bir veriye başka bir paketten ulaşamam.akrabalık bağı olsaydı ulaşabilirdim

      //  System.out.println(veli.email); default bir veriye başka bir paketten
        //ulaşamam akrabalık bağı olsa da olmasadda farketmez .ulaşmam için aynı paket içindeü
        //classlar olması lazım.

        //System.out.println(veli.tcKimlik); buna zaten ulaşamam bu private olduğu için
        //sadece class içinden ulaşılabilir.

    }
}
