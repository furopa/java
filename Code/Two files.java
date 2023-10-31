import java.io.*;
import java.util.*;
class seta3
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Source file name:\n");
		String file1=sc.next();
		System.out.print("Destination file name:\n");
		String file2=sc.next();
		FileReader fin=new FileReader("first.txt");
		FileWriter fout=new FileWriter("second.txt",true);
		int c;
		while((c = fin.read())!=-1)
		{
		fout.write(c);
		}
		System.out.println("End of file...");
		fin.close();
		fout.close();
	}
}



