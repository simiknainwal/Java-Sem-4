import java.util.Scanner;

class pr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][];

        for(int i=0;i<2;i++){
            arr[i]=new int[2];
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int[] x:arr){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
