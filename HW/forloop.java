//9/30/2014

public class forloop
{
	public static final int a=8;  // A global constant
	public static void main(String[]args)
	{
		for(int i=0; i<10;i++)  // This is a for loop from 0 through 9, and i is a counter.
		{
			System.out.print(i);  // Print out the value of the counter "i".
		}
		System.out.println();
		for(int i=a; i>0; i--)  // This is a for loop from  a through 1
		{
			System.out.print(i);
		}
		System.out.println();
	}
}