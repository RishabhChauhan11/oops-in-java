
//Exception handling in java
public class nikhl {
    public static void main(String[] args) {
        try {
           int result= 10/0;
           System.out.println(result); 
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("finally is execute");
        }
    }
    
}
