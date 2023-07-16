package File6_Recursion.Scripts;
import java.util.Scanner;
import java.util.ArrayList;
class library{
	public String[] books = new String[10];
	public String a;
	public boolean NA = false;
	public String issue_book, book;
	public String isavailable = "Not Available";
	public int token;
	
	public void addbook(String a) {
//		if (books[books.length-1] != null) {
//			System.out.println("Storage full!!!");
//		}else if (books[books.length-1] == null){
//			for (int j=0; j<books.length; j++) {
//				if(books[j] != null) {
//					books[j] = a;
//				}
//			}
//			
//		}

		if(books[books.length-1] == null) {
			for(int j=0; j<books.length; j++) {
				if(books[j] == null) {
					books[j] = a;
					break;
				}else {
					continue;
				}
			}
		}
		
		
//		for(int i=0; i<books.length; i++) {
//			if(books[i] == null) {
//				books[i] = a;
//				break;
//			}else {
//				continue;
//			}
//			
//		}
	
	}//addbook() end

	public void issuebook(String book){
		
		for(int i=0; i<books.length; i++) {
			if(books[i] == book) {
				books[i] = null;
				break;
			}else {
				continue;
			}
		}
		
		/*
		for (int i = 0; i<books.length; i++) {
			if(books[i] == book) {
				//issue_book = books[i];
				books[i] = null;
				NA = false;
				token = i;
				break;
			}else {
				NA = true;
			}
		}
//		if(NA == false) {
//			return true;
//		}else {
//			return false;
//		}

		System.out.println("I am running!!");
		for(int j=0; j<books.length; j++) {
			if(books[j] == book) {
				books[j] = null;
			}
		}
		System.out.println("I am still running!!");
		*/
//		for (int i=0; i<books.length; i++) {
//    		if(books[i] == book) {
//    			System.out.println("fuck it!!");
//    			books[i] = null;
//    			break;
//    		}else {
//    			System.out.println("FUckk offf");
//    			continue;
//    		}
//    	}
//		for (int i=0; i<books.length; i++) {
//			if(books[i] != book) {
//				System.out.println("If part");
//				continue;
//			}else {
//				books[i] = null;
//				System.out.println("Else part");
//				break;
//			}
//		}
		
	}//issuebook() end
	
	public int token_num() {
		return token;
	} 
	
	public boolean returnbook(int t, String b) {
		//Use token for returning the book to the place where it was!!!
		boolean available = false;
		boolean toreturn = true;
		for(int k=0; k<books.length; k++) {
			if(books[k] == b) {
				available = true;
			}else {
				available = false;
			}
		}
		
		if(available == false) {
			if(books[t] == null) {
				books[t] = b;
				toreturn = true;
			}else {
				toreturn = false;
			}
		}
		return toreturn;
		
		
//		if(books[t] == null) {
//			books[t] = b;
//			return true;
//		}else{
//			return false;
//		}
//

	}//returnbook() end
	public void showbooks() {
		System.out.println("These are the available books in the library right now!!!");
		for(int i=0; i<books.length; i++) {
			System.out.println("Book " + i + " : " + books[i]);
		}
	
	}//showbooks() end

}//class library end

public class Big_Ex_4_Library {
	public static void main(String[] args) {
		// You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
		int cont = 2;
		String toissue, toreturn;
		int token2, token3;
		Scanner sc = new Scanner(System.in);
		library lobj = new library();
		do {
			System.out.println("What you want to do: \n\t1. Donate the book. \n\t 2. Issue a book."
					+ " \n\t 3. Return a book. \n\t4. Show Available books.");
			int next_action = sc.nextInt();
			switch(next_action) {
			case 1:
				System.out.println("Enter the Book name: " );
				String new_book = sc.next();
				lobj.addbook(new_book);
				break;
			case 2: 
				lobj.showbooks();
				System.out.println("Choose a book from above list and enter the exact name!");
				toissue = sc.next();
//				if(lobj.issuebook(toissue)) {
//					token2 = lobj.token_num();
//					System.out.println("The book you ordered is given to you with the token number :" 
//							+ token2);
//					System.out.println("\t\tHappy Reading!!!");
//				}
				lobj.issuebook(toissue);
				break;
			case 3:
				System.out.println("Enter the book name you want to retun and the token number!!");
				toreturn = sc.next();
				token3 = sc.nextInt();
				
				if(lobj.returnbook(token3, toreturn)) {
					System.out.println("\t\tVisit Again!!!");
				}else {
					//lobj.addbook(toreturn);
				}
				break;
			case 4:
				lobj.showbooks();
				break;	 
			}
			
			
			System.out.println("Do you want 2 continue!!! \n\t1. Yes\n\t 2. No");
			cont = sc.nextInt();
		}while(cont == 1);
		
	}// main end

}// main class end
