class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(getName()+" running "+i+" time(s)");
        }
    }
}

public class Q1{
        public static void main(String[] args)throws InterruptedException {
            MyThread mt1 = new MyThread();
            MyThread mt2 = new MyThread();
            MyThread mt3 = new MyThread();

            mt1.setName("JAN");
            mt2.setName("FEB");
            mt3.setName("MARCH");
            // System.out.print(mt1.getName());
            mt1.start();
            mt1.join();
            // System.out.print(mt2.getName());
            mt2.start();
            mt2.join();
            // System.out.print(mt3.getName());
            mt3.start();
            mt3.join();
            // mt.join();
            for(int i=1;i<=5;i++){
                System.out.println("Main thread is running "+i+" time(s)");
            }
        }
}