// Kit Wong
// 10/1/2014
// HW2
// RocketShip

public class RocketShip
{
	public static final int LENGTH=3;

	public static void main(String[]args)
	{
		System.out.println();
		head();
		line();
		uparry();
		downarry();
		line();
		uparry();
		downarry();
		line();
		head();
		System.out.println();
	}

	public static void head()
	{
		for(int i = 1; i <= 2 * LENGTH - 1; i++)
		{
			for(int a = 2 * LENGTH - i; a >= 1; a--)
			{
				System.out.print(" ");
			}
			for(int b = 1; b <= i; b++)
			{
				System.out.print("/");
			}
			System.out.print("**");
			for(int c = 1; c <= i; c++)
			{
				System.out.print("\\");
			}
			System.out.println();
		}
	}

	public static void line()
	{
		System.out.print("+");
		for(int i = 1; i <= LENGTH * 2; i++)
		{
			System.out.print("=*");
		}
		System.out.println("+");
	}
	public static void uparry()
	{
		for(int i = 1; i <= LENGTH; i++)
		{
			System.out.print("|");
			for(int a = LENGTH-i; a >= 1; a--)
			{
				System.out.print(".");
			}
			for(int b = 1; b <= i; b++)
			{
				System.out.print("/\\");
			}
			for(int a = LENGTH-i; a >= 1; a--)
			{
				System.out.print(".");
			}
			for(int a = LENGTH-i; a >= 1; a--)
			{
				System.out.print(".");
			}
			for(int b = 1; b <= i; b++)
			{
				System.out.print("/\\");
			}
			for(int a = LENGTH-i; a >= 1; a--)
			{
				System.out.print(".");
			}
			System.out.println("|");
		}
	}
	public static void downarry()
	{
		for(int i = 1; i <= LENGTH; i++)
		{
			System.out.print("|");
			for (int a = 1; i != 1 && a < i; a++)
			{
				System.out.print(".");
			}
			for (int b = 0; b <= LENGTH - i; b++)
			{
				System.out.print("\\/");
			}
			for (int a = 1; i != 1 && a < i; a++)
			{
				System.out.print(".");
			}
			for (int a = 1; i != 1 && a < i; a++)
			{
				System.out.print(".");
			}
			for (int b = 0; b <= LENGTH - i; b++)
			{
				System.out.print("\\/");
			}
			for (int a = 1; i != 1 && a < i; a++)
			{
				System.out.print(".");
			}
			System.out.println("|");
		}
	}
}
