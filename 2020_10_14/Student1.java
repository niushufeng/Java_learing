/*
 * 为类Student增加一个方法public String toString( )，
 该方法把Student类的对象的所有属性信息组合成一个字符串以便输出显示。
 编写一个Java Application程序，创建Student类的对象，并验证新增加的功能。
 * */

public class Student1 {
	private int student_id;		//学号
	private int class_id;		//班号
	private String name;		//姓名
	private boolean gender;		//性别
	private int age;			//年龄
	
	Student1(int student_id, int class_id, String name, boolean gender,int age){
		this.student_id = student_id;
		this.class_id = class_id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getStudentId(){		//获得学号
	   return student_id;
	}
	
	public int getClassId(){		//获得班级
	   return class_id;
	}

	public String getName(){		//获得姓名
	   return name;
	}

	public String getGender(){		//获得性别
	   if (gender)
	   {
		   return "male";
	   }else{ 
			return "female";
	   }
	}

	public int getAge(){			//获得年龄
	   return age;
	}
	
	public String toString(){
	   String id = "student_id:\t" + Integer.toString(student_id) + "\n";
	   String class_id = "class_id:\t" + this.class_id + "\n";
	   String name = "name:\t\t" + this.name + "\n";
	   String gender = "gender:\t\t" + getGender() + "\n";
	   String age = "age:\t\t" + this.age + "\n";
	   return id + class_id + name + gender + age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 testMan = new Student1(1831050017,1801,"luoxiang",true,25);		//输入参数
		System.out.println(testMan.toString());
	}
}
