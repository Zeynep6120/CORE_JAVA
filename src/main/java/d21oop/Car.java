package d21oop;


public class Car extends Vehicle {

    public String model = "Accord";
    public int year = 2024;


    public Car() {
        super();//bu Car constroctoru da kendi parentı olan Vehicle ye
        //çağrı yapar
        System.out.println("Sedan");
    }

    public Car (String tip){//3
        super("Honda",2024,"Elektirikli");
        System.out.println("Sport");
    }
}

