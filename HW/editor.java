import java.io.*;
import java.util.*;

public class editor
{
	public static final int place = 10, info = 5;
	public static void main (String[]args) throws FileNotFoundException
	{
		Scanner input = new Scanner (System.in);
		PrintStream fout = new PrintStream (new File("places.txt"));
		for (int i = 0; i < place; i++)
		{
			System.out.println ("For " + (i+1) + " place's ");
			for (int j = 0; j < info; j++)
			{
				String t = "";
				switch (j)
				{
					case 0: t = " name: ";
							break;
					case 1: t = " addree or similar description: ";
							break;
					case 2: t = " search tags: ";
							break;
					case 3: t = " latitude: ";
							break;
					case 4: t = " longitude: ";
							break;
					default:;
				}
				System.out.print (t);
				t = input.nextLine ();
				fout.println (t);
			}
			System.out.println();
		}
	}
}