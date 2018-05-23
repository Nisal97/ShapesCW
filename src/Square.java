
public class Square extends Shapes {

	double length = 5.0; //inputting the length of the base
	double area;
	double perimeter;
	
	
	//Calculations
	@Override
	public void area(){
		this.area = (length * length);
	}
	
	@Override
	public void perimeter(){
		this.perimeter = 4 * length;
	}

	
	
	//Generate Getters and Setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
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
	
	
	
}
