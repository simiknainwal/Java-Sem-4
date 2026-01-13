public class switch_expression {
    public static void main(String[] args) {
        // String str="Thursday";

        String result=switch(args[0]){ //Command Line Arguments.
            case "Monday","Tuesday"->{System.out.println("Week start ");yield "5 am";}

            case "Wednesday"->{yield "At 6 am";}

            default->{System.out.println("Week end "); yield "At 8 am";}
        };
        System.out.println(result);
    }
}
