import java.io.*;

public class Java_2
{
    public static void main(String[] args) throws IOException
    {
        File inputFile;
        File outputFile;
        FileInputStream in;
        FileOutputStream out;
        int c;
        
        inputFile = new File("source.txt");
        outputFile = new File("dest.txt");
        in = new FileInputStream(inputFile);
     //*********Found********
        out = new FileOutputStream(outputFile);

        while ((c = in.read()) != -1)
     //*********Found********
           out.write(c);

        in.close();
        out.close();
    }
}

