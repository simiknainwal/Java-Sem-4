import java.nio.InvalidMarkException;
import java.util.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String str){
        super(str);
    }
}

class InvalidNameException extends Exception {
    InvalidNameException(String str){
        super(str);
    }
}

class InvalidMarksException extends Exception {
    InvalidMarksException(String str){
        super(str);
    }
}

class InvalidEmailException extends Exception {
    InvalidEmailException(String str){
        super(str);
    }
}

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, age and email-ID:");
        String name=sc.nextLine();
        int age=sc.nextInt();
        sc.nextLine();
        String email=sc.nextLine();
        System.out.println("Enter marks:");
        int marks=sc.nextInt();
        try{
            if(name.equals("")){
                throw new InvalidNameException("Name is invalid");
            }
            if(age<17 || age>25){
                throw new InvalidAgeException("You are under age");
            }
            if(email.matches("[a-zA-Z]*@gmail.com")){
                // System.out.println("Mail Id is valid");
            }else{
                throw new InvalidEmailException("Mail Id is not valid");
            }
            if(marks<1 || marks>100){
                throw new InvalidMarksException("Marks are not valid");
            }else if(marks>=60){
                System.out.println("Eligible for admission");
            }else{
                System.out.println("Not Eligible for admisiion");
            }
            // System.out.println("Age is valid");
            // System.out.println("Name is valid");
            // System.out.println("Marks are valid");
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidNameException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidMarksException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidEmailException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
