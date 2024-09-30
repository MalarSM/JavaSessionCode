package javasessions;

public class EmployeeSheet {
	
	//Method overloading: is also called poly(many) +morphism(form): complieTime(static)
	//within the same class if we have multiple methods:
	// with the same method name
	//with the different number of parameters
	//with the different sequence of parameters(if no of parameters are same)
	//return type doesn't matter here
	
	public int test() {//0 param
		System.out.println("test 1 method");
		return 100;
	}
    public double test(int a) {//1 param
    	System.out.println("test 2 method");
		return 12.99;
    }
    public void test(String x) {//1 param
    	System.out.println("test 3 method");
    }
    public void test(String x, String y) {//2 param
    	System.out.println("test 4 method");
    }
    public void test(String a, int b) {
    	System.out.println(a+b);
    }
   public int test(int a, String b) {
    	return 100;
    }
   
   //Use cases:
   //login  
   
   public void login() {
	   
   }
   public void login(String un, String pwd) {
	   
   }
   public void login(String un, String pwd, int otp) {
	   
   }
   
   //search:
  public void search() {
	   
   }
   public void search(String name) {
	   
   }
   public void search(String name, String color) {
	   
   }
   public void search(String name, String color, int price) {
	   System.out.println("Search with: "+name+" "+color+" "+price);
   }
   
   //payment:
   public void doPayment(String upi) {
	   
   }
   public void doPayment(String cc, int cvv) {
	   
   }
   public void doPayment(String cc, int cvv, int otp) {
	   
   }
   
  //uber:
   //CarBooking:
   public void carBooking(String stPoint, String endPoint) {
	   
   }
   public void carBooking(String carType,String stPoint, String endPoint) {
	   
   }

   public void carBooking(String carType,String stPoint, String endPoint, int passenger) {
	   
    }
   //
   public double calculateTax(int totalIncome, int bonus) {
	   System.out.println("Calculating Tax");
	   
	   double totalTax = (totalIncome*30)/ 100 + (bonus*30)/ 100;
	   return totalTax;
	   
   }
   public double calculateTax(int totalIncome, int bonus, int stocksProfit) {
	   System.out.println("Calculating Tax");
	   
	   double totalTax = (totalIncome*30)/ 100 + (bonus*5)/ 100 + (stocksProfit*2)/100;
	   return totalTax;
	   
   }
   
   //void with blank return
   public void click(String element) {
	   System.out.println("clicking on element : "+ element);
	   return;
   }
	public static void main(String[] args) {
		EmployeeSheet obj = new EmployeeSheet();
		obj.test(100);
		obj.test("Malar");
		obj.test("Mukil","Navi");
		obj.test("Mukil",34);
		obj.search("Tshirt", "Black", 2000);
		
		double tax = obj.calculateTax(10000000, 300000);
		System.out.println(tax);

	}
}
