package d19stringbuilder_buffer_accessmodifier_static;

public class Student2Runner {
    public static void main(String[] args) {
        //stdName direct obje oluşturmadan class ismi ile ulaştım çünkü bu static bir değişkendir
        //ve static değişkenler class a aittir.class a ait şu demektir class ın ismi ile ulaşabiliriz
        System.out.println("Student2.stdName = " + Student2.stdName);

        //age değişkeni non-static oludğu için ancak obje üzerinden ulaşabilirim

        Student2 ali = new Student2();//burda ali objesi ürettik
        System.out.println("ali.age = " + ali.age);//age değişkenine oluşturduğumuz ali objesi üzerinden ulaştık


        //static bir methoda class ismi üzerinden ulaşabilmem lazım
        Student2.staticMethod(); //ben static bir methodum

        //Non static bir methoda ancak obje üzerinden ulaşabilirim
        ali.nonStaticMethod(); // Ben non-static bir methodum

        //!!!!!!!!!Her kes için ortak olmasını istediğimde onu static bir değişkende saklarım
        //atıyorum bir oyunda bir değer tüm objeler için yani oyuncular için aynı olsun istiyoursam static bir değişken
        //kullanılırm

       /* String s= "Java Kolaydır";
        s.substring(0,3); //burda önceden benden veri beklediği için non-static
        */

    }
}
