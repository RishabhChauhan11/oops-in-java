
public class a18 {
    public static void main(String[] args) {
        Queen q=new Queen(); 
        q.moves(); 
        king k1=new king();
    
        k1.moves();                                                                                                                                                                                                                                                                                                                       
    }
}
interface chessPlayer{
    void moves();

}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class king implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(by one step)");
    }
}

