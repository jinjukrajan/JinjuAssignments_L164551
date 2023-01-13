package javaTraining_Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class ZooMain  {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		ZooMethods zm2=new ZooMethods();
		ZooMethods zm3=new ZooMethods();
		Anilmal anm2 = new Anilmal();
		String enclosure4;
		int choice;
		do {
			ZooMethods zm=new ZooMethods();
			choice= zm.displayMenu();
			
			switch (choice) {
		case 1:
			ZooMethods zm1=new ZooMethods();
		Enclosure enclosure=new Enclosure();
		zm1.addEnclosure(enclosure);
		break;
		
		case 2:
			
			System.out.println("Please enter the enclosure name to add the new animal");
			String encname=input.nextLine();
			System.out.println("Please enter animalType");
			String typea=input.nextLine();
			 anm2.AnilmalDetails(encname,typea);
			zm2.addAnimal( anm2);
			
			break;
			
		case 3:
			System.out.println("Please enter the enclosure name to calculate offspring");
			enclosure4 =input.nextLine();
			anm2.calculateOffspring(enclosure4);
			break;
			
			case 4:
				System.out.println("Please enter the enclosure name to calculate offspring");
				enclosure4 =input.nextLine();
				anm2.calculateExpenses(enclosure4);
				break;
			case 5:
				
				System.out.println("Please enter the enclosure name ");
				enclosure4 =input.nextLine();
				System.out.println("Please enter animalType");
				String typeanml=input.nextLine();
				anm2.getAnimalByType(enclosure4, typeanml);
				break;
			case 6:
				zm3.listAllEnclosures();
				break;
		}
			
		}while(choice!=0);
			
		
			
	}	
	
}
//		ZooMethods zm;
//		// TODO Auto-generated method stub
//		System.out.println(" Eter no of enclosures to add");
//		int n=input.nextInt();
//		do {
//			System.out.println("Enter the Enclosure names");
//			String en=input.nextLine();
//	 zm=new ZooMethods(en);
//	 n--;
//		}while(n!=0);
//		zm.displayenclosure();
//	}


