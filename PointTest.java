
import java.util.*;
class PointTest
{
	public static void main (String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x1: ");
		float x1 = scan.nextFloat();
		System.out.println("Enter the value of y1: ");
		float y1 = scan.nextFloat();
		System.out.println("Enter the value of x2: ");
		float x2 = scan.nextFloat();
		System.out.println("Enter the value of y2: ");
		float y2 = scan.nextFloat();
		
		Point D1 = new Point();
		Point D2 = new Point();
		D1.setValuex(x1);
		D1.setValuey(y1);
		D2.setValuex(x2);
		D2.setValuey(y2);
		float dist = D1.calDis(D2);
		System.out.println("The distance between the two points is: "+String.format("%7.2f",dist));
	}
}
