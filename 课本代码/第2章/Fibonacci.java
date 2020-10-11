/*
计算斐波那契数列
*/

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		long f1,f2,f3,n = 50;
		f1 = f2 = 1;
		System.out.print(f1 + " " + f2 + " ");
		for (int i = 3; i <= n ; i ++)
		{
			f3 = f1 + f2;  //第3项是前两项之和
			f1 = f2;   //更新前两项f1和f2
			f2 = f3;
			System.out.print(f3 + " ");
			if (i % 10 == 0)  //输入10项后换行
			{
				System.out.println("");
			}

		}
			
	}
}
