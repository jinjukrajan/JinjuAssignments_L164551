package javaTraining_Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Anilmal {
	Scanner input= new Scanner(System.in);
	public int no;
	public String encname;
	public String atype; 
	public int offspring;
	public int expense;
	public int sum=0;
	public int sum1=0;
	public  ArrayList<String> animals= new ArrayList<String>();
	public String[][] enclosureDetails=new String[30][30];
	String[] Aname=new String[20];
	public  ArrayList<String> animalType= new ArrayList<String>();
	int count=0;
	ZooMethods zm=new ZooMethods();
	public void AnilmalDetails(String encname2, String typea) {

		this.encname=encname2;
		enclosureDetails[count][0]=encname;
		
		System.out.println("Please enter the no of animals to be added");
		
		this.no=input.nextInt();
//		System.out.println("Please enter animalType");
	this.animalType.add(typea);
	
	
	for (int i=0;i<this.no+1;i++) {
		System.out.println("Please enter animal name"+(i));
		String str=input.nextLine();
		animals.add(str);
		
	}
		
		for(int i=0;i<this.no;i++) {
			
			
			
			System.out.println("Please enter Offspring for Animal of"+ (i+1));
			this.offspring=input.nextInt();
			this.sum=sum+this.offspring;
			System.out.println("Please enter Expense for Animal "+ (i+1));
			this.expense=input.nextInt();
			this.sum1=sum1+this.expense;
			
		}
		count++;
	}

	public void calculateOffspring(String enclosure4) {
		// TODO Auto-generated method stub
		
	if((this.encname).contains(enclosure4))	{
		 System.out.println("Calculated Offspring of all animals in selected enclosure is: "+ sum);
			
	}
	else {
		System.out.println("This enclosure is not available");
	}
	
	}
	
	

	public void calculateExpenses(String enclosure4) {
		// TODO Auto-generated method stub
		if((this.encname).contains(enclosure4))	{
			 System.out.println("Calculated expense of all animals in selected enclosure is: "+ sum1);
				
		}
		else {
			System.out.println("This enclosure is not available");
		}	
	}

	public void getAnimalByType(String enclosure4, String typeanml) {
		// TODO Auto-generated method stub
		System.out.println("Animals belongs to the specific search" );
		if(this.encname.contains(enclosure4)) {
			for(String x:animalType) {
				if(x.contains(typeanml)) {
					
					for(int i=0;i<this.no+1;i++) {
						System.out.println(animals.get(i));
					}
					
				}
				
			}
		}
		else {
		System.out.println(" No animals present in the given enclosure and animalType");
		}
	}
	
	
	
}
