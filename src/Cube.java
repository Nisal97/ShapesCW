
public class Cube extends Shapes {

	double length = 10.0; //input length of the cube edge
	double area;
	double perimeter;
	
	
	//Calculations
	@Override
	public void area(){
		this.area = (length * length) * 6;  //cube has 6 square faces  
	}
	
	@Override
	public void perimeter(){
		this.perimeter = 12 * length; //cube has 12 edges
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
