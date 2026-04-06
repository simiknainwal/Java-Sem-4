class Ticket{
    int availableSeats;
    Ticket(int n){
        availableSeats=n;
    }
    public synchronized void bookSeats(){
        try{
            if(availableSeats>0){
                System.out.println("Seats available "+availableSeats);
            availableSeats--;
            }
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class Thread1 extends Thread{
    Ticket ob;
    Thread1(Ticket ob){
        this.ob=ob;
    }
    public void run(){
        ob.bookSeats();
    }
}

public class TicketBook {
    public static void main(String[] args) {
        Ticket ob =new Ticket(5);
        Thread1 mt1=new Thread1(ob);
        Thread1 mt2=new Thread1(ob);
        Thread1 mt3=new Thread1(ob);
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
