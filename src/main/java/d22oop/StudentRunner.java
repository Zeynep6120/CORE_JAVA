package d22oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s.name);//Ali Can

        System.out.println( s.getAge());//13
        System.out.println(s.isSuccessful());//true

        s.setAge(25);
        System.out.println(s.getAge());// set methodu ile değiştir get  methodu ile oku

        s.setSuccessful(false);
        System.out.println(s.isSuccessful());//false
    }

    //ODEV: encapsulation da private ile gizlenen bir veri baska package'dan set method ile degistirilebilir mi?
}
