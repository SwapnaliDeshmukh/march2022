import java.util.*;
class Q4
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st num");
		int a = s.nextInt();
		System.out.println("enter 2nd num");
		int b = s.nextInt();
		System.out.println("enter 3rd num");
		int c = s.nextInt();
		System.out.println("enter 4th num");
		int d = s.nextInt();
		System.out.println("enter 5th num");
		int e = s.nextInt();
		System.out.println("enter expression num");
		String i = s.next();
		int res;
		switch(i)
		{
		case "expression1" : res = -a + (b*c);
		System.out.println("res is = "+res);
		break;
		case "expression2" : res = (a+b)%c ;
		System.out.println("res is = "+res);
		break;
		case "expression3" : res = a +(-(b*c)/d);
		System.out.println("res is = "+res);
		break;
		case "expression4" : res = a + (b/(c*d))-(e%c);
		System.out.println("res is = "+res);
		break;
		}
	}
}	