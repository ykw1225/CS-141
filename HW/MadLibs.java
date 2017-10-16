//Yeung Kit Wong
//11/5/2014
//HW6

import java.io.*; //for file
import java.util.*; //for scanner

public class MadLibs
{
	public static void main (String[]args) throws FileNotFoundException
	{
		Scanner input = new Scanner (System.in);
		intro ();
		menu (input);
	}

	//The introduction
	public static void intro ()
	{
		System.out.println ("Welcome to the game of Mad Libs.");
		System.out.println ("I will ask you to provide various words");
		System.out.println ("and phrases to fill in a story.");
		System.out.println ("The result will be written to an output file.");
		System.out.println ();
	}

	//The menu selection
	public static void menu (Scanner input) throws FileNotFoundException
	{
		//Creat a string variable to save the selection answer from user
		String ans;
		do{
			System.out.print ("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
			ans = input.nextLine ().toLowerCase ();
			switch (ans)
			{
				case "c" : optionC (input);
							break;
				case "v" : optionV (input);
							break;
				default : ;
			}
		}while (!ans.equals("q"));
	}
	//Check if the input file is exist
	public static String inFileCheck (Scanner input) throws FileNotFoundException
	{
		String inFile = input.nextLine();
		File f = new File (inFile);
		while (!f.exists())
		{
			System.out.print ("File not found. Try again: ");
			inFile = input.nextLine();
			f = new File (inFile);
		}
		return inFile;
	}
	//Create a mad-lib
	public static void optionC (Scanner input) throws FileNotFoundException
	{
		//Setup the input file
		System.out.print ("Input file name: ");
		String inFileName =  inFileCheck (input);
		Scanner fin = new Scanner (new File (inFileName));
		//Setup the output file
		System.out.print ("Output file name: ");
		String outFileName =  input.next();
		PrintStream fout = new PrintStream (new File (outFileName));
		System.out.println();
		//Delete the \n in the input to make the first two questions do not come out together
		input.nextLine();
		//Get a whole line string from input file
		while (fin.hasNextLine ())
		{
			String line = fin.nextLine();
			//Setup a line scanner to get a single word from a line string
			Scanner lineScan = new Scanner (line);
			while (lineScan.hasNext ())
			{
				String word = lineScan.next();
				//Check if the word is starting with angle bracket
				if (word.startsWith ("<"))
				{
					//Replace the word with user input
					word = replaceWord (input, word);
					if (!lineScan.hasNext())
					{
						word += (".");
					}
				}
				//Write the single word and a space into the output file
				fout.print (word + " ");
			}
			fout.println();
		}
		System.out.println ("Your mad-lib has been created!");
		System.out.println ();
	}
	//View whether the input or output file
	public static void optionV (Scanner input) throws FileNotFoundException
	{
		System.out.print ("Input file name: ");
		String inFileName = inFileCheck (input);
		System.out.println ();
		//Setup a file scanner
		Scanner fin = new Scanner (new File (inFileName));
		while (fin.hasNextLine ())
		{
			String line = fin.nextLine();
			//Print out what the line string is
			System.out.println (line);
		}
		System.out.println ();
	}
	//A method to replace the word starts with angle brackets from user input
	public static String replaceWord (Scanner input, String word)
	{
		word = word.replace ('<', '\0').replace ('>', '\0').replace ('.', '\0').replace ('-', ' ');
		System.out.print ("Please type ");
		//Determind whether the word need "an" or "a" article
		if (word.startsWith ("a") || word.startsWith ("e") || word.startsWith ("i") || word.startsWith ("o") || word.startsWith ("u"))
		{
			System.out.print ("an ");
		}
		else
		{
			System.out.print ("a ");
		}
		System.out.print (word + ": ");
		word = input.nextLine();
		return word;
	}
}
