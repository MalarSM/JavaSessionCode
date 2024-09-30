package abstractConcept;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LoginPage constructor ... default");
	}
	

	public LoginPage(int a) {
		System.out.println("LoginPage constructor " + a);
	}

	@Override
	public void title() {
		System.out.println("Login Page title");	
	}

	@Override
	public void url() {
		System.out.println("Login Page url");
	}
	@Override
	public void loading(){
		System.out.println("Page loading 5s");
	}
	
	//individual
	public void doLogin(){
		System.out.println("login to page");
	}


}
