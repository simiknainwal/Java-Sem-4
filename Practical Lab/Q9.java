class Product{
    private String pid;
    private String name;
    private double price;

    Product(){
        pid=" ";
        name=" ";
        price=0.0;
    }

    Product(String i,String n,double p){
        pid=i;
        name=n;
        price=p;
    }

    public String getId(){
        return pid;
    }
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }


}

class CartItem{
    Product ob;
    int quantity;
    CartItem(Product obb,int q){
        ob=obb;
        quantity=q;
    }

    public double getTotalPrice(){
        return ob.getPrice()*quantity;
    }

    public Product getProduct(){
        return ob;
    }
}

class ShoppingCart{
    CartItem[]cart;
    int count=0;
    public ShoppingCart(int size){
        cart=new CartItem[size];
        }

        public void addItem(Product product,int quantity){
            for(int i=0;i<cart.length;i++){
                if(cart[i].getProduct().getId().equals(product.getId())){

                }
            }
            if(count<cart.length){
                cart[count]=new CartItem(product,quantity);
            }
        }
}


public class Q9 {
    
}
