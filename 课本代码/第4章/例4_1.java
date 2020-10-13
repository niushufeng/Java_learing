/*
类和对象的初探
定义类Circle，并输出任意圆的面积和周长
*/
class Circle 
{
	float x,y;								//定义圆心坐标x,y
	float radius;							// 定义成员变量半径
	double getArea(){						//定义计算面积的方法
		return radius * radius * Math.PI;
	}
	double getCircumference(){				//定义计算周长的方法
	   return 2 * radius *Math.PI;
	}
	public static void main(String[] args) 
	{
		Circle c = new Circle();			//创建类Circle的对象c 
		c.radius = 3;
		c.x = 0;
		c.y = 0;							//为对象c中变量赋值
		System.out.println("Area= " + c.getArea()); //访问成员方法
		System.out.println("Circumference=" + c.getCircumference());
	}
}
