/*
使用StringBuffer反字符串
*/

public class ReverseString  
{
	public static void main(String[] args) 
	{
		String strSource = new String("I love java");
		StringBuffer sbuf = new StringBuffer(strSource);
		System.out.println(sbuf.reverse());			//调用StringBuffer的反转方法
		String strDest = reverseIt(strSource);
		System.out.println(strDest);
	}
	public static String reverseIt(String source){
	   int i, len = source.length();
	   StringBuffer dest = new StringBuffer(len);
	   for (i = (len - 1); i >= 0 ; i -- )
			dest.append(source.charAt(i));
	   return dest.toString();
	}
}
