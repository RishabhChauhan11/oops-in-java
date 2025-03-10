//constructor calling hierarchi IN ABSTRACT CLASS
public class a17 {
    public static void main(String[] args) {
        Horse h1=new Horse();
        Chicken c1=new Chicken();
        //ANIMAL--> HORSE-->CHIKEN
    }
}
abstract class Animal{
    String color;
    Animal() {
        System.out.println("Animal constructor called");
    }
    
}
class Horse extends Animal{
    Horse() {
        System.out.println("Horse constructor is called");
    }
}
    
class Chicken extends Animal{
    Chicken() {
        System.out.println("chiken constructor is called");
    }
    
}
