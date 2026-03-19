abstract class Shape{
        abstract  double rectangleArea(int l,int b);
        abstract double squareArea(int s);
        abstract double circleArea(int r);
}

class Area extends Shape{
    public double rectangleArea(int l,int b){
        return l*b;
    }
    public double squareArea(int s){
        return s*s;
    }
    public double circleArea(int r){
        return r*r*3.14;
    }
}

public class Q11{
    public static void main(String[] args) {
        Shape ob = new Area();
        System.out.println(ob.rectangleArea(4, 5));
    }
}