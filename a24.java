class D extends Thread {  // Thread class D
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Rishabh");  // Print "Rishabh"
                Thread.sleep(1000);  // Pause for 1 second
            }
        } catch (InterruptedException e) {
            // Handle the exception
            
        }
    }
}

class C {
    public static void main(String[] args) throws InterruptedException {
        D t = new D();  // Correctly create an instance of class D
        t.start();  // Start the thread 't'
        
        for (int i = 1; i <= 5; i++) {  // Print "Chauhan" 5 times in the main thread
            System.out.println("Chauhan");
            Thread.sleep(1000);
        }

        t.join();  // Wait for thread 't' to finish before the main thread completes
    }
}
