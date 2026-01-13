import java.util.*;

public class scanner {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name and roll no:");
        String name=sc.nextLine();
        int rno=sc.nextInt();

        System.out.println("Name is "+name+" and roll no is "+rno);
    }
}
