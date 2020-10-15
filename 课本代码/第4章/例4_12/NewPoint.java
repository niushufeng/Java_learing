package eg4_12;
//定义包中eg4_12中的类NewPoint

public class NewPoint  
{
	public double x,y;

	public NewPoint(double a , double b){
	   x = a;
	   y = b;
	}

	public double distanceTo(NewPoint p){	//该点到另一点P的距离
	   return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}
}
