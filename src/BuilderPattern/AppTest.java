package BuilderPattern;

public class AppTest {

	public static void main(String[] args) {
		Application app = new Application();
		
		//workflow chain scenarios
		//1.
		app.login("malar@test.com", "test@123")
		  .search("macbook")
		    .addToCart("macbook pro")
		      .doPayment("malar@okBoA")
		        .generateOrder()
		          .logout();
		
		//2.
				app.login("malar@test.com", "test@123")
				  .search("tshirt", 500)
				    .addToCart("nike tshirt")
				       .logout();
				
				//3.
				app.login("malar@test.com", "test@123")
				  .search("tshirt", 500)
				    .addToCart("nike tshirt")
				    .doPayment("5678 5678 2345 9999", 234)
				      .generateOrder()
				       .logout();
				
				//4.
				app.login("malar@test.com", "test@123")
				 .logout();
				

				//5.
				app.login("malar@test.com", "test@123")
				    .search("tshirt", 500)
				    .logout();
				
				
				
				
				
	}

}
