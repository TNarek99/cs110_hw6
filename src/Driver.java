import Shapes.*;
import utils.Math;

public class Driver {
	public static void main (String[] str) {
		Square square = new Square(100);
		System.out.println(square.getArea());
		
		Rectangle rectangle = new Rectangle(50, 80);
		System.out.println(rectangle.getArea());
		
		double num = 15.6;
		int numInt = (int)num;
		
		int factorial = Math.factorial(numInt);
		int factorialLoop = Math.factorialLoop(numInt);
		
		System.out.println(factorial);
		System.out.println(factorialLoop);
	}
}
