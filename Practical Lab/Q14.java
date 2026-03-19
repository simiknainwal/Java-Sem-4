interface Library{
String itemId="";
String title="";
int borrowed=0;
int dueDate=0;
void borrowItem();
void returnItem();
double calculateLateFee();
default void updateItemTitle(String newTitle){
    setTitle(newTitle);
}
default void printItemDetails(){
    System.out.println(itemId+" "+title+" "+borrowed+" "+dueDate);
}
private boolean isItemOverdue(){
    return borrowItem();
}

private static boolean isValidItemId(String itemId){

}

public void setTitle(String id);
}
class Books implements Library{

    public void borrowItem(){

    }
    public void returnItem(){

    }
    public double calculateLateFee(){
        return 0;
    }

}
class Magazines implements Library{
    public void borrowItem(){

    }
    public void returnItem(){

    }
    public double calculateLateFee(){
        return 0;
    }

}
class EBooks implements Library{
    public void borrowItem(){

    }
    public void returnItem(){

    }
    public double calculateLateFee(){
        return 0;
    }

}
public class Q14 implements Library {
    public void borrowItem(){
            
    }

    public void returnItem(){

    }

    public double calculateLateFee(){
        return 0;
    }

    public static void main(String args[]){
        Q14 ob = new Q14();
        
    }
    
}
