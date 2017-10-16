public class ReturnExamples
{
	public static void main(String[]args)
	{
		System.out.println(hypotenuse(5.0,4.0));
	}
	public static double hypotenuse(double a, double b)
	{
		double hyp=Math.sqrt(a*a+b*b);
		return hyp;
	}
}