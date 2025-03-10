// GETTER AND SETTER
public class a3 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue"); 
        System.out.println(p1.color); 
        
        System.out.println(p1.getTip()); 
        
        
        p1.setTip(5);
        System.out.println(p1.getTip()); 
    }
}

class Pen {
    String color;
    int tip;

    // Getter for color
    String getColor() {
        return this.color;
    }

    // Getter for tip
    int getTip() {
        return this.tip;
    }

    // Setter for color
    void setColor(String newColor) {
        this.color = newColor; // Set the color to the passed value
    }

    // Setter for tip
    void setTip(int newTip) {
        this.tip = newTip; // Set the tip to the passed value
    }
}
