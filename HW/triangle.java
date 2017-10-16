public class triangle
{
	public static void main(String[]args)
	{
		printstars(5);
		printstars(8);
	}
	public static void printstars(int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int a=size-i;a<size;a++)
			{
				System.out.print("-");
			}
			for(int b=0+i;b<size;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}