class pr{
    public static void main(String[] args) {
        // Integer I=Integer.valueOf(10); //Explicitly converting.
        Integer I=10;//Conversion from primitive to wrapper object.(Autoboxing)
        System.out.println(I);


        // int a=I.intValue(); //Explicitly converting.
        int a=I;//Conversion from wrapper object to primitive.(Autounboxing)
        System.out.println(a);
    }
}