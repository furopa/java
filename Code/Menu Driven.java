import java.util.Scanner;
import java.io.*;
class SetA3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Volume of cylinder\n 2.factorial\n 3.armstrong\n 4.exit");
		System.out.println("Enter your Choice");
		String ch=sc.next();
		switch(ch)
		{
			case "1":
				float p=3.14f;
				System.out.println("Enter radius");
				int ra=sc.nextInt();
				System.out.println("Enter height");
				int h=sc.nextInt();
				float vol=p*ra*ra*h;
				System.out.println("Volume of cylinder is:"+vol);
				break;
			case "2":
				int fact=1;
				System.out.println("Enter number for finding factorial");
				int n=sc.nextInt();
				for(int i=n;i>=1;i--)
				{
					fact=fact*i;
				}
				System.out.println("factorial="+fact);
				break;
			case "3":
				System.out.println("Enter Number");
				int s=sc.nextInt();
				int n1=s;
				int sum=0,r;
				while(s>0)
				{
					r=s%10;
					sum=sum+(r*r*r);
					s=s/10;
				}
				if(sum==n1)
				{
					System.out.println("No.is armstrong");
				}
				else
				{
					System.out.println("No.is not an armstrong");
				}
				break;
			case "4":
				return;
		}
	}
}
