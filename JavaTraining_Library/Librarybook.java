package JavaTraining_Library;

import java.util.Scanner;

public class Librarybook {

	public String Title;
	public String Author,ISBNNumber;
	public int  NumberOfPages;
	Scanner input = new Scanner(System.in);
	//int count=0;
	
	public  Librarybook() {
System.out.println("Please enter book Title");
		
		
	this.Title = input.nextLine();
	System.out.println("Please enter Author Name");
	
	
	this.Author = input.nextLine();
System.out.println("Please enter ISBN Number");
	
	
	this.ISBNNumber = input.nextLine();
	
System.out.println("Please enter no of pages");
	
	
	this.NumberOfPages = input.nextInt();
	
	
	}}
	
	

