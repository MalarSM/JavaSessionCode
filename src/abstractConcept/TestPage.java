package abstractConcept;

public class TestPage {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();//default class constr.. --> child class default
		//LoginPage lp1 = new LoginPage(5);//default class constr.. --> child class param default
		
		lp.title();
		lp.url();
		lp.loading();
		lp.doLogin();
		lp.displayLogo();
		
		//cannot create the object of abstract class
		//Page p = new Page();
		
		//Top casting
		//child class object can be referred by abstract parent class ref var
//         Page p = new LoginPage();
//         p.title();
//         p.url();
//         p.loading();
//         p.displayLogo();
	}

}
