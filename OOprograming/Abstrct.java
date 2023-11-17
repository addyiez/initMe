package OOprograming;

public class Abstrct {
    public static void main(String args[]){
        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang


        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

    }
}
abstract class Animal{
    String color;

    Animal(){ //not Printing this line due to some error
       System.out.println("Animal constructor called");
    }

    void eat(){ //non-abstract method
        System.out.println("animal eats");
    }

    abstract void walk(); //abstract method
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }

    void changeColor(){
        color ="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang() {
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal{
     void changeColor(){
        color ="white";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}