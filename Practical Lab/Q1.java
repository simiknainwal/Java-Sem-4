public class Q1 {
    public static void main(String[] args) {
        float a=0,b=0;
        try{

            a=Float.parseFloat(args[0]);
            b=Float.parseFloat(args[2]);
            Float f1=a;//Autoboxing
            Float f2=b;
            
            switch(args[1]){
                case "+":System.out.println(f1+f2);
                break;
                case "-":System.out.println(f1-f2);
                break;
                case "x":System.out.println(f1*f2);
                break;
                case "/":System.out.println(f1/f2);
                break;
                default:System.out.println("Invalid input");
            }
            // System.out.println(f1+f2);//Autounboxing.
        }
        catch(NumberFormatException e){
            System.out.println("Please enter valid number");
        }

    }
}
