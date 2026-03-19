class JAN extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            setName("JAN");
            System.out.println(getName()+" running "+i+" times");
        }
    }
}
class FEB extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            setName("FEB");
            System.out.println(getName()+" running "+i+" times");
        }
    }
}
public class pr {
    public static void main(String[] args) throws InterruptedException{
        JAN ob1=new JAN();
        FEB ob2=new FEB();
        ob1.start();
        ob2.start();
        ob2.join();
        for(int i=1;i<=5;i++){
            System.out.println("Main thread");
        }
    }
}
