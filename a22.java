
//Exception handling in java
public class a22 {
    public static void main(String[] args) {
        try {
           int number[]={1,2,3};
           System.out.println(number[10]); 
        } catch (Exception e) {
            System.out.println("catch is execut");
        }finally{
            System.out.println("finally is execute");
        }
    }
    
}
