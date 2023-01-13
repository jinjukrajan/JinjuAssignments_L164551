package javaLearning;

public class Cylinder extends Circle {
double height;
	public Cylinder(double r,double h) {
		super(r);
		if(h<0) {
			this.height=0;
		}
		else {
		this.height=h;}
		// TODO Auto-generated constructor stub
	}
	
	public double getHeight () {
		return height;
		
	}

	public double getVolume  () {
		
		double volume;
		volume=height*getArea();
		return volume;
		
	}
	
	
}
