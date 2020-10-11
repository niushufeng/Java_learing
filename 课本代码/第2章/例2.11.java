/*
	带标签break的使用
*/
class BreakLabel 
{
	public static void main(String[] args) 
	{
		boolean t = true;
		first:{
			second:{
				third:{
					System.out.println("Before the break.");
					if(t)
						break second;
					System.out.println("This won't execute");
				}
				System.out.println("This won't execute");
			}
			System.out.println("This is after second block.");
		}
	
	}
}
