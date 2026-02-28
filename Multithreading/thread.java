class Mythread extends Thread{
    public void run(){
            System.out.println("Child thread");
    }
}

public class thread{
    public static void main(String args[])throws InterruptedException{
        Mythread mt = new Mythread();
        mt.start();
        mt.run();
        mt.join();
        System.out.println("Main thread");
    }
}