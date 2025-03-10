//hybrid inheritence
public class a11 {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.breath();
        a1.breath();
    }
}
class Animal{
    int color;
    void eat(){
        System.out.println("EATS");
    }
    void breath(){
        System.out.println("breath");
    }
}
class Mammal extends Animal{
    void walks(){
        System.out.println("walks");
    }
}
class Birds extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
