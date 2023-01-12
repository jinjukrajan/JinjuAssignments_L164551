package JavaTraining_Library;

import java.util.Scanner;



public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 int choice;
		
		LibraryMethods ob=new LibraryMethods();
		do {
			choice= ob.Menu();
			switch (choice) {
			 
            // Case
        case 1:
        	Librarybook b = new Librarybook();
        	
            ob.addBook(b);
            break;
            
        case 2:
        	 System.out.println("Enter Book Title to search:");
		        String Title = input.nextLine();
           int result1= ob.searchBook( Title);
           if(result1==0)
        	   System.out.println("No search result");
           else
        	   System.out.println("search result provided");
            break;
            
        case 3:
        	
        	System.out.println("Enter ISBN Number:");
	        String ISBN = input.nextLine();
	        int result2=ob.getBookDetails( ISBN);
	        if(result2==0)
	        	   System.out.println("No search result");
	           else
	        	   System.out.println("search result provided");
	           
        	
        	break;
        	
        case 4:
        	
        	ob.listAllBooks();
        	break;
        	
        
			}
			
		}while(choice != 0);
		


	}

}
