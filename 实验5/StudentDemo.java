/*
假定根据学生的3门学位课程的分数决定其是否可以拿到学位，对于本科生，
如果3门课程的平均分数超过60分即表示通过，而对于研究生，则需要平均超过80分才能够通过。
根据上述要求，请完成以下Java类的设计：
（1）设计一个基类Student描述学生的共同特征。
（2）设计一个描述本科生的类Undergraduate，该类继承并扩展Student类。
（3）设计一个描述研究生的类Graduate，该类继承并扩展Student类。
（4）设计一个测试类StudentDemo，分别创建本科生和研究生这两个类的对象，并输出相关信息。
*/
class Student
{
	public int student_id;		//学生学号
	public double a,b,c;		//三个科目
	public double average;		//平均成绩
	int status;
}

class Undergraduate extends Student
{
	Undergraduate(int s,double a,double b,double c){
	   this.student_id = s;
	   this.a = a;
	   this.b = b;
	   this.c = c;
	   this.average = (a+b+c) / 3;
	}
	public void Display(){
	   if(this.average >= 60)
		   status = 1;
	   else
		   status = 0;
	   if(status == 1)
		   System.out.println(student_id + ":通过！");
	   if(status == 0)
		   System.out.println(student_id + ":不通过！");
	}
}

class Graduate extends Student
{
	Graduate(int s,double a,double b,double c){
	   this.student_id = s;
	   this.a = a;
	   this.b = b;
	   this.c = c;
	   this.average = (a+b+c) / 3;
	}
	public void Display(){
	   if(this.average >= 80)
		   status = 1;
	   else
		   status = 0;
	   if(status == 1)
		   System.out.println(student_id + ":通过！");
	   if(status == 0)
		   System.out.println(student_id + ":不通过！");
	}
}

public class StudentDemo
{
	public static void main(String[] args) 
	{
		Undergraduate st1 = new Undergraduate(1831050017,20,80,100);
		st1.Display();
		Graduate st2 = new Graduate(1831050017,80,80,80);
		st2.Display();
	}
}
