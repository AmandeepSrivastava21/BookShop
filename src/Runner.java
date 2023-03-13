

import com.service.BookService;
import com.service.UserService;
import com.to.BookTO;
import java.util.*;

public class Runner {
public static void main(String[] args) throws Exception {
		
		UserService service = new UserService();
		BookService bookService = new BookService();
		Scanner sc=new Scanner(System.in);
		int choice;
		boolean flag=true;
		
		while(flag) {
			System.out.println("Press 1 for user");
			System.out.println("press 2 for admin");
			System.out.println("Press 0 for exit");
		    choice=sc.nextInt();
			switch(choice) {
			case 1:
				while(flag) {
				System.out.println("Press 1 for Registration and 2 for login and 0 for exit");

				choice = sc.nextInt();

				switch (choice) {

				case 1:

					service.register();

					break;

				case 2:

					if( service.login() == 1) {
						
						System.out.println("Welcome to Global Logic Book Store...");
						
						List<BookTO> books = bookService.getAllBooks();
						
						for(BookTO to : books) {
							
							System.out.println(to.getId()+", "+to.getName()+", "+to.getPrice());
							
						}
						
						
					}
					else {
						
						System.out.println("Wrong Credentials...");
					}
					break;
					
				case 0:
					System.out.println("Logged-out Successfully...");
					flag=false;
					break;
				}
			}
			flag=true;
			break;	
				
				
				
			case 2://admin ke andr
				while(flag) {
					
					System.out.println("Press 1 for login  and Press 0 for back");
					choice=sc.nextInt();
					switch(choice) {
					case 1:
						if(service.AdminLogin()==1) {
							System.out.println("Hello Admin i'm all yours");
							while(flag) {
								System.out.println("Press 1 for add book and Press 0 for loggedout");
								choice=sc.nextInt();
								switch(choice) {
								case 1:
									bookService.addBook();
								    break;
								case 0:
									flag=false;
								
								
								}
								
							}
							flag=true;
						}
					
					break;
					case 0:
						flag=false;
						
					
					
					
					}
					
					
					
					
					
				}
			flag=true;
			break;
			
			case 0:
				
				flag=false;
				System.out.println("all Exit for restart please rerun the program");
				break;
			
			
			
			
			
			
			
			
			
			
			
			}	
	 
	
		
		
		
	}
			
			
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


