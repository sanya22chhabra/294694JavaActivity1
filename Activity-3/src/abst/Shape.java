package abst;
import java.util.*;
abstract class Shape{
	protected int value;
	public Shape(int value) {
		super();
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	abstract float calculateArea(int value);
	
}
class Circle extends Shape{
	public Circle(int value) {
		super(value);
	}

	float calculateArea(int value) {
		return (float)(value * value * 3.14);
	}
}
class Square extends Shape{
	public Square(int value) {
		super(value);
	}

	float calculateArea(int value) {
		return (float)(value * value);
	}
}
 class ShapeMain {
	public static void main(String[] args) {
		System.out.println("Circle\nSquare\nEnter the shape");
		Scanner sc = new Scanner(System.in);
		String shape = sc.next();
		int choice;
		if(shape.equalsIgnoreCase("circle")){
			choice = 1;
		}else{
			choice = 2;
		}
		int num;
		switch(choice){
		case 1:
			System.out.println("Enter the radius");
			num = sc.nextInt();
			Circle c  = new Circle(num);
			System.out.println("The area of the Circle is: "+String.format("%.2f",c.calculateArea(num)));
			break;
		case 2:
			System.out.println("Enter the side");
			num = sc.nextInt();
			Square s  = new Square(num);
			System.out.println("The area of the square is: "+String.format("%.2f",s.calculateArea(num)));
			break;	
		}
	}
}