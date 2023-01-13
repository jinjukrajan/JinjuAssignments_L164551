package javaLearning;

import java.util.Scanner;

public class mainCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Please eneter the radius");
		double rad=input.nextInt();
		
Circle cir=new Circle(rad);
double result1=cir.getRadius();
double result2=cir.getArea();
System.out.println("The radius: "+result1 );
System.out.println("The Area: "+result2);
System.out.println("Please enter the Height");
double hgt=input.nextInt();
Cylinder cy=new Cylinder(rad,hgt);
double result3=cy.getHeight();
double result4=cy.getVolume();
System.out.println("The Height: "+result3 );
System.out.println("The Volume: "+result4);

	}

}
