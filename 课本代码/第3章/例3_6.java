import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
public class SortByChinese  
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		String[] arrStrings = {"计算机","长江","通信","数学"};
		Arrays.sort(arrStrings);
		for (int i = 0;i < arrStrings.length ; i ++ )
			System.out.println(arrStrings[i]);
		System.out.println("----------------------------");
		// Collator 类是用来执行区分语言环境的字符串比较，这里选择用CHINA
		Comparator comparator = Collator.getInstance(java.util.Locale.CHINA);
		//根据指定比较机器产生的顺序对指定对象组进行排序
		//@SuppressWarnings("unchecked")
		Arrays.sort(arrStrings,comparator);
		for (int i = 0 ; i < arrStrings.length ; i ++ )
			System.out.println(arrStrings[i]);
	}
}
