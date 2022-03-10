import java.util.*;
class Q15
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter num1");
		System.out.println("enter num2");
		int i = s.nextInt();
		int j = s.nextInt();
		int temp;
		System.out.println("Before swapping i="+i+"and j="+j);
		temp=i;
		i=j;
		j=temp;
		System.out.println("after swapping i="+i+"and j="+j);
	}
}	
		