package javaTraining_Zoo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

import JavaTraining_Library.Librarybook;

public class ZooMethods {


	Scanner input= new Scanner(System.in);
	String backup;
	public  ArrayList<String> enclosures1= new ArrayList<String>();
	Anilmal Adetail[] = new Anilmal[20];
	 public static int count;
	 //public static int count1=0;
	 public int offSpringTotal=0;
	public  int totalExpense=0;
	public  int total=0;
	public void addEnclosure(Enclosure enclosure) {
		// TODO Auto-generated method stub
		for( int i=1;i<=enclosure.n;i++) 
		{
			System.out.println("Please enter the enclosure name"+i);
			String wenname=input.nextLine();
			//enclosure.enclosures.add(wenname);
			enclosures1.add(wenname);
		}
		System.out.println("PLEASE FIND THE BELOW ADDED ENCLOSURES");
		for(String name:enclosures1) {
			System.out.println(name);
		}
		//int r=getList(enclosure,"True");
		
	}
	
//	public int getList(Enclosure enclosure,String d) {
//		
//		if(d=="True") {
//			System.out.println("-------");
//			
//		}
//		else {
//			for(String name:enclosure.enclosures) {
//			
//			if(name.equalsIgnoreCase(d)) {
//				return 1;
//			}
//			return 1;
//		}
//		
//	}
//		return 0;
//	}

	public int displayMenu() {
System.out.println(" PRESS following options");
		
		System.out.println("1 - Add New Enclosure");
		
		System.out.println("2 - Add Animal to new Enclosure/calculate Total offspring and Expense");
		System.out.println("3 - Calculate total offspring");
		System.out.println("4 - Display All Books");
		 int userinp=input.nextInt();
		
		return userinp;
	}

	public void addAnimal(Anilmal anm2) {
		// TODO Auto-generated method stub
		offSpringTotal=anm2.sum;
		//System.out.println(offSpringTotal);
		totalExpense=anm2.sum1;
		//System.out.println(offSpringTotal);
		 if (count < 50) {
	       	 
	        	Adetail[count] = anm2;
	          count++;
	        }
	        else {
	        	System.out.println("Max animal capacity has been reached");
	        }
		 System.out.println("Calculated Offspring of all animals in selected enclosure is: "+ offSpringTotal);
		 System.out.println("Calculated expense of all animals in selected enclosure is: "+ totalExpense);
	}

	public void calculateOffspring(String encname4) {
		// TODO Auto-generated method stub
		
//		System.out.println(Adetail[0].offspring);
//		System.out.println(Adetail[1].offspring);
//		System.out.println(Adetail[2].offspring);
		
		
//		for(int i=0;i<count;i++) {
//			if(Adetail[i].encname==encname4)
//			total = total + Adetail[i].offspring;
//			
//		}
		//System.out.println("Calculated Offspring of all animals in selected enclosure is: "+ total);
	}
	

	

//	public void addAnimal(Anilmal anml) {
//		// TODO Auto-generated method stub
//		String S=encname;
//		//Enclosure enc=new Enclosure(S);
//
//		//int r= getList(enc,S);
//		///if(r==0)	{
//		for(String comp:enclosures1) {
//			if(comp.equalsIgnoreCase(S)) {
//				for (int i=0;i<anml.no;i++){
//					System.out.println("Please enter the Animal Type"+(i+1));
//					String anmlname=input.nextLine();
//				
//					anml.animals.add(anmlname);
//				}
//				}
//			else {
//				System.out.println("Provided enclosure is not available");
//				}
//		}
//				
//
//			
//	}

	
	}


