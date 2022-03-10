import java.util.*;
class Q11
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter radius");
		float r = s.nextFloat();
		final float pi = 3.142f;
		double area=pi*r*r;
		double perimeter=2*pi*r;
		System.out.println("Area of circle is ="+area);
		System.out.println("Perimeter of circle is ="+perimeter);
	}
}	