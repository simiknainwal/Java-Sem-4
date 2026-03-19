import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)return;
        System.out.println("Enter a number:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            while(i<n-1 && a[i]>0 && a[i+1]<0){
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                i++;
            }
        }
        for(int it:a)System.out.print(it+" ");
    }
}
