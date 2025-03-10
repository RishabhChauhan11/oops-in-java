class E implements Runnable {
    public void run(){ 
        for (int i = 1; i <=5; i++) {
            System.out.println("My child Thread");
        }
    }
}
class F{
    public static void main(String[] args) {
        E r=new E();
        Thread thread=new Thread(r);
        thread.start();
        for (int i = 1; i < 5; i++) {
            System.out.println("main Thread");
        }
    }
}