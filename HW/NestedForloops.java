public class NestedForloops
{
	public static void main(String[]args)
	{
		nestedOne();
	}
	public static void nestedOne()
	{
		for(int row=1; row<=5; row++)
		{
			for(int col=1; col<=5; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}