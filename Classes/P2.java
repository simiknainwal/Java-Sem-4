import java.util.*;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int sum1=0,sum2=0;
        for(int i=1;i<num1;i++){
            if(num1%i==0)
            sum1=sum1+i;
        }
        for(int i=1;i<num2;i++){
            if(num2%i==0)
            sum2=sum2+i;
        }

        double x=(double)sum1/num1;
        double y=(double)sum2/num2;
        if(x==y)
        {
            System.out.println("Friendly Pairs");
        }else{
            System.out.println("Not");
        }
    }
}
