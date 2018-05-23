
public class Circle extends Shapes {

	private final double pi = 3.14;  //pi is a constant
	private double radius = 1.0;     // input the radius (scanners are not used)
	
	private double area;
	private double diameter;
	private double perimeter;
	
	//Calculations
	@Override
	public void area(){
		this.area = (radius * radius) * pi;  
	}
	
	@Override
	public void diameter(){
		this.diameter = 2 * radius;
	}
	
	@Override
	public void perimeter(){
		this.perimeter = 2 * pi * radius;
	}

	
	//Generating Getters and Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getPi() {
		return pi;
	}
	
	
	
	
		
	
}
