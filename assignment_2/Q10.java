import java.util.*;
class Q10
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter x");
		float x = s.nextFloat();
		float y=1.0f;
		double res;
		System.out.println("enter i");
		int i = s.nextInt();
		res = x*(1-(y/i)+(y/(i+2))-(y/(i+4))+(y/(i+6))-(y/(i+8)));
		System.out.println("res is = "+res);
	}
}
		
		
		
		
