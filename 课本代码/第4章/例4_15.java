package code0406;

public class MyDate
{
	private int day,month,year;		//定义私有变量
	public void tomorrow(){
	   day = day + 1;		//本类可以引用私有变量
	}
	public void setDay(int d){
	   day = d;
	}
}

package code0406;

public class MyDateUser  
{
	public static void main(String[] args) 
	{
		MyDate mydate = new MyDate();
		mydate.day = 21;		//错误
		System.out.println("day = " + mydate.day);		//错误
		mydate.setDay(21);
	}
}
