
public class Polygon extends Shapes {

	double length = 6.0;
	int sides = 4;
	
	double area;
	double perimeter;
	
	
	//Calculation
	@Override
	public void perimeter(){
		this.perimeter = length * sides;
	}

	
	//Generate Getters and Setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}


	@Override
	public void diameter() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
}
