/*
将字符串数组按字典重新排序
*/

public class SortStrs 
{
	public static void main(String[] args) 
	{
		String a[] = {"java","Basic","C++","Fortran","SmallTalk"};
		for (int i = 0; i < a.length - 1 ; i ++ )
		{
			for (int j = i + 1;j < a.length ; j ++ )
			{
				if(a[j].compareTo(a[i])<0){
				   String temp = a[i];
				   a[i] = a[j];
				   a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length ;i ++ )
		{
			System.out.print(" " + a[i]);
		}
		
	}
}
