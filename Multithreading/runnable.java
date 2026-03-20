class MyRunnable implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child thread");
        }
    }
}
public class runnable {
    public static void main(String[] args) throws InterruptedException{
        MyRunnable ob =new MyRunnable();
        Thread mt = new Thread(ob);
        mt.start();
        mt.join();
        for(int i=1;i<=5;i++){
            System.out.println("Main thread");
        }
    }
}
