package JavaTraining_Library;


import java.util.Scanner;





public class LibraryMethods {
	

	Librarybook Booksdetail[] = new Librarybook[10];
		 static Scanner input = new Scanner(System.in);
		 public static int count;
		int j;
	
		
		 public static  int Menu()
		    {
		System.out.println(" PRESS following options");
		
		System.out.println("1 - Add book");
		
		System.out.println("2 - Search Book By Title");
		System.out.println("3 - Search Book By ISBNNO");
		System.out.println("4 - Display All Books");
		 int userinp=input.nextInt();
		
		return userinp;
		    }
		 
		 
		 public void addBook(Librarybook b)
		    {
		
		 
		        if (count < 10) {
		       	 
		        	Booksdetail[count] = b;
		            count++;
		        }
		        else {
		        	System.out.println("Max Book capacity has been reached");
		        }
		       
		    }
		 
		 public int searchBook(String Title)
		 {
			 int r=0;
			 
			
		        System.out.println(
			            "ISBNNumber\t\tAuthor\t\tNo of page\t\tTitle");
			 
			        for (int i = 0; i < count; i++) {
			 
			            
			            if (Title.equalsIgnoreCase(
			            		Booksdetail[i].Title)) {
			 
			               
			                System.out.println(
			                		Booksdetail[i].ISBNNumber + "\t\t\t\t"
			                    + Booksdetail[i].Author + "\t\t"
			                    + Booksdetail[i].NumberOfPages + "\t\t"
			                    + Booksdetail[i].Title + "\t\t");
			                  
			                r++;
			            }
			
		            }
			        return r;
			        
              }

		 
		 public int getBookDetails(String ISBN) {
			 
			 int r=0;
			 System.out.println(
			            "ISBNNumber\t\tAuthor\t\tNo of page\t\tTitle");
			 
			        for (int i = 0; i < count; i++) {
			 
			           
			            if (ISBN.equalsIgnoreCase(
			            		Booksdetail[i].ISBNNumber)) {
			 
			               
			                System.out.println(
			                		Booksdetail[i].ISBNNumber + "\t\t\t"
			                    + Booksdetail[i].Author + "\t\t"
			                    + Booksdetail[i].NumberOfPages + "\t\t"
			                    + Booksdetail[i].Title + "\t\t");
			                  
			                r++;
			            }
			
			        }
			        return r;
		 }
		 
		 public void listAllBooks() {
			 System.out.println(
			            "ISBNNumber\t\tAuthor\t\tNo of page\t\tTitle");
			 
			        for (int i = 0; i < count; i++) {
			 
			           
			                System.out.println(
			                		Booksdetail[i].ISBNNumber + "\t\t\t"
			                    + Booksdetail[i].Author + "\t\t\t"
			                    + Booksdetail[i].NumberOfPages + "\t\t"
			                    + Booksdetail[i].Title + "\t\t");
			            }
		 }
		 
		 
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//jinju
		//   addbook(); 
//		for(int i=0;i<books.length;i++) {
//			books[i]=new Librarybook();
//			System.out.println("Enter Book Title");
//	        books[i].setTitle(input.nextLine());
//	        System.out.println();
//	        System.out.println("Enter Author Name");
//	        books[i].setAuthName(input.nextLine());
//	        System.out.println();
//		}
//		
//		        
//		    
//
//	private static void addbook() {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		Librarybook[] books = new Librarybook[2] ;
//		for(int i=0;i<books.length;i++) {
//			books[i]=new Librarybook();
//			System.out.println("Enter Book Title");
//	        books[i].setTitle(input.nextLine());
//	        System.out.println();
//	        System.out.println("Enter Author Name");
//	        books[i].setAuthName(input.nextLine());
//	        System.out.println();
//	        
//	        
//	}
//		
//	}
//}



	
	


