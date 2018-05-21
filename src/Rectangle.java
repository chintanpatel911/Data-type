
/*
 * Name : Chintan Patel 
 * CSU ID : 2473177	
 * Assigment 5 : calculate rectangle
 */
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args)
	{
		Scanner input =  new Scanner(System.in);
		double l1,l2,l3,w1,w2,w3;
		System.out.println("Enter length of first triangle : ");
		l1 = input.nextDouble();
		System.out.println("Enter width of first triangle : ");
		w1 = input.nextDouble();
		System.out.println("Enter length of second triangle : ");
		l2 = input.nextDouble();
		System.out.println("Enter width of second triangle : ");
		w2 = input.nextDouble();
		System.out.println("Enter length of third triangle : ");
		l3 = input.nextDouble();
		System.out.println("Enter width of third triangle : ");
		w3 = input.nextDouble();
		
		System.out.println("First Rectangle's area : " + getArea(l1, w1)  +  " , Perimeter : " + getPerimeter(l1, w1) );
		System.out.println("Second Rectangle's area : " + getArea(l2, w2)  +  " , Perimeter : " + getPerimeter(l2, w2));
		System.out.println("Third Rectangle's area : " + getArea(l3, w3)  +  " , Perimeter : " + getPerimeter(l3, w3));

	}

	public static double getArea(double length , double width)
	{
		return length*width ;
	}
	
	public static double getPerimeter(double length , double width)
	{
		return 2*(length + width);
	}
}

/*Output

 Enter length of first triangle : 
40
Enter width of first triangle : 
20
Enter length of second triangle : 
50
Enter width of second triangle : 
100
Enter length of third triangle : 
10
Enter width of third triangle : 
30
First Rectangle's area : 800.0 , Perimeter : 120.0
Second Rectangle's area : 5000.0 , Perimeter : 300.0
Third Rectangle's area : 300.0 , Perimeter : 80.0

*/
