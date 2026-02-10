public class A{
    void display(){
        System.out.println("A");
    }
}
 class pr{
    public static void main(String[] args) {
        A ob = new A();
        ob.display();
        Integer a=20;
        int b=a;
        System.out.println(a+b);
    }
}