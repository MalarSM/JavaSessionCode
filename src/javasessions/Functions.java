package javasessions;

public class Functions {

	//1.no input and no return:
	//non - static
	//void -- no return, function does not return anything(no return keyword)
	public void test() {//0 parameter
		System.out.println("test method");
	}
	public void Calc() {//0 parameter
		System.out.println("Calc method");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	//2.no input but some return:
	//return type : int is the return type
	//Void and return cannot be together
	public int getMyNumber() {//0 param
		System.out.println("get number");
		int fee = 100;
		int tax = 20;
		int totalFee = fee + tax;
		return totalFee;
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		return "Naveen";
	}
	
	public boolean isUserActive() {
		System.out.println("checking user status");
		return true;
		
	}
	
	//3. some input and no return:
	//example: click method
	public void add(int a, int b) {//2 params
		System.out.println("adding two numbers");
		int sum = a+b;
		System.out.println(sum);
		
	}
	
	//4.some input and then return:
	
	public int addition(int a, int b) {
		System.out.println("addition two int numbers");
		int s = a+b;
		return s;
	}
	
	public static void main(String[] args) {
		
		//create the object:
       Functions obj = new Functions();
       obj.test();
       obj.Calc();
       int t = obj.getMyNumber();
       System.out.println(t);
       
       String tr = obj.getTrainerName();
       System.out.println(tr);
       
       boolean flag =obj.isUserActive();
       System.out.println(flag);
       
       if(flag) {
    	   System.out.println("login to app");
       }
       
       obj.add(10, 20);//10 and 20 are arguments
       //
       
      int p = obj.addition(20, 20);
      System.out.println(p);
	}

}
