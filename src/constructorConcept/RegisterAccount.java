package constructorConcept;

public class RegisterAccount {
	
	String firstName;
	String lastName;
	String email;
	String mobileNumber;
	String pwd;
	String pwdConfirm;
	boolean newsSubscribe;
	
	public RegisterAccount(String firstName, String lastName, String email, String pwd, String pwdConfirm) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pwd = pwd;
		this.pwdConfirm = pwdConfirm;
	}
    
	public RegisterAccount(String firstName, String lastName, String email, String mobileNumber, String pwd,
			String pwdConfirm) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.pwd = pwd;
		this.pwdConfirm = pwdConfirm;
	}

	public RegisterAccount(String firstName, String lastName, String email, String mobileNumber, String pwd,
			String pwdConfirm, boolean newsSubscribe) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.pwd = pwd;
		this.pwdConfirm = pwdConfirm;
		this.newsSubscribe = newsSubscribe;
	}

	public static void main(String[] args) {
		
		RegisterAccount r1 = new RegisterAccount("Malar","Sam","abc@g.com","abc1","abc1");
		RegisterAccount r2 = new RegisterAccount("Mike","Clay","a1c@g.com","99999999","abc12","abc12");
		RegisterAccount r3 = new RegisterAccount("Mark","John","ac2@g.com","99900999","abc12","abc12", true);
		
		System.out.println(r1.firstName+" "+r1.lastName+" "+r1.email+" "+r1.mobileNumber+" "+r1.pwd+" "+r1.pwdConfirm+" "+r1.newsSubscribe);
		System.out.println(r2.firstName+" "+r2.lastName+" "+r2.email+" "+r2.mobileNumber+" "+r2.pwd+" "+r2.pwdConfirm+" "+r2.newsSubscribe);
		System.out.println(r3.firstName+" "+r3.lastName+" "+r3.email+" "+r3.mobileNumber+" "+r3.pwd+" "+r3.pwdConfirm+" "+r3.newsSubscribe);
	}

}
