import java.util.Random;

public class Java_2
{
	public static void main(String args[]){
		Random random = new Random();
		float p = random.nextFloat();//产生0.0与1.0之间的一个浮点数
		int n = Math.round(10*p);    //构造10以内的一个整数
		long f = 1 ;                 //保存阶乘的结果
		int i = 1 ;                  //循环变量
   //*********Found********
                do {f = f *i;
                    i++;
   //*********Found********
                }while(n>=i);  	
		System.out.println(n+"!= "+f);
	}
}

