//INHERITANCE
public class a8 {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.breathe();
    }
}
//base class
class Animal{
    String color;
     void eat(){
        System.out.println("eats");
    }
     void breathe(){
        System.out.println("breathes");
    }
}
//Derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}
