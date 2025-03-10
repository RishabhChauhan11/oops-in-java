//hierchial
public class a10 {
    public static void main(String[] args) {
        Mammal m1=new Mammal();
        m1.eat();
        m1.breathe();
        Birds b1=new Birds();
        b1.fly();
        b1.eat();//SAME AS OTHER CLASS
    }
}
class Animal{
    int color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("BREATHE");
    }
}
class Mammal extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Birds extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}