class CA 
{
	String s = "class CA";
}

class CB extends CA
{
	String s = "class CB";
}

class Convert
{
	public static void main(String args[]){
	   CB bb,b = new CB();
	   CA a,aa;
	   a = (CA)b;	//显式转换
	   aa = b;		//隐式转换
	   System.out.println(a.s);
	   System.out.println(aa.s);
	   bb = (CB)a;		//显式转换
	   System.out.println(bb.s);
	}
}
