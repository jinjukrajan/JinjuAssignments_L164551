package javaLearning;

public class Circle {

	
	public double radius;
	
	public Circle(double r) {
		
		if(r<0) {
			this.radius=0;
		}
		else {
			this.radius=r;
		}
	}
	
	public double getRadius() {
		
		
		return this.radius;
		
	}
	public double getArea () {
		double PI= Math.PI;
		
		double area=(this.radius*this.radius )* PI;
		return area;
		
	}
	
}
