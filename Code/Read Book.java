import java.io.*;
import java.lang.*;

class book
{
	int b_id,b_pr,b_qty;
	String b_name;

	book()
	{
	}

	book(int b_id,String b_name,int b_pr,int b_qty)
	{
		this.b_id=b_id;
		this.b_name=b_name;
		this.b_pr=b_pr;
		this.b_qty=b_qty;
	}

	long store(RandomAccessFile f) throws Exception
	{
		String bid="",bpr="",bqty="";

		bid+=b_id;
		bpr+=b_pr;
		bqty+=b_qty;

		long pos=f.getFilePointer();

		f.writeUTF(bid);
		f.writeUTF(b_name);
		f.writeUTF(bpr);
		f.writeUTF(bqty);

		return pos;
	}

	void access(RandomAccessFile f) throws Exception
	{
		b_id=Integer.parseInt(f.readUTF());
		b_name=f.readUTF();
		b_pr=Integer.parseInt(f.readUTF());
		b_qty=Integer.parseInt(f.readUTF());

		System.out.println("\n\t"+b_id+"\t"+b_name+"\t"+b_pr+"\t"+b_qty);
	}
} 
class setb1
{
	public static void main(String args[])throws Exception
	{
		RandomAccessFile f=new RandomAccessFile("book.dat","rw");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		book b;

		long max=0,total=0;

		System.out.print("\n\tHow many records : ");
		int n=Integer.parseInt(br.readLine());

		String nameTable[]=new String[n];
		long posTable[]=new long[n];
		long costTable[]=new long[n];
System.out.println("\n\tEnter details : ");
		for(int i=0;i<n;i++)
		{
			System.out.print("\n\tEnter bood Id : ");
			int b_id=Integer.parseInt(br.readLine());

			System.out.print("\n\tEnter book name : ");
			String b_name=br.readLine();

			System.out.print("\n\tEnter book price : ");
			int b_pr=Integer.parseInt(br.readLine());

			System.out.print("\n\tEnter book quantity : ");
			int b_qty=Integer.parseInt(br.readLine());

			b=new book(b_id,b_name,b_pr,b_qty);

			nameTable[i]=b_name;


			costTable[i]=(b_pr*b_qty);
			posTable[i]=b.store(f);
		}
		f.close();

		boolean done=false;

		RandomAccessFile f1=new RandomAccessFile("book.dat","r");

			book b1=new book();

		while(!done)
		{
			System.out.println("\n\t1.Search by name");
			System.out.println("\n\t2.Display all book and total cost");
			System.out.println("\n\t3.Find costlis");

			System.out.print("Enter choice : ");
			int choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1 :
						System.out.print("\n\tEnter name to search :");
						String b_name=br.readLine();
						boolean found=false;
									System.out.println("\n\tb_ID\tb_Name\tb_price\tb_quantity");
						for(int i=0;i<n;i++)
						{
							if(nameTable[i].equals(b_name))
							{
								found=true;
								f1.seek(posTable[i]);
								b1.access(f1);
							}
						}
						if(!found)
							System.out.println("Sorry,record not found...");
						break;

				case 2 :
						System.out.println("\n\tb_ID,\tb_Nmae,\tb_Price,\tb_Quantity\t");
							for(int i=0;i<n;i++)
							{
								f1.seek(posTable[i]);
								b1.access(f1);
								total+=costTable[i];
							}
							System.out.println("\n\t\tTotal Amount : "+total);
							break;

				case 3 :
							System.out.println("\n\tID\tName\tPrice\tQuantity");
								for(int i=0;i<n;i++)
								{
									if(costTable[i] > max)
										max=costTable[i];
								}
								for(int i=0;i<n;i++)
								{
									if(costTable[i]==max)
									{
										f1.seek(posTable[i]);
										b1.access(f1);
									}
								}
								break;
			}
			System.out.println("Do you want to continue (y/n) :");
			String ans=br.readLine();
			if(ans.equals("n"))
				done=true;
		}
	}
}








