//class and object
public class a1 {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // PEN OBJECT CALLED p1
        p1.setColor("blue"); // Set the color of p1 to blue
        System.out.println(p1.color); // Prints the color of p1
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen {
    String color; // Instance variable for color
    int tip; // Instance variable for tip
    
    void setColor(String newColor) {  // Corrected parameter name to newColor
        color = newColor;  // Set the instance variable color to the value of newColor
    }
    
    void setTip(int newTip) {
        tip = newTip;  // Set the instance variable tip to the value of newTip
    }
}

