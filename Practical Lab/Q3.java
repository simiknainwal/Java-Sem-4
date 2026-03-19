import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        if(n==0)return;
        System.out.println("Enter the numbers:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        if(n==1){
            System.out.println(a[0]);
            return;
        }
        for(int i=1;i<n;i=i+2){
            if(i!=n-1){
                if(a[i]<a[i-1] || a[i]<a[i+1]){
                    int ans=(a[i-1]<a[i+1])?i+1:i-1;
                    int t=a[ans];
                    a[ans]=a[i];
                    a[i]=t;
                }
            }else if(a[i]<a[i-1]){
                int t=a[i];
                a[i]=a[i-1];
                a[i-1]=t;
            }
        }

        for(int it:a)System.out.print(it+" ");
        sc.close();
    }
}
