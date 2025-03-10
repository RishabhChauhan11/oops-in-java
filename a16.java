public class a16 {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.eat();
        h1.walks();
        Chicken c1=new Chicken();
        c1.eat();
        c1.walks();
        System.out.println(h1.color);
    }
}
abstract class Animal{
    String color;
    Animal() {
        color="brown";
    }
    
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walks();//abstract function
    
}
class Horse extends Animal{
    void changeColor(){
        color="dark brown";
    }
    void walks(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    void changeColor(){
        String color = "yellow";
    }
    void walks(){
        System.out.println("walks on 2 legs");
    }
}
