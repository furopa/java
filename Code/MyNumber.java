class MyNumber
{
	private int n;
	public MyNumber()
	{
		n=0;
	}

	public MyNumber(int n)
	{
		this.n=n;
	}

	public void isPositive(int n)
	{
		if(n>0)
			System.out.println("Given Number is Positive");
	}
	
	public void isNegative(int n)
	{
		if(n<0)
			System.out.println("Given Number is Negative");
	}

        public void isZero(int n)
	{
		if(n==0)
			System.out.println("Given Number is Zero");
	}

        public void isEven(int n)
	{
		if(n==0)
			System.out.println("Given Number is Even");
	}
        
        public void isOdd(int n)
	{
		if(n%2!=0)
			System.out.println("Given Number is Odd");
	}
}
class SetB2
{
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException
	{
		int num=Integer.parseInt(args[0]);
		MyNumber m= new MyNumber();

		m.isPositive(num);
		m.isNegative(num);
		m.isZero(num);
		m.isEven(num);
		m.isOdd(num);
	}
}

