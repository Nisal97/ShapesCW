
public class Triangle extends Shapes {
	
	double length = 4.0; //length of the base of triangle
	double height = 2.0;
	double area;
	//double perimiter;
	private double perimeter;
	private double perimiter;
	
	
	//Calculation
	@Override
	public void area(){
		this.area = (length * height)/2;
	}
	
	@Override
	public void perimeter(){
		this.perimeter = (length * 3);
	}

	
	//Generate Getters and Setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimiter() {
		return perimiter;
	}

	public void setPerimiter(double perimiter) {
		this.perimiter = perimiter;
	}

	@Override
	public void diameter() {
		// TODO Auto-generated method stub
		
	}
	

}
