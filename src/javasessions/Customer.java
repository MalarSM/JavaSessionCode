package javasessions;

public class Customer {
	
	//Req: Write a function
	//create a function:This will return the customer marks on the basis of given customer name
	//name : getCustomerMarks(String name)
	//return : marks(int)
	
	
	public int getCustomerMarks(String name) {
	
		System.out.println("Customer name is :" + name);
		if(name.trim().equalsIgnoreCase("Mukil")) {
			return 90;
		}
		else if(name.trim().equalsIgnoreCase("Navir")) {
			return 10;
		}
		else if(name.trim().equalsIgnoreCase("Malar")) {
			return 50;
		}
		else {
			System.out.println("Please pass the right customer name.." + name);
			return -1;
		}
	}

	public static void main(String[] args) {
		
      Customer c = new Customer();
      int marks = c.getCustomerMarks("Navir");
      System.out.println(marks);
      
      if(marks>=0) {
    	  System.out.println("Print the marksheet");
    	  
      }
	}

}
