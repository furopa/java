import java.io.*;

public class nodisp
{
	public static void main(String[] args) throws IOException
	{
		int a=args.length;
		int arr[]=new int[a];
	if(args.length>5)
	{
			System.out.println("You Have Entered More Than Five Elements");
	}
	else
	{
			System.out.println("Unsorted Elements");
		                for(int i=0;i<args.length;i++)
				{
					arr[i]=Integer.parseInt(args[i]);
					System.out.println(args[i]);
				}
			System.out.println("-----------------------");
			for(int i=0;i<a;i++)
			{
				for(int j=i+1;j<a;j++)
				{
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
	System.out.println("Sorted Elements");

	for(int i=0;i<args.length;i++)
	{
		System.out.println(arr[i]+"\t");
	}
	}
	
	}
}






