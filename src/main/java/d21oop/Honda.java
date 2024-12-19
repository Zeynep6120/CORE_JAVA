package d21oop;

public class Honda extends Car {

    //super çağrısı her zaman ilk satıra yazılır.
    //ikinci satıra yazılmaz

    public String model ="Civic";
    public int year = 2023;


    public Honda(){
        System.out.println("super.model = " + super.model);
        System.out.println("this.year = " + this.year);
        //Honda kendi parentına yani bir üssteki parentı olan
        //Car a çağrı yapar.super çağrısı parametresiz constructora yapılır
        System.out.println("Civic");
    }
    public Honda(String model){//2
        super("Sport");
        System.out.println("Accord");
    }
}
