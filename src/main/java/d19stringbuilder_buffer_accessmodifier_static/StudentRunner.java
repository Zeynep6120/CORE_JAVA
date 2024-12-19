package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {

        //Student class tan bir instance(obje) oluşturalım
        Student ali =new Student();

        System.out.println(ali.stdName); // Ali Can
        // ali objesi Student class ındaki stdName e ulaştı
        System.out.println(ali.email);// alican@gmail.com
        // ali objesi Student class taki default olan mail adresine
        //ulaştı çünkü aynı paketler
        System.out.println(ali.address);//Istanbul
        //ali objesi student classındaki protected olan addres objesine ulaştu
      //  System.out.println(ali.tc);//ali  student class taki tcKimlik objesine ulaşamdı çünkü bu obje privatettır
        //tcKimlik objesi sadece aynı class tan erişime sahiptir
    }
}
