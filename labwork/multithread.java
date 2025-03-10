class Thread1 implements Runnable {
    @Override
    public synchronized void run() {
        try {
            
            System.out.println("Thread 1: " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception in Thread 1");
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        try {
          
            System.out.println("Thread 2: " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception in Thread 2");
        }
    }
}

public class multithread {
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());

       
        thread1.start();
        thread2.start();
    }
}
