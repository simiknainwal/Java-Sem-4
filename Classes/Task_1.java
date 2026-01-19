class Task_1{
    public static void main(String args[]){
        float n1=Float.parseFloat(args[0]);
        Float I=n1;
        float n2=Float.parseFloat(args[2]);
        Float F=n2;
        String str=args[1];
        switch(str){
            case "+"->{System.out.println("Sum is "+(I+F));}
            case "-"->{System.out.println("Difference is "+(I-F));}
            case "x"->{System.out.println("Product is "+(I*F));}
            case "/"->{System.out.println("Division is "+(I/F));}
            default->{System.out.println("Invalid input");}
        }
    }
}