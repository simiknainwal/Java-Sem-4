interface I1 {
void foo1();
void foo2();
default void foo3(){
    System.out.println("Default method");
}
static void foo4(){
    System.out.println("Static method");
}
}


public class class1 implements I1 {
    public void foo1(){
        System.out.println("Hello ");
    }
    public void foo2(){
        System.out.println("Java ");
    }


    public static void main(String args[]){
        class1 ob= new class1();
        // I1.foo1();
        ob.foo1();
        ob.foo2();
        ob.foo3();
        I1.foo4();//can't be accessed through ob.
    }
}

