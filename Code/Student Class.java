import java.io.*;

class student
{
		int rno;
		String name;
		double per;
		static int count;

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	void get() throws Exception
	{
		System.out.println("\n\t enter the rno,name and percentage");
		rno=Integer.parseInt(br.readLine());
		name=br.readLine();
		per=Double.parseDouble(br.readLine());
	}

		void display()
		{
			System.out.println("\n\t rno="+rno);
			System.out.println("\n\t name="+name);
			System.out.println("\n\t per="+per);
		}

		static void counter()
		{
			System.out.println(count+" object is created");
		}
}
class sclass
{
	public static void main(String arg[]) throws Exception
	{
		int i,j,n=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n\t how many student");
		n=Integer.parseInt(br.readLine());

		student st[]=new student[n];

		for(i=0;i<n;i++)
		{
			st[i]=new student();
			st[i].get();
		}
		for(i=0;i<n;i++)
			st[i].display();

		sortavg(st,n);

		System.out.println("\n\t ****sort by average****");
		for(i=0;i<n;i++)
			st[i].display();
		System.out.println("---------------------------------------");
	}

	static void sortavg(student st[],int n)
	{
		student temp;
		for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)

		if(st[i].per<st[j].per)
		{
			temp=st[i];
			st[i]=st[j];
			st[j]=temp;
		}
	}
}


