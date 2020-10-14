public class MainTest 
{
	public static void main(String[] args) 
	{
		int n = args.length;
		if(n == 0)
			System.out.println("no parament ! ");
		else{
		   System.out.println("number of paraments:" + n);
		   for (int i = 0;i < n ;i ++ )
			   System.out.println("args[" + i + "]=" + args[i]);
		}
	}
}
