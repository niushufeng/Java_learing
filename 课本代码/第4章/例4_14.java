package code0406;

class Port 
{
	protected int n = 3;		//被保护变量
	protected void show_n(){		//被保护方法
	   System.out.println("n = " + n);
	}
}

package code0406;

class ProtTest extends Port 
{	//生成子类
	public static void main(String[] args) 
	{
		ProtTest abs = new ProtTest();
		abs.show_n();	//访问父类的被保护成员
		abs.n = 10;		//访问父类的被保护成员
		abs.show_n();
		System.out.println("Hello World!");
	}
}
