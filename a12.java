//method overloading
public class a12 {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum((float)2.9 , (float)7.8));
        System.out.println(c1.sum(1,2,3));
    }
 }
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a ,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

    
}
