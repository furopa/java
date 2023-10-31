import java.util.Scanner;

public class A3setba
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("How namy details do you want");
		n=sc.nextInt();
		purchaseorder po=new purchaseorder();
		salesorder so=new salesorder();

		for(i=0;i<n;i++)
		{
			po.accepts();
			so.accept();
		}
		System.out.println("######################################");
		System.out.println("Purchase Order Details are:");
		for(i=0;i<n;i++)
		{
			po.displays();
			so.display();
		}
	}
}

abstract class order
{
	int id;
	String description;
}
class purchaseorder extends order
{
	String customer_name;
	void accepts()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter description");
		description=sc.next();
		System.out.println("Enter customer name");
		customer_name=sc.next();
	}
	void displays()
	{
		System.out.println(id+"\t\t"+description+"\t\t"+customer_name);
		System.out.println();
	}
}
class salesorder extends order
{
	String vendor_name;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id :");
		id=sc.nextInt();
		System.out.println("Enter the description :");
		description=sc.next();
		System.out.println("Enter the vendor name :");
		vendor_name=sc.next();
	}
	void display()
	{
		System.out.println(id+"\t\t"+description+"\t\t"+vendor_name);
	}
}


