
public class Main {

	public static void main(String[] args){
		
		Circle circle = new Circle();
		circle.area();
		circle.diameter();
		circle.perimeter();
		System.out.println("Circle area = " + circle.getArea());
		System.out.println("Circle diameter = " + circle.getDiameter());
		System.out.println("Circle perimeter = " + circle.getPerimeter());
		
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		
		Triangle triangle = new Triangle();
		triangle.area();
		triangle.perimeter();
		System.out.println("Triangle area = " + triangle.getArea());
		System.out.println("Triangle perimiter = " + triangle.getPerimiter());
		
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		
		Square square = new Square();
		square.area();
		square.perimeter();
		System.out.println("Square area = " + square.getArea());
		System.out.println("Square perimiter = " + square.getPerimeter());
		
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		
		Cube cube = new Cube();
		cube.area();
		cube.perimeter();
		System.out.println("Cube area = " + cube.getArea());
		System.out.println("Cube perimiter = " + cube.getPerimeter());
		
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		
		Polygon polygon = new Polygon();
		polygon.perimeter();
		System.out.println("Polygon perimeter = " + polygon.getPerimeter());
		
		System.out.println("-----------------------------------------------------------------------------------------------------------");
				
	}
}
