import  java .util.*;
public class excep {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int age = sc.nextInt();
try{
System.out.println("In try");
System.out.println(10/0);
}
catch(ArithmeticException e){
    System.out.println(e);
}
finally{
System.out.println("Inside final");
}

        // if(age>12){
        //     throw new ArithmeticException("You are not safe");
        // }
        // System.out.println("Safe");
        // sc.close();
    }
}
