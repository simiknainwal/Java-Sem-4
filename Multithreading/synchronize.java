class Student{
    public void display(String name){
        //     try{
            //     Thread.sleep(1000);
            // }
            // catch(InterruptedException e){
                //     System.out.println(e);
                // }
//                 synchronized(this){ // Object level used when only one object is present.
//     for(int i=1;i<=5;i++){
//     System.out.println(name+i);

// }
                synchronized(Student.class){ // Class level used when two objects are present.
    for(int i=1;i<=5;i++){
    System.out.println(name+i);

}
        }

    }
}

class Mythread extends Thread{
    Student s;
    String str;
    Mythread(Student s,String str){
        this.s=s;
        this.str=str;
    }
    public synchronized void run(){
        // setName("Child");
// Student.display(str);
s.display(str);
    }
}
public class synchronize {
    public static void main(String[] args)throws InterruptedException {
        Student s=new Student();
        Student s2=new Student(); //If two objects are there then use static keyword for synchronization.
        Mythread mt = new Mythread(s,"Simik");
        Mythread mt2 = new Mythread(s2,"Himik");
        mt.start();
        // mt.join();
        mt2.start();
        // mt2.join();
        for(int i=1;i<=5;i++){
                System.out.println("Main thread "+i);
        }
    }
}
