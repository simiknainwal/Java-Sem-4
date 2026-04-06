class Student1{
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
                synchronized(Student1.class){ // Class level used when two objects are present.
    for(int i=1;i<=5;i++){
    System.out.println(name+i);

}
        }

    }
}

public class inter {
    
}
