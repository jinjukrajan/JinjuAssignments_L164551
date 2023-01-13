package javaTraining_Zoo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

import JavaTraining_Library.Librarybook;

public class ZooMethods {


	Scanner input= new Scanner(System.in);
	String backup;
	public  ArrayList<String> enclosures1= new ArrayList<String>();
	
	 public static int count=0;
	
	
	public void addEnclosure(Enclosure enclosure) {
		// TODO Auto-generated method stub
		for( int i=1;i<=enclosure.n;i++) 
		{
			System.out.println("Please enter the enclosure name"+i);
			String wenname=input.nextLine();
			
			enclosures1.add(wenname);
			//en[i]=enclosures1.get(i);
		}
		System.out.println("PLEASE FIND THE BELOW ADDED ENCLOSURES");
		for(String name:enclosures1) {
			System.out.println(name);
		}
	
		
	}
	



	public int displayMenu() {
System.out.println(" PRESS following options");
		
		System.out.println("1 - Add New Enclosure");
		
		System.out.println("2 - Add Animal to new Enclosure");
		System.out.println("3 - Calculate total offspring");
		System.out.println("4 - Calculate Total Expense");
		System.out.println("5 - Get All Animals");
		System.out.println("6 - Get All enclosures");
		 int userinp=input.nextInt();
		
		return userinp;
	}

	public void addAnimal(Anilmal anm2) {
		// TODO Auto-generated method stub
	//	offSpringTotal=anm2.sum;
		//System.out.println(offSpringTotal);
	//	totalExpense=anm2.sum1;
		//System.out.println(offSpringTotal);
		
		 if (count < 50) {
	       	 
		//	 Anmldetail[count] = anm2;
	          count++;
	     //     System.out.println( Anmldetail[count] );
	        }
	        else {
	        	System.out.println("Max animal capacity has been reached");}
	        }

	public void listAllEnclosures() {
		// TODO Auto-generated method stub
		
		System.out.println("PLEASE FIND THE BELOW ADDED ENCLOSURES");
		for(int i=0;i<enclosures1.size();i++) {
			System.out.println("OOO");
			System.out.println(enclosures1.get(i));
		}
	}
	

	



	
	}


