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
	
	public Anilmal(String encname2) {

		this.encname=encname2;
		System.out.println("Please enter the no of animals to be added");
		this.no=input.nextInt();
		
		
		for(int i=0;i<this.no;i++) {

			System.out.println("Please enter Offspring for Animal of"+ (i+1));
			this.offspring=input.nextInt();
			this.sum=sum+this.offspring;
			System.out.println("Please enter Expense for Animal "+ (i+1));
			this.expense=input.nextInt();
			this.sum1=sum1+this.expense;
			
		}
		System.out.println(this.sum);
		System.out.println(this.sum1);
	}
}
