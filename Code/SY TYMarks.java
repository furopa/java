package SY;

import java.io.BufferedReader;
import java.io.*;
public class SYMarks
{
	public int ct,mt,et;
	public void get() throws IOException
	{
		System.out.println("Enter Marks of student for computer,maths and electronics subject out of 200");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ct=Integer.parseInt(br.readLine());
		mt=Integer.parseInt(br.readLine());
		et=Integer.parseInt(br.readLine());
	}
}

package TY;

import java.io.*;
public class TYMarks
{
	public int tm,pm;
	public void get() throws IOException
	{
		System.out.println("Enter the marks of theory out of 400 and practival out of 200:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		tm=Integer.parseInt(br.readLine());
		pm=Integer.parseInt(br.readLine());
	}
}

