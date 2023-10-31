import java.util.*;
interface ProductMarker{}

class Product implements ProductMarker
{
	int id,cost,quantity;
	String name;

	Product() //constructor default
	{
		id=0;
		name=" ";
		cost=0;
		quantity=0;
	
	}

	Product(int id, String name, int cost, int quantity)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.quantity=quantity;
	}
}

public class Products
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("How many products");
		int n=a.nextInt();

		System.out.println("\n");
		Product p[] = new Product[n];//Array of objects
		System.out.println("Enter Products Data");
		for(int k=0;k<n;k++)
		{

			System.out.println("Product Id");
			int id = a.nextInt();
			System.out.println("Product name");
			String name = a.next();
			System.out.println("Product cost");
			int cost = a.nextInt();
			System.out.println("Product quantity");
			int quantity = a.nextInt();
	      		System.out.println("\n");
			p[k] = new Product(id, name, cost, quantity);
		}

		if(p[0] instanceof ProductMarker)
		{
		System.out.println("Class is using product marker ");
		}

			System.out.println("Product detail");
			for(Product pr:p)
			{
				System.out.println("Product Id " +pr.id);
				System.out.println("Product name" +pr.name);
				System.out.println("Product cost " +pr.cost);
				System.out.println("Product quantity" +pr.quantity);
				System.out.println("\n");
			}
		
	}
}








	
























