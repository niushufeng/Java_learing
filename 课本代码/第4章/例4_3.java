/*
定义二维空间中点point和基本使用方法

class Student{
	int no;
	String name;
	Birthday day;  // day的类型为类Birthday
	}
class Birthday{    // 定义类Birthday
	int year;
	int month;
	int date;
	}

*/

class Point 
{
	int x = 0;
	int y = 0;
	public void move(int dx, int dy){		//移动点坐标的方法
	   x = x + dx;
	   y = y + dy;
	}
	public void alert(){					//无返回值的输出方法
	   System.out.println("x=" + x + " y= "+y);
	}

	public static void main(String[] args) 
	{
		Point p = new Point();
		p.move(1,2);
		p.alert();
	}
}
