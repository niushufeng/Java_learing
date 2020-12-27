import java.io.*;

public class Java_3
{
   public static void main(String[] args)
   {
      Java_3 exceptionExample = new Java_3();
     //*********Found**********
      try
      {
         FileInputStream fi = new FileInputStream("C:" + "\\" + "abc.txt");
      }
  //*********Found**********
      catch(FileNotFoundException ex)
      {
  //*********Found**********
         System.out.println(ex.getMessage()+
         "请确认文件路径及文件名是否正确！");
      }
   }
}

