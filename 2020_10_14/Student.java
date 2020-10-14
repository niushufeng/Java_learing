/*
 * 1．编写一个Java程序片断，以定义一个表示学生的类Student。
 * 这个类的属性有“学号”、“班号”、“姓名”、“性别”、“年龄”，
 * 方法有“获得学号”、“获得班号”、“获得性别”、“获得姓名”、
 * “获得年龄”、“获得年龄”。
 * */

public class Student {
	private int student_id;		//学号
	private int class_id;		//班号
	private String name;		//姓名
	private boolean gender;		//性别
	private int age;			//年龄
	
	Student(int student_id, int class_id, String name, boolean gender,int age){
		this.student_id = student_id;
		this.class_id = class_id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getStudentId(){
	   return student_id;
	}
	
	public int getClassId(){
	   return class_id;
	}

	public String getName(){
	   return name;
	}

	public String getGender(){
	   if (gender)
	   {
		   return "male";
	   }else{ 
			return "female";
	   }
	}

	public int getAge(){
	   return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student testMan = new Student(1831050017,1801,"luoxiang",false,45);
		System.out.println(testMan.getStudentId());
		System.out.println(testMan.getClassId());
		System.out.println(testMan.getName());
		System.out.println(testMan.getGender());
		System.out.println(testMan.getAge());
	}

}
