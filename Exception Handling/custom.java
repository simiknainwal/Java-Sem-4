import java.util.*;
public class custom {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt();
        try{

            if(age>12){
                throw new CoronaVirusException("You are not safe!! Get vaccinated");
            }
            System.out.println("Safe");
        }
        catch(CoronaVirusException e){
            System.out.println(e);
        }

        finally{
            System.out.println("In final");
        }
    }
}
