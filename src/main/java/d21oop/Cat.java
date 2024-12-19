package d21oop;

public class Cat extends Mammal { //Cat sen uzan Mammal a çünkü senin parent ın Mammaldır

    public void meow() {//bu miyavlama methodu kediye özgüdür

        System.out.println("Cats meow...");
    }

    @Override
    public void feedWithMilk() {

        System.out.println("Cats feed their babies with milk...");
    }
}
