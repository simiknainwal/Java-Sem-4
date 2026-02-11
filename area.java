abstract class Shape{
	
	abstract double rectangleArea(double l,double b);
	abstract double squareArea(double s);
	abstract double circleArea(double r);
	
}
public class area {
double rectangleArea(double l,double b) {
	return l*b;
}

double squareArea(double s) {
	return s*s;
}

double circleArea(double r) {
	return 3.14*r*r;
}

public static void main(String args[]) {
	area ob = new area();
	System.out.println(ob.rectangleArea(5, 4));
	System.out.println(ob.squareArea(6));
	System.out.println(ob.circleArea(5));
}

}
