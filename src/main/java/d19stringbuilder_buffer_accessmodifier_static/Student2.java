package d19stringbuilder_buffer_accessmodifier_static;

public class Student2 {

    //static, bir değişkenin veya bir method'un Class'a ait olduğunu ve Class'ın bir orneğı(Object'i)
    //oluşturulmadan kullanılabileceğini belirtmek için kullanılan bir anahtar kelimedir
    //Static değişkenin değeri değiştirilebilir.

     /*
    1) static variable veya static methodlar (class member) tum object’ler icin ortak elemandir
    2) static class member’lar uzerinde yapilan degisiklikler tum objectleri etkiler.
    3) static class member’lar class’a, non-static class member’lar object’lere aittir
    4) static class member’lara ulasmak icin object olusturmaya gerek duyulmaz,
        ama non-static class member’lara ulasmak icin object olusturmak sarttir
    5) static variable’larin diger adi class variable’dir,
        non-static variable'larin diger adi instance(örnek) variable veya object variable’dir
     */

    //oluşturdupum obje üzerinden bir method çağırdığım zaman bu non-static diye geçer.
    /*String s= "Ali";
    s.substing*/

    //direkt classın kendisi ile method çağırdığım zaman ise bu da statictir
    //Math.min

    public static String stdName="Ali Can";//bu static bir variabledır
    public int age=18; //Bu non-static bir variable dır yani buna buna obje üzerinden ancak ulaşılır
                                                        //direkt class üzerinden ulaşılmaz
    public static void staticMethod(){
        System.out.println("Ben static bir methodum");
    }

    public void nonStaticMethod(){
        System.out.println("Ben non-static bir methodum");
    }

}
