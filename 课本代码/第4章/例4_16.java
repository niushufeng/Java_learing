package code0406;

final class Cricle 
{
	final double PI = 3.1416;
	final double area(double r){
	   return (PI * r * r);
	}
}

package code0406;

class FinalTest
{
	static public void main(String arg[]){
	   Circle c = new Circle();
	   c.PI = 2.0;		//错误
	   System.out.println("area = " + c.area(5.0));
	}
}
