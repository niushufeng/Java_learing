public class ThisTest 
{
	public static void main(String[] args) 
	{
		Local aa = new Local();
	}
}

class Local
{
	public int i = 1;		//这个i是成员变量
	Local(int i){			//这个i是局部变量
	System.out.println("this.i = " + this.i);		//this.i 指的是对象本身的成员变量i
	System.out.println("i = " + i);		//变量i前没有this，因此是局部变量
	}
	Local(){
	   this(6);
	}
}
