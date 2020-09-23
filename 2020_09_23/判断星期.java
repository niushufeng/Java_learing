package m;

import java.util.Scanner;  // 导入外部程序Scanner

public class m890 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner( System.in );  // 创建扫描器对象sc
        int x;          // 定义一个int型变量x
        x = sc.nextInt();  // 键盘输入一个表示星期几的数值（1~7），保存到变量x中
        // 下列switch-case语句根据x的值显示对应的英文单词
        switch ( x ) {
        case 1:  System.out.println( "Monday" );     break;
        case 2:  System.out.println( "Tuesday" );     break;
        case 3:  System.out.println( "Wednesday" );  break;
        case 4:  System.out.println( "Thursday" );    break;
        case 5:  System.out.println( "Friday" );       break;
        case 6:  System.out.println( "Saturday" );     break;
        case 7:  System.out.println( "Sunday" );      break;
        default:  System.out.println( "Input Error" );  break;
        }
        // 每个case语句显示出对应的英文单词之后，程序功能即已完成
        // 因此使用break语句中途跳出switch语句

	}

}
