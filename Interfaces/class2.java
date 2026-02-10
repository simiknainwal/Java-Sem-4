interface I1{
    default void foo1(){
        System.out.println("hello I1");
    }
}
interface I2{
    static void foo1(){
        System.out.println("hello I2");
    }
}

public class class2 implements I1,I2{

    public void foo1(){
        System.out.println("Overrided");
    }
    // public void foo1(){
        // I1.super.foo1();
        // I2.foo1();
    // }

    public static void main(String args[]){
        class2 ob =new class2();
        ob.foo1();
        I2.foo1();
    }
}