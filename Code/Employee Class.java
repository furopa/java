import java.util.Scanner;
class employee
{
	int id;
	String name;
	float salary;
	String deptname;
	static int numberofobjects=1;
	employee()
	{
		id=0;
		name="";
		deptname="";
		salary=0;
	}
	employee(int id,String name,String deptname,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		numberofobjects++;
	}
	void display()
	{
		System.out.println(id+"\t"+name+"\t"+deptname+"\t"sal);
	}

	static void counter()
	{
		System.out.println(count+"object is created");
	}
	
class setA1
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of employee:");
		int n=Integer.parseInt(br.readLine());
		employee p[]=new employee[n];
		for( int i=0;i<n;i++)
		{
			System.out.println("Enter id:");
			int id=Integer.parseInt(br.readLine());

			System.out.println("Enter name:");
			String name=br.readLine();

			System.out.println("Enter deptname:");
			String dept=br.readLIne();

			System.out.println("Enter salary:");
			float sal=Float.parseFloat(br.readLine());

			p[i]=new employee(id,name,deptname,salary);
			p[i].counter();
			System.out.println("=======================================");
			for(int i=0;i<n;i++)
			p[i].display();
			System.out.println("=======================================");
		}
	}
}
}

