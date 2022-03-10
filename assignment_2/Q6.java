import java.util.*;
class Q6
{
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter first number");
	int i = s.nextInt();
	System.out.println("enter second number");
	int j = s.nextInt();
	int res;
	System.out.println("enter case number");
	int k = s.nextInt();
	switch(k)
	{
	case 1: res=i+j;
	System.out.println(" result of addition is = "+res);
	break;
	case 2:  res=i-j;
	System.out.println(" result of subtraction is = "+res);
	break;
	case 3:  res=i*j;
	System.out.println(" result of multiplication is = "+res);
	break;
	case 4:  res=i/j;
	System.out.println(" result of division is = "+res);
	break;
	case 5:  res=i%j;
	System.out.println(" result of mod operation is = "+res);
	break;
	default:
	System.out.printf("invalid case number");
	}
}
}	