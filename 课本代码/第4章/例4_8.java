/*
实例变量和静态变量区别示例
*/

class StaticTest 
{
	static int statInt = 4;
	static double statDouble = 16.0;
	int instInt;
	double instDouble;  //易出现找不到符号的问题
	public static void staticMethod(){		//输出静态变量的值
	   System.out.println("statInt=" + statInt + ";statdouble=" + statDouble);
	}

	public void instMethod(){		//输出实例变量的值
		System.out.println("instInt=" + instInt + ";instdouble=" + instDouble);
		}
	
	public StaticTest(int intArg,double doubleArg){
	   instInt = intArg;
	   instDouble = doubleArg;
	}

	public static void changestatic(int newInt,double newDouble){
														//改写静态变量的值
		statInt = newInt;
		statDouble = newDouble;
	}

	public static void main(String[] args) 
	{
		StaticTest instance1 = new StaticTest(1,2.0);
		StaticTest instance2 = new StaticTest(3,4.0);
		instance1.instMethod();		//调用实例方法
		instance2.instMethod();		//调用实例方法
		StaticTest.staticMethod();
		instance1.staticMethod();
		instance2.staticMethod();		//调用静态方法
		instance1.changestatic(8,8.0);		//改变静态变量的值
		instance2.staticMethod();
		StaticTest.staticMethod();			//再次输出静态变量的值
	}
}
