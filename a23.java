//Threading in java
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Rishabh");
        }
    }
}

class B {
    public static void main(String[] args) {
        A t = new A();
        t.start();  // Start the thread 't'
        
        for (int i = 1; i <= 5; i++) {  // Fixed the loop to run 5 times
            System.out.println("Chauhan");
        }
    }
}
