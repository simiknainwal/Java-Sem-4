import java.util.*;
abstract class Product{
    String productId;
    String name;
    double price;
    int quantity;
    Product(){

    }
    Product(String i,String n,double p,int q){
        productId=i;
        name=n;
        price=p;
        quantity=q;
    }
    abstract double calculateValue();
    void updateStock(int change){
        quantity+=change;
    }
    void display(){
        System.out.println(name+" "+productId+" "+price+" "+quantity);
    }
}

class Electronics extends Product{
            int warrantyMonths;
            double calculateValue(){
                return price*quantity*(1+warrantyMonths/120);
            }
}

class Book extends Product{
    String author,isbn;
    double calculateValue(){
        return price*quantity;
    }
}

class FoodItems extends Product{
    String expirationDate;
    boolean isExpired(){
                return true;
    }
    double calculateValue(){
        return price*quantity*(isExpired()?0.5:1.0);
    }
    void display(){
        // super(productId,name,price,quantity);
        System.out.println(productId+" "+" "+name+" " +quantity+" "+price+" "+expirationDate);
    }
}

class Inventory{
        Product []product;
        int count=0;
        public Inventory(int size){
            product=new Product[size];
        }

        public void addProduct(Product p){
                for(int i=0;i<product.length;i++){
                    if(product[i].productId.equals(p.productId)){
                        product[i].updateStock(1);
                    }
                    if(count<product.length){
                        product[count]=p;
                        count++;
                    }
                }
        }
        public void removeProduct(String id){
            for(int i=0;i<count;i++){
                if(product[i].productId.equals(id)){
                    for(int j=i;j<count-1;j++){
                        product[j]=product[j+1];
                    }
                    product[count-1]=null;
                    count--;
                    return;
                }
            }
        }

    }
