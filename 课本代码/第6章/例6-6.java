/*
使用正则表达式检查IP地址
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIPAddress
{
	public static void main(String[] args) 
	{
		Pattern p = null;
		Matcher m = null;
		boolean b = false;
		//构造匹配IP地址的模式
		p = Pattern.compile("[1-2]\\d{0,2} + \\.[1-2]\\d{0,2} + \\.[1-2]\\d{0,2} + \\.[1-2]\\d{0,2}");
		String[] ips = {"176999955238","1258456","15966447885"};
		for (String s:ips )
		{
			m = p.matcher(s);
			b = m.matches();
			System.out.println("IP地址正确：" + b);
		}
	}
}
