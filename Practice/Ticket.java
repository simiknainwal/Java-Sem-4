class TicketBooking{
    int availableTickets;
    TicketBooking(int a){
        availableTickets=a;
    }
    public synchronized void check(){
        try{
            if(availableTickets>0){
                System.out.println("Ticket available "+availableTickets);
                Thread.sleep(1000);
                availableTickets--;
            }else{
                System.out.println("Tickets not available");
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class Thread1 extends Thread{
    TicketBooking ob;
    Thread1(TicketBooking ob){
        this.ob=ob;
    }
        public void run(){
                    ob.check();
        }
}

public class Ticket {
    public static void main(String[] args) {
        TicketBooking ob =new TicketBooking(5);
        // TicketBooking ob2 =new TicketBooking();
        Thread1 mt = new Thread1(ob);
        Thread1 mt2 = new Thread1(ob);
        Thread1 mt3 = new Thread1(ob);
        mt.start();
        mt2.start();
        mt3.start();
        
    }
    
}
