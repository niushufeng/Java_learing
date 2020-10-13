/*
构造方法重载
*/
public class StudentOverload 
{
	int no;
	String name;
	StudentOverload(String l_name){
	   no = 0;
	   name = l_name;
	}

	StudentOverload(int l_no, String l_name){
	   no = l_no;
	   name = l_name;
	}
	public static void main(String[] args) 
	{
		StudentOverload s1 = new StudentOverload("ZhangShan");
		StudentOverload s2 = new StudentOverload(2,"XiaoMing");
		System.out.println("name=" + s1.name + "no=" + s1.no);
		System.out.println("name=" + s2.name + "no=" + s2.no);
	}
}
