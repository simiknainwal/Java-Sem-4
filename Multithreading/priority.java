class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child thread");
        }
        try{

            Thread.sleep(2000);
        }
        catch(InterruptedException e){
                System.out.println(e);
        }
    }
}
public class priority {
    public static void main(String[] args)throws InterruptedException {
        MyThread ob =new MyThread();
        ob.start();
        // ob.setPriority(10);[]
        System.out.println(ob.getPriority());
        // ob.join();
        for(int i=1;i<=5;i++){
                System.out.println("Main thread");
            }
    }
}
