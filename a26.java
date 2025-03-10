//THREAD SCHEDULAR
class G extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for (int i = 1; i <=5; i++) {
           System.out.println(n); 
        }
    }
}
class H{
    public static void main(String[] args) {
        G t1=new G();
        G t2=new G();
        G t3=new G();

        t1.setName("thread 1"); //JOB
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}