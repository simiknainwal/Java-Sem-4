import java.io.*;

public class Q16 {

    static String reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String s=sb.toString();
        return s;
    }

    static int findVowels(String str){
        int c=0;
        for(int i=0;i<str.length();i++){
            int x=str.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')c++;
        }
        return c;
    }
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String line;
        line=br.readLine();
        while(line!=null){
            String str[]=line.split(" ");
            bw.write(line.toUpperCase());
            bw.write("\n");
            bw.write(String.valueOf(str.length));
            bw.write(" ");
            // System.out.println("Total words are "+str.length);
            for(int i=0;i<str.length;i++){
                // System.out.println("Number of vowels in "+(i+1)+" word is/are "+findVowels(str[i]));
                // bw.write("Number of vowels in ");
                // bw.write(String.valueOf(i+1));
                // bw.write(" ");
                bw.write(reverse(str[i]));
                bw.write(" ");
                bw.write(String.valueOf(findVowels(str[i])));
                bw.write(" ");
            }
            bw.write("\n");
            line=br.readLine();
        }
        br.close();
        bw.close();
    }
}
