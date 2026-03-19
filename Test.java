class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog constructor");
        super();  // calls parent constructor
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}