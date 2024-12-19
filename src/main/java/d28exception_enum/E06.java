package d28exception_enum;

public class E06 {
    public static void main(String[] args) {

        //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur
        String s = "Java";
        numberOfChar(s);

        String t = "";
        numberOfChar(t);//hiçliği length olarak sayarsak sıfır alırız.

        String u = null;
        numberOfChar(u);   //HATA//null ın bir length si yoktur.
    }

    public static void numberOfChar(String s) {
        try {
            int a = s.length();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.err.println("null değeri ile length methodunu kullanmayınız ");
        }
    }
}
