import java.util.*;
public class Test{
    int a=10;
    static int b=200;
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a=20;
        ob.b=100;
        Test ob2 = new Test();
        System.out.println(ob2.a+" "+ob2.b);
    }
}
