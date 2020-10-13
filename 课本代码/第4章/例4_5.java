/*
通过构造方法对Student对象进行初始化
*/
class Student 
{
	int no;
	String name;

	Student(int l_no,String l_name){		//定义构造方法
	   this.no = l_no;
	   this.name = l_name;			//对成员变量no,name初始化
	}


	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "ZhangShan");	//l_no = 1; l_name = ZhangShan
		Student s2 = new Student(2, "XiaoMing");	//l_no = 2; l_name = XiaoMing
		System.out.println("name=" + s1.name + " no=" + s1.no);
		System.out.println("name=" + s2.name + " no=" + s2.no);
	}
}
