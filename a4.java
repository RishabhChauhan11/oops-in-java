//encapsulation
//access Modifier
public class a4{
    public static void main(String[] args) {
        BankAccount A1 = new BankAccount();
        A1.username="rishabh";
        System.out.println(A1.username);
        
    }
    
}
class BankAccount{
    public String username;
    private String password;

}


