//Kit Wong
//9-26-2014
//HW1

public class Song
{
	public static void main(String[]args)
	{
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();
		verse6();
	}
	public static void last2Lines()
	{
		System.out.println("I don't know why it wouldn't compile,\n"
			+"My TA just smiled.\n\n");
	}
	public static void loveCoding()
	{
		System.out.println("I added System.out.println(\"I <3 coding\"),");
		last2Lines();
	}
	public static void backslash()
	{
		System.out.println("I added a backslash to escape the quotes,");
		loveCoding();
	}
	public static void mainmethod()
	{
		System.out.println("I added a main method with its String[] args,");
		backslash();
	}
	public static void classes()
	{
		System.out.println("I added a public class and called it Scum,");
		mainmethod();
	}
	public static void software()
	{
		System.out.println("I open my JAVA software on my desktop,");
		classes();
	}
	public static void verse1()
	{
		System.out.println("I once wrote a program that wouldn't compile");
		last2Lines();
	}

	public static void verse2()
	{
		System.out.println("My program did nothing\n"
			+"So I started typing.");
		loveCoding();
	}

	public static void verse3()
	{
		System.out.println("\"Parse error,\" cried the compiler\n"
			+"Luckily I'm such a code baller.");
		backslash();
	}
	public static void verse4()
	{
		System.out.println("Now the compiler wanted an identifier\n"
			+"And I thought the situation was getting dire.");
		mainmethod();
	}
	public static void verse5()
	{
		System.out.println("Java complained it expected an enum\n"
			+"Boy, these computers really are dumb!");
		classes();
	}
	public static void verse6()
	{
		System.out.println("I am feeling happy very much right now\n"
			+"Because I can start to play JAVA with fingers.");
		software();
	}
}