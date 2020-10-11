public class chick 
{
	public static void main(String[] args) 
	{
		int count = 0;
		for (int i = 0; i <=20 ; i++)
		{
			for (int j = 0; j < 34; j++)
			{ 
				for (int k = 0; k <= 300 ; k = k +3)
				{
					if((5 * i + 3 * j + k/3 ==100) && (i + j + k == 100))
					{
						System.out.println("母鸡：" + i + "公鸡：" + j + "小鸡：" + k);
						count ++;
					}
				}
			}
		}
		System.out.println("共有"+count+"种买法");
	}
}
