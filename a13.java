// method overriding
public class a13 {
    public static void main(String[] args) {
        Deer d1=new Deer();
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("EATS");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
