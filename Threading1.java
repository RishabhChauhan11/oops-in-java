class Threading1 extends Thread {
    public void run(){
        for(int i = 1; i < 5; i++){
            System.out.println("NIKHIL");
        }
    }
}

class H {
    public static void main(String[] args) {
        Threading1 t1 = new Threading1();
        t1.start();
    }
}
