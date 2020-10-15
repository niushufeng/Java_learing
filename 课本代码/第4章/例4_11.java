/*
实现一对象计数器
当新创建一个该类的对象时，计数器自动加1，
当删除一个该类的对象时，计数器自动减1
*/

public class Counter 
{
	public static int num = 0;		//用于记录对象数的静态成员变量
	public Counter(){
	   num ++;
	   System.out.println("after new N0 = " + num);
	}

	public static void delete(Counter o){
	   num --;
	   System.out.println("after delete NO = " + num );
	   o = null;
	   System.gc();		//手工方式回收无用的对象		
	}
	
	public static void main(String[] args) 
	{
		Counter [] objs = new Counter[5];
		for (Counter obj: objs )
		{
			obj = new Counter();
		}
		Counter.delete(objs[1]);
		Counter.delete(objs[0]);
	}
}
