import java.util.*;
class Q13
{ 
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter length and breadth");
		double l = s.nextDouble();
		double b = s.nextDouble();
		double Area = l*b;
		double perimeter = (2*(l+b));
		System.out.println(" Area of rectangle = "+Area);
		System.out.println(" perimeter of rectangle = "+perimeter);
		
		
	}
}