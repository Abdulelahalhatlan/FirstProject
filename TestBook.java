import java.util.Scanner;
public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		Book B = new Book();
		System.out.println("Please, enter the book details #ISBN, author, title, and  genre.");
			
			B.ISBN=input.nextInt();
			B.author=input.next();
			B.title=input.next();
			B.genre=input.next();
			boolean ok=B.verifyISBN(B.ISBN);
			
			if(ok)
			{
				
				System.out.println(B.toString());
				System.out.println("The book reference is :"+B.generateReference());
				
				
			}
			else
				System.out.println("Invalid ISBN");
				
					
			
	}

}
