class SetA4
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,3,4,5,6,7,8};
	        System.out.println("before");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("r");
		System.out.println("Array in Reverse:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
