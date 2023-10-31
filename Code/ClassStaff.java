import java.util.*;
import java.io.*;
abstract class Staff
{
	protected int id;
	protected String name;
	Staff(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	abstract void display();
}
class OfficeStaff extends Staff
{
	String department;
	OfficeStaff(int id,String name,String department)
	{
		super(id,name);
		this.department=department;
	}
	void display()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Department:"+department);
		System.out.println("==============================================");
	}
}
class A3SetA2
{
	public static void main(String args[])throws IOException
	{
		int i,n,r;
		String na,de;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of member:");
		n=s.nextInt();
		OfficeStaff st[]=new OfficeStaff[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the ID:");
			r=s.nextInt();
			System.out.println("Enter the Name:");
			na=s.next();
			System.out.println("Enter the Department:");
			de=s.next();
			st[i]=new OfficeStaff(r,na,de);
		}
		System.out.println("Staff details are:");
		for(i=0;i<n;i++)
		{
			st[i].display();
		}
	}
}
