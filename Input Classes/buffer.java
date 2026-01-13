import java.io.*;

class buffer{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name and roll no:");
        String name=br.readLine();
        int rno=Integer.parseInt(br.readLine());

        System.out.println("Name is "+name+" and Roll No is "+rno);

    }
}