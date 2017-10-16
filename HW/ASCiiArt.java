// Kit Wong
// 10/1/2014
// HW2
// ASCII Art

public class ASCiiArt
{
	public static void main(String[]args)
	{
		System.out.println("This is the Chinese Charecter of my name 'KIT'.");
		System.out.println();
		CuttingLine();
		Line();
		System.out.print("$$$$$$$$$    $$$$$$$$$\n"
			+"$$$$$$$$$    $$$$$$$$$\n"
			+"$$$$              $$$$\n"
			+"$$$$$$$        $$$$$$$\n"
			+"$$$$$$  $    $  $$$$$$\n"
			+"$$$$$  $$    $$  $$$$$\n");
		Line();
		System.out.println("$$$$  $$  $$  $$  $$$$");
		Line();
		CuttingLine();
		System.out.println();
	}
	public static void CuttingLine()
	{
		for(int i=0;i<11;i++)
		{
			System.out.print("-+");
		}
		System.out.println();
	}
	public static void Line()
	{
		for(int i=0;i<22;i++)
		{
			System.out.print("$");
		}
		System.out.println();
	}
}