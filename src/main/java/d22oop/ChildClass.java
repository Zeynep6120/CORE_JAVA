package d22oop;

public class ChildClass extends ParentClass {



    @Override
    public Integer multiply(Integer a, Integer b) {
        //Parent class'ın multiplu methodunu çağırdık.
        Integer sonuc= super.multiply(a, b);

        //Ek işlevsellik katalım
        return sonuc +10;
        //Parent method değişmez.orjinali aynen duruyor.ben override işleminde parent methodun orjinalin değiştirmedim
        //super çağrısındaki methodun overide orjinalini değiştirmek için değik ek işlevsellik katmak için yapılır.
    }
}
