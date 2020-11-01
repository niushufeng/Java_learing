/*
判断手机电话号码
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JudgeMobileNumber 
{
	public static void main(String[] args) 
	{
		Pattern p = null;
		Matcher m = null;
		boolean b = false;
		//正则表达式的第一位是1，第二位是3，4，5，结尾为9位数字的一串数字
		p = Pattern.compile("^[1][3-5] + \\d{9}");
		String[] numbers = {"176999955238","1258456","15966447885"};
		for (String s:numbers )
		{
			m = p.matcher(s);
			b = m.matches();
			System.out.println("手机号码正确" + b);
		}
		
	}
}
