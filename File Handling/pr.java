import java.io.*;
import java.util.*;

class Student{
    public void addStudent(String name,int id,int marks)throws IOException{
        FileWriter fw = new FileWriter("student.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name);
        bw.newLine();
        bw.write(String.valueOf(id));
        bw.newLine();
        bw.write(String.valueOf(marks));
        bw.close();
    }
}
public class pr {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int id=sc.nextInt();
        int marks=sc.nextInt();
        Student ob =new Student();
        ob.addStudent(name,id,marks);
        sc.close();
    }
}
