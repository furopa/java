import java.util.Scanner;
import java.lang.String;
class person
{
	String first;
	String second;
	String third;

	person(String f,String m,String l)
	{
		first=f;
		second=m;
		third=l;
	}
	public String toString()
	{
		return "["+third+","+first+","+second+"]";
	}

	public static void main(String[] args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the Full Name: ");
		String f,m,l;
		f=sc.next();
		m=sc.next();
		m=m.substring(0,1).toUpperCase()+m.substring(1);
		l=sc.next();
		person p=new person(f,m,l);
		System.out.println(p);
	}
}


